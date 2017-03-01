package fr.bdss.jersey.main;

import java.io.File;
import java.util.Optional;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import fr.bdss.jersey.method.PropertyMethod;

public class Main {
    
    public static final Optional<String> port = Optional.ofNullable(System.getenv("PORT"));
    
    public static void main(String[] args) throws Exception {

    	String apachePort = PropertyMethod.getPropValue("fr.bdss.jersey.apache_port");

    	// Define a folder to hold web application contents.
    	String webappDirLocation = "WebContent/";
        //String contextPath = "/Heroku3scale";
        
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.valueOf(port.orElse(apachePort)));
        
        // Define a web application context.
        Context context = tomcat.addWebapp("/Heroku3scale", new File(
               webappDirLocation).getAbsolutePath());

        // Define and bind web.xml file location.
        File configFile = new File(webappDirLocation + "WEB-INF/web.xml");
        context.setConfigFile(configFile.toURI().toURL());
        
        tomcat.start();
        tomcat.getServer().await();
    }
}