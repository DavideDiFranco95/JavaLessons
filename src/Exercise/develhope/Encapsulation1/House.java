package Exercise.develhope.Encapsulation1;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class House {
    private int floorNumbers;
    private String address;
    private String[] residentNames;

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String[] getResidentNames() {
        return residentNames;
    }

    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
}
