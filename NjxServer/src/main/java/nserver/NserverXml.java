package nserver;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class NserverXml {

    public static void main(String[] args) throws Exception {
        Server server=new Server(8200);

        ResourceHandler resourceHandler=new ResourceHandler();
        resourceHandler.setResourceBase("C:\\Users\\JasonNee\\Documents\\webframe\\test_1.html");

        resourceHandler.setDirectoriesListed(true);
        server.setHandler(resourceHandler);
        server.start();
    }

}
