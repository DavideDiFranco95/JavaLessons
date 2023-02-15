package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriterAndReadMethodC implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath)
                //il FileOutputStream si può usare anche per immagini.
        ){
            fileOutputStream.write(s.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                ){
            byte[] bytesFromFile = fileInputStream.readAllBytes();
            System.out.println(new String(bytesFromFile)); //per convertire un Array di Bytes in String
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
