package Exercise.develhope.Encapsulation1;


public class House {
    private int floorNumbers;
    private String address;
    private String[] residentNames;

    public House(int floorNumbers, String address, String[] residentNames) {
        this.floorNumbers = floorNumbers;
        this.address = address;
        this.residentNames = residentNames;
    }

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
