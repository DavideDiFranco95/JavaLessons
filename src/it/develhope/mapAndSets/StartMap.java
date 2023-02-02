package it.develhope.mapAndSets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StartMap {

    public static void main(String[] args) {
        Map<String,User> myNewMap = new HashMap<>();
        // <String,CHIAVE> nomeObj  = new HashMap<>();
        myNewMap.put("lorenzo@develhope.com", new User("lorenzo@develhope.com","Lorenzo","lorenzoDev"));
        myNewMap.put("gloria@develhope.com", new User("gloria@develhope.com","Gloria","gloriaDev"));
        myNewMap.put("1marco@develhope.com", new User("marco@develhope.com","Marco","marcoDev"));
        myNewMap.put("2marco@develhope.com", new User("marco@develhope.com","Marco","marcoDev"));
        myNewMap.put("3marco@develhope.com", new User("marco@develhope.com","Marco","marcoDev"));
        myNewMap.put("4marco@develhope.com", new User("marco@develhope.com","Marco","marcoDev"));

        //myNewMap.put("marco@develhope.com", new User("marco@develhope.com","Marco","marcoDev"));
        //Se si fanno due oggetti uguali in Map, ci sarà una sovrascrittura.
        //Se la CHIAVE cambia negli oggetti duplicati si potranno avere ma verranno piazzati random.

        //come prendere un oggetto Map? con .get(oggettoMappa)
        User gloria = myNewMap.get("gloria@develhope.com"); //maniera dichiarativa
        //aggiungere la Map in una collezione. serve per un ciclo For
        //myNewMap.values().stream();

        System.out.println("-----------------------------------------------");
        //per ogni elemento della mappa.. ForEach
        myNewMap.forEach((key,value)->{
            //dentro una mappa itererai su CHIAVE,VALORE 2 info invece di 1.
            System.out.println("The single value is " + key + " - - " + value);
        });

        System.out.println("-----------------------------------------------");

        myNewMap.remove("lorenzo@develhope.com");
        myNewMap.replace("4marco@develhope.com",new User("marco@develhope.comXX","MarcoXX","marcoDevXX"));
        //differenza fra put e replace
        //put= se trova la chiave, inserisce.
        //replace= se non trova niente(chiave), passa avanti ignorando il comando.

        myNewMap.forEach((key,value)->{
            System.out.println("The single value is " + key + " - - " + value);
        });
        System.out.println("-----------------------------------------------");

        Set<String> keys = myNewMap.keySet();
        keys.forEach(key->{
            User value = myNewMap.get(key);
            System.out.println("The single value is " + key + " - - " + value);
        });
        //per capire quale chiave.
        System.out.println("-----------------------------------------------");

        //myNewMap.values().stream().forEach(); //e così via ma è SCONSIGLIATO
        myNewMap.clear(); //cancella tutti gli oggetti della mappa
    }
}
