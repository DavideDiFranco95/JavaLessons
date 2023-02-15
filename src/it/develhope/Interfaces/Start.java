package it.develhope.Interfaces;

import it.develhope.Interfaces.concrete.WriteAndReadOnTemporary;
import it.develhope.Interfaces.concrete.WriterAndReadMethodD;
import it.develhope.Interfaces.concrete.WriterAndReadMethodE;

public class Start {
    public static void main(String[] args) {

        String stringToWrite = "Lorem ipsum";
        String fileToWrite = "C:\\Users\\David\\OneDrive\\Desktop" +
                "\\Develhope\\loren\\develhopeFile.txt";
        //METODO A
        //WriteAndReader wrA = new WriteAndReadMethodA();
        //wrA.write(stringToWrite,fileToWrite);
        //wrA.read(fileToWrite);

        //METODO B
        //WriteAndReadMethodB wrB = new WriteAndReadMethodB();
        //wrB.write(stringToWrite,fileToWrite);
        //wrB.read(fileToWrite);

        //METODO C
        //WriteAndReadMethodC wrC = new WriteAndReadMethodC();
        //wrC.write(stringToWrite,fileToWrite);
        //wrC.read(fileToWrite);

        //METODO D
        //WriterAndReadMethodD wrD = new WriterAndReadMethodD();
        //wrD.write(stringToWrite,fileToWrite);
        //wrD.read(fileToWrite);

        //METODO E
        //WriterAndReadMethodE wrE = new WriterAndReadMethodE();
        //wrE.write(stringToWrite,fileToWrite);
        //wrE.read(fileToWrite);

        //METODO TEMPORARY
        //WriterAndReader wr = new WriterAndReadMethodE();
        //wr.write(stringToWrite,fileToWrite);
        //wr.read(fileToWrite);

        WriteAndReadOnTemporary.write(stringToWrite);
    }
}
