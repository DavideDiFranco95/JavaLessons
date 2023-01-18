package Exercise.develhope.DefaultMethodsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    public String priceType;
    public double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice smartphonePrice=(SmartphonePrice)super.clone();
        return smartphonePrice;
    }

    @Override
    public String toString() {
        return priceType+ " " +priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice smartphonePrice = (SmartphonePrice) o;
        return Double.compare(smartphonePrice.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, smartphonePrice.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice(String priceType, double priceInEuros){
        this.priceType=priceType;
        this.priceInEuros=priceInEuros;
    }
}
