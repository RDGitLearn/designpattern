package creational.prototype;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.1.1");
        networkConnection.loadCostlyData();
        networkConnection.setDomains(new ArrayList<>());
        networkConnection.getDomains().add("www.xys.com");
        networkConnection.getDomains().add("www.my.com");
        networkConnection.getDomains().add("www.tests.com");
        networkConnection.getDomains().add("www.creational.prototype.com");
        networkConnection.getDomains().add("www.gov.in");


        try {
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
            networkConnection1.getDomains().remove(2);
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }


}
