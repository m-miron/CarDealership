package com.yu.dealership;

public class ContractFileManager {
    String contractFilename;
    public ContractFileManager (String contractFilename) {
        this.contractFilename = contractFilename;
    }

    public void saveContract (Contract c) {
        //Write to file
        //c.getSameString() is what we write to file (if-else?)
    }
}
