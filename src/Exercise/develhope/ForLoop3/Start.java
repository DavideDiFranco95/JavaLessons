package Exercise.develhope.ForLoop3;

public class Start {
    public static void main(String[] args) {
        String[] arr = new String[]{"monday","tuesday","wednesday","thursday","friday"};
        for (int i=0;i < arr.length;i+=2){
            System.out.println(arr[i].toUpperCase());
        }
    }
}
