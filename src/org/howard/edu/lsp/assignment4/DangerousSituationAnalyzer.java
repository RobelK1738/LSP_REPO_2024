package org.howard.edu.lsp.assignment4;

public class DangerousSituationAnalyzer {
    public void analyzeData(String data) {
        String[] splitData = data.split(", ");
        int altitude = Integer.parseInt(splitData[2].split(": ")[1]);
        if (altitude < 5000) {
            System.out.println("Warning: Aircraft altitude too low! Dangerous situation detected.");
        }
    }
}
