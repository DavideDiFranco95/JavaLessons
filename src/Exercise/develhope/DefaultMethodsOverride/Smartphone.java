package Exercise.develhope.DefaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return brandName+ " " +modelName+ " " +batterymAh+ " " +producerPrice+ " " +retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return batterymAh == smartphone.batterymAh && Objects.equals(brandName, smartphone.brandName)
                && Objects.equals(modelName, smartphone.modelName)
                && Objects.equals(producerPrice, smartphone.producerPrice)
                && Objects.equals(retailPrice, smartphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartPhone= (Smartphone)super.clone();
        clonedSmartPhone.producerPrice=this.producerPrice.clone();
        clonedSmartPhone.retailPrice=this.retailPrice.clone();
        return clonedSmartPhone;
    }

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }
}
