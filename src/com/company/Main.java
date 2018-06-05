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
        FileFilter fileFilter = new WildcardFileFilter("*.pem");

        System.out.println("Cert files list:");

        File[] certFiles = sourceFolder.listFiles(fileFilter);
        for (int i = 0; i < certFiles.length; i++) {
            System.out.println(certFiles[i]);
        }



    }

}


//            public static void findUserFolders(String directoryName, ArrayList<File> userfiles) {
//        File userdirectories = new File(directoryName);
//
//        System.out.println(userdirectories);

//        // get all the files from a directory
//        File[] fList = userdirectories.listFiles();
//        for (File userfolders : fList) {
//
//            if (userfolders.isFile()) {
//                files.add(userfolders);
//            } else if (userfiles.isDirectory()) {
//                listUserFolders(userfiles.getAbsolutePath(), userfiles);
//            }
//        }



  /* public static void copyCertFile() {


        File clientcertfile = new File("C:/Users/%CURRENTUSER%/AppData/Roaming/Lightspeed/NXTClient/NXTClient/acemotor.pem");
        if (clientcertfile.exists();
        {
            clientcertfile.compareTo();

            String arr = clientcertfile.list();
            int n = arr.length;

            for (int i = 0; i < n; i++) {


            }
        }*/








