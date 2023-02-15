package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.*;

public class WriterAndReadMethodD implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try (
                OutputStream os = new FileOutputStream(filePath);
                DataOutputStream dos = new DataOutputStream(os);
                ){
            dos.writeChars(s); //NON USARLO. Si usa per scrivere altro non per stringhe
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                InputStream inputStream = new FileInputStream(filePath);
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                ){
            char c = dataInputStream.readChar();
            System.out.println(c);
            String cs = dataInputStream.readLine();
            System.out.println(cs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
