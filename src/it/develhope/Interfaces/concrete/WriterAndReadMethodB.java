package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.*;

public class WriterAndReadMethodB implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try(
                FileWriter writer = new FileWriter(filePath,false);
                //l'append (true o false) tiene le stringhe scritte in precedenza
                //oppure no.
                PrintWriter pw = new PrintWriter(writer);
                ){
            pw.write(s);
            pw.append("--------------------");
            pw.printf("Io sono Davide e ho %d anni %s", 28,"e sto male.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {

    }
}
