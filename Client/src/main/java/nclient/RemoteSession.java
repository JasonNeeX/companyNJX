package nclient;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import request.BasicRequest;

import java.io.IOException;

public class RemoteSession {

    String url;
    CloseableHttpClient httpclient;

    public RemoteSession(String url){
        this.url=url;
        httpclient= HttpClients.createDefault();
    }

    public String run(BasicRequest request) throws IOException {
        HttpPost httpPost=new HttpPost(url+"/method_1");
        httpPost.addHeader("Content-type","application/json; charset=utf-8");
        httpPost.setHeader("Accept", "application/json");
        httpPost.setEntity(new StringEntity(JSON.toJSONString(request)));

        ResponseHandler<String> responseHandler=new ResponseHandler<String>() {
            public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
                HttpEntity entity=httpResponse.getEntity();
                return EntityUtils.toString(entity,"UTF-8");
            }
        };
        String response=httpclient.execute(httpPost,responseHandler);

        return response;

    }


}
