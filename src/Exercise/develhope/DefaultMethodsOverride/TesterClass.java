package Exercise.develhope.DefaultMethodsOverride;

public class TesterClass {
    public static void main(String[] args) {
        SmartphonePrice retailPrice1= new SmartphonePrice("RetailPrice",600);
        SmartphonePrice retailPrice2= new SmartphonePrice("RetailPrice2",1200);
        SmartphonePrice producerPrice1= new SmartphonePrice("ProducerPrice1",450);
        SmartphonePrice producerPrice2= new SmartphonePrice("ProducerPrice2",1000);
        Smartphone smartphone1= new Smartphone("Xiaomi","RedMi Note 4",5000,producerPrice1,retailPrice1);
        Smartphone smartphone2= new Smartphone("IPhone","14",5000,producerPrice2,retailPrice2);

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());

        if(smartphone2.equals(smartphone1)){
            System.out.println("The Smartphones are Equals");
        }else{
            System.out.println("The Smartphones are not Equals");
        }
        try{
            Smartphone clonedSmartPhone= smartphone2.clone();
            System.out.println(clonedSmartPhone.toString());
            if(clonedSmartPhone.equals(smartphone2)){
                System.out.println("The Cloned SmartPhone is Equal");
            }else{
                System.out.println("The Smartphones are not Equals");
            }
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }
    }
}
