package Exercise.develhope.Streams02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Start implements WriteAndRead{
    public static void main(String[] args) {
        String fileToWrite = "C:\\Users\\David\\IdeaProjects\\JavaLessons\\src\\File.txt";
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId la = ZoneId.of("Europe/Rome");
        String stringToWrite = dateTime.toString();
        WriteAndRead wr = new Start();
        wr.write(stringToWrite,fileToWrite);
        wr.read(fileToWrite);
    }

    @Override
    public void write(String s, String filePath) {
        try(
                FileWriter writer = new FileWriter(filePath,true);
                ){
            writer.write(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);
                ){
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
