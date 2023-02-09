package it.develhope.WhileConstruct;

public class Start {
    public static void main(String[] args) {

        String[] myArrayOfStrings = new String[]{"one","two","three"};
        int i=0;
        while(i<myArrayOfStrings.length){
            //body che viene ripetuto ciclicamente
            System.out.println(myArrayOfStrings[i]);
            i++;
            //Da non fare. Usa il For per questo.
        }
        int a = 2;
        System.out.println("-------------------------");
        while(a<100){
            a= a*2; // a*=2;
            System.out.println("The value of A is " + a);
        }
        // Se si vuole fare più di un test, inserire il a = 2;
        a = 2;
        System.out.println("-------------------------");
        while(true){ //bad practice. NON FARLO.
            a= a*2; // a*=2;
            // a = a-2; //non farlo.. andrà all'infinito di negativi.
            System.out.println("The value of A is " + a);
            if (a>100) break; // mai togliere questo in caso.
        }
        a = 2;
        System.out.println("-------------------------");
        while(a<100){
            a= a*2; // a*=2;
            if (a > 50){
                System.out.println("Not printing but continue");
                continue;
            }
            System.out.println("The value of A is " + a);
        }
        System.out.println("-------------------------");
        Function f  = new Function();

        boolean isValueFound = false;
        double foundValue = -10000;
        int maxIterations = 10000;
        int k = 0;
        double x_start = -50;
        double delta = 0.5;

        double oldValue = f.getValue(x_start); // step 0
        while(!isValueFound && k < maxIterations){
            x_start += delta;
            k++;
            double newValue = f.getValue(x_start);
            System.out.println("Values " +  newValue + " - "+ oldValue+" - "+x_start+" Iteration: "+k);
            if (newValue==0 ||newValue * oldValue <= 0){
                isValueFound = true;
                foundValue = x_start;
            }else{
                oldValue = newValue;
            }
        }
        if (isValueFound){
            System.out.println("We found the zero " + foundValue);
        }else{
            System.out.println("We didn't find the zero ");
        }
        System.out.println("-----------------------------------");

        //while(condizione){} //sbagliato
        int index=10;
        do{
            System.out.println("Index is DO WHILE " +  index);
            index++;
        }while(index<5);
        System.out.println("-----------------------------------");
        index =10;
        while(index<5){
            System.out.println("Index is WHILE " +  index);
            index++;
        }
        System.out.println("-----------------------------------");
    }
}
