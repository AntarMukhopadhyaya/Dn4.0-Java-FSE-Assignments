package org.dn4;

public class MyService {
    private final ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String fetchData(){
        return api.getData();
    }
}
