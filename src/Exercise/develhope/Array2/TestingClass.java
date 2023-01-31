package Exercise.develhope.Array2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class TestingClass {
    public static void main(String[] args) {
        String[] aliceToDos = {"Coding","Reading","Learning"};
        String[] bobToDos = {"Reading","Coding","Learning","Sleeping"};
        String[] timToDos = {"Reading","Learning","Coding"};
        boolean areEquals = Arrays.equals(aliceToDos,bobToDos);
        boolean areEquals2 = Arrays.equals(aliceToDos,timToDos);
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        boolean areEquals3 = Arrays.equals(aliceToDos,bobToDos);
        boolean areEquals4 = Arrays.equals(aliceToDos,timToDos);
        System.out.println("Is Alice's array equal to Bob array? " + areEquals);
        System.out.println("Is Alice's array equal to Tim array? " + areEquals2);
        System.out.println("Is Alice's array having the same length of Bob's array? "+ (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));
        System.out.println("Is Alice having the same tasks of Bob? " + areEquals3);
        System.out.println("Is Alice having the same tasks of Tim? " + areEquals4);
    }
}
