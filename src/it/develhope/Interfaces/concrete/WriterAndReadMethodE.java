package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class WriterAndReadMethodE implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try (
                RandomAccessFile file = new RandomAccessFile(new File(filePath),"rw");
                FileChannel channel = file.getChannel();
                ){
            channel.tryLock(); //Chiude il file in modo che nessuno oltre te possa scriverci su.
            file.writeBytes(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                RandomAccessFile file = new RandomAccessFile(new File(filePath),"rw");
                ){
            //file.readLine(); Si può leggere una linea con questo finchè non solleverà un eccezione
            // si possono usare i length ecc con questo metodo
            String line = file.readLine();
            System.out.println(line);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
