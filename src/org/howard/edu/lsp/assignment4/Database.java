package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> aircraftData = new ArrayList<>();
    public void storeData(String data) {
        aircraftData.add(data);
    }
    public List<String> getAllData() {
        return aircraftData;
    }
    public String queryData(String aircraftType) {
        for (String data : aircraftData) {
            if (data.contains(aircraftType)) {
                return data;
            }
        }
        return "Aircraft not found";
    }
}
