package example;
import com.sun.net.httpserver.HttpServer; import java.net.InetSocketAddress;
public class Application { public static void main(String[] args)throws Exception{var s=HttpServer.create(new InetSocketAddress(8080),0);s.createContext("/health",e->{var b="{\"status\":\"ok\"}".getBytes();e.sendResponseHeaders(200,b.length);e.getResponseBody().write(b);e.close();});s.start();}}
