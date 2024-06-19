package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String costlyData;

    private List<String> domains=new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", costlyData='" + costlyData + '\'' +
                ", Domains " + domains + '\'' +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCostlyData() {
        return costlyData;
    }

    public void setCostlyData(String costlyData) {
        this.costlyData = costlyData;
    }

    public void loadCostlyData(){
        this.costlyData="Very Very Costly Data";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setCostlyData(this.getCostlyData());

        for(String s : this.getDomains()){
            networkConnection.getDomains().add(s);
        }

        return networkConnection;
    }
}
