package nclient;

import request.BasicRequest;

import java.io.IOException;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        RemoteSession session=new RemoteSession("http://127.0.0.1:8300/njx");
        String ss=session.run(new BasicRequest());

    }

}
