package com.sbt.validation.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import org.json.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Converter {

    public static String xmlToJson(String xmlMessage){
        return XML.toJSONObject(xmlMessage).toString();
    }

    public static String xsdToJsonSchema(String xsdSchema){
        //String pathToFutureJaxbClasses = PathConstants.PATH_TO_RESOURCES + File.separator + "jaxb_classes_from_xsd";
        String pathToFutureJaxbClasses = PathConstants.PATH_TO_JAVA_CODE;

        //creates folder for future Jaxb classes
        //createFolder(pathToFutureJaxbClasses);

        generateJaxbClasses(pathToFutureJaxbClasses);
        try {
            //Thread.sleep(7000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //add generated jaxb classes to classpath, else it's impossible to generate schema which relies on unaccessible
        // class. So we must make it accessible
        //addDirectoryToClasspath(pathToFutureJaxbClasses);

        return generateJsonScheme();
    }

    private static String obtainOsSpecificShellExecutionCommand(){
        String Os = System.getProperty("os.name");
        String shellExecutionCommand;
        if(Os.contains("Windows"))
            shellExecutionCommand = "cmd.exe /c ";
        else
            shellExecutionCommand = "bash -c ";

        return shellExecutionCommand;
    }

    private static void createFolder(String pathToFolder){
        String commandToCreateFolder = obtainOsSpecificShellExecutionCommand() + "mkdir " + pathToFolder;
        try {
            Process p = new ProcessBuilder((commandToCreateFolder).split(" ")).start();

            BufferedReader r = new BufferedReader(new InputStreamReader((p.getInputStream())));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void generateJaxbClasses(String pathToFutureJaxbClasses){
        String shellExecutionCommand = obtainOsSpecificShellExecutionCommand();
        String commandToGenerateClassesBasingOnXsd = shellExecutionCommand +
                //команда запуска jaxb компилятора, который, собственно, и предоставляет возможность сгенерировать классы
                //на основе xsd
                "xjc -d " + pathToFutureJaxbClasses + " " + PathConstants.PATH_TO_XSD_SCHEMA;

        try {
            Process p = new ProcessBuilder((commandToGenerateClassesBasingOnXsd).split(" ")).start();

            BufferedReader r = new BufferedReader(new InputStreamReader((p.getInputStream())));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null)
                    break;
                //System.out.println(line);
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void addDirectoryToClasspath(String pathToFutureJaxbClasses) {
        //TODO:переделать весь метод
        try {
            URL directory = new File(pathToFutureJaxbClasses).toURI().toURL();

            URLClassLoader sysloader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            Class sysclass = URLClassLoader.class;

            Method method = sysclass.getDeclaredMethod("addURL", new Class[]{URL.class});
            method.setAccessible(true);
            method.invoke(sysloader, new Object[]{directory});
        } catch (Exception ex){
            ex.printStackTrace();
        }

        //TODO:удалить эту проверку
        try{
            Class.forName("generated.NotifySMITZNOStatusRq");
            //Class.forName("com.sbt.validation.App");
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
            System.exit(1);
        }
/*        File directory = new File(pathToFutureJaxbClasses);
        try {
            Method method = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
            method.setAccessible(true);
            method.invoke(ClassLoader.getSystemClassLoader(), new Object[]{directory.toURI().toURL()});
        } catch (Exception ex){
            ex.printStackTrace();
        }*/

    }


    //TODO:масштабно отрефачить
    private static String generateJsonScheme(){
        //TODO:получать fullyQualifiedClassName динамически из верхнего тэга xml-сообщения
        String fullyQualifiedClassName = "generated.NotifySMITZNOStatusRq";
        //String fullyQualifiedClassName = generated.NotifySMITZNOStatusRq.class.getName();
        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
        ObjectMapper mapper = new ObjectMapper();
        String jsonScheme = null;
        try
        {
            mapper.acceptJsonFormatVisitor(mapper.constructType(Class.forName(fullyQualifiedClassName)), visitor);
            final com.fasterxml.jackson.module.jsonSchema.JsonSchema jsonSchema = visitor.finalSchema();
            //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
            jsonScheme = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
        }
        catch (ClassNotFoundException cnfEx)
        {
            System.err.println("Unable to find class " + fullyQualifiedClassName);
        }
        catch (JsonMappingException jsonEx)
        {
            System.err.println("Unable to map JSON: " + jsonEx);
        }
        catch (JsonProcessingException jsonEx)
        {
            System.err.println("Unable to process JSON: " + jsonEx);
        }
        return jsonScheme;
    }
}