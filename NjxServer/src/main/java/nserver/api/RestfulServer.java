package nserver.api;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("njx")
public class RestfulServer {

    public RestfulServer(){
        System.out.println("来了");
    }

    @POST
    @Path("method_1")
    public String getOne(){
        System.out.println("test_this");
        return "xeixie";

    }

}
