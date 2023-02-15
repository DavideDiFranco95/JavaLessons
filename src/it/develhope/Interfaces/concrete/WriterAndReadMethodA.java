package it.develhope.Interfaces.concrete;

import it.develhope.Interfaces.WriterAndReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WriterAndReadMethodA implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try(
                FileWriter writer = new FileWriter(filePath,true);
                BufferedWriter bw = new BufferedWriter(writer);
                ){

            bw.newLine();
            bw.append(s); //in aggiunta
            //bw.write(s); //scrivi
            bw.newLine(); //vai accapo
            bw.append(s);
            //bw.write(s); //scrivi
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try(
                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);
                ){
            System.out.println("--------------------------------");
            while(br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            System.out.println("--------------------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
