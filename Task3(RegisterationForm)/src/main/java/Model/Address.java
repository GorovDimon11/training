package Model;

public class Address {
    private int Index;
    private String City;
    private String Street;
    private int House;
    private int Flat;

    public Address(int index, String city, String street, int house, int flat) {
        this.Index = index;
        this.City = city;
        this.Street = street;
        this.House = house;
        this.Flat = flat;
    }
    public Address(){
    }

    public void setIndex(int index) {
        Index = index;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setHouse(int house) {
        House = house;
    }

    public void setFlat(int flat) {
        Flat = flat;
    }

}
