package ProtoType;

public class Adresses {
    public String Building;
    public String city;
    public String street;

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        this.Building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Adresses(String building, String city, String street) {
        this.Building = building;
        this.city = city;
        this.street = street;
    }

    public Adresses() {
    }
}
