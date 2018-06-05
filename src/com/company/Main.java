package com.company;

import java.io.*;
import java.util.ArrayList;
import org.apache.commons.io.filefilter.WildcardFileFilter;


public class Main {


    public static void main(String[] args) {

       findCertFolders();
    }


    public static void findCertFolders() {

        File sourceFolder = new File("/Users/kirkhamt/AppData/Roaming/Lightspeed/NXTClient");
        File destinationFolder = new File("/Users/kirkhamt/AppData/Roaming/Lightspeed/NXTClient Copy");
        FileFilter fileFilter = new WildcardFileFilter("*.pem");

        System.out.println("Cert files list:");

        File[] certFiles = sourceFolder.listFiles(fileFilter);
        for (int i = 0; i < certFiles.length; i++) {
            System.out.println(certFiles[i]);
        }



    }

}









