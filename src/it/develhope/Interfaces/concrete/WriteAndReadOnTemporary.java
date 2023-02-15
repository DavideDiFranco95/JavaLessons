package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.File;

public class WriteAndReadOnTemporary {
    public static String write(String stringToWrite){
        try {
            File fileToWrite = File.createTempFile("myTemporaryFile","suffisso");
            System.out.println("File directory" + fileToWrite.getAbsolutePath());
            WriterAndReader wr = new WriterAndReadMethodA();
            wr.write(stringToWrite,fileToWrite.getAbsolutePath());
            wr.read(fileToWrite.getAbsolutePath());
            return fileToWrite.getAbsolutePath();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
