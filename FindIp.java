import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class FindIp {
    public static void main(String[] args) {
        // find ip address using ipify.org

        String url = "http://api.ipify.org?format=text";
        System.out.println("Please wait while we fetch your IP address for ipify");

        sendGet(url);
    }

    public static void sendGet(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(url))
         .build();
         
         client.sendAsync(request, BodyHandlers.ofString())
         .thenApply(HttpResponse::body)
         .thenAccept(System.out::println)
         .join();
    }
}
