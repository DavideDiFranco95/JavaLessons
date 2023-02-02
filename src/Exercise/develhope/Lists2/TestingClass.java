package Exercise.develhope.Lists2;

import java.util.*;

public class TestingClass {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = Arrays.asList(1, 2, 4, 13, 26, 52);
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers);
        Set<Integer> set = new HashSet<>(randomNumbers.size());
        randomNumbers.removeIf(p-> !set.add(p));
        System.out.println(randomNumbers);
        randomNumbers.sort(Comparator.comparingInt(Integer::intValue));
        System.out.println(randomNumbers);


    }
}
