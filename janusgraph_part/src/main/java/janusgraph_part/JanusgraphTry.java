package janusgraph_part;

import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

public class JanusgraphTry {

    public static void main(String[] args){
        String path=System.getProperty("user.dir");
        String conf=path+"\\src\\main\\resource\\janusgraph.properties";
        JanusGraph graph= JanusGraphFactory.open(conf);


    }
}
