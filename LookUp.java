import java.net.*;

public class LookUp {
    public static void main(String[] args) {
        lookName("www.google.com");
    }

    static void lookName(String domain) {
        InetAddress[] address;
        try {
            address = InetAddress.getAllByName(domain);
            for (InetAddress server : address) {
                System.out.println(server);
            }
            // System.out.println(domain + " - IP: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
