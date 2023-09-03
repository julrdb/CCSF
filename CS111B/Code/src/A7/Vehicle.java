package A7;

public class Vehicle {
    private Person ownerId;
    private String /*ownerId,*/ make;
    private int cylinder;

    public Vehicle() {
        ownerId = new Person();
        make = "N/A";
        cylinder = 0;
    }
    public Vehicle(Person id, String mk, int cyl) {
        ownerId = new Person(id);
        make = mk;
        cylinder = cyl;
    }
    public Vehicle(Vehicle other) {
        ownerId = new Person(other.ownerId);
        make = other.make;
        cylinder = other.cylinder;
    }

    public Person getOwnerId() {
        return ownerId;
    }
    public String getMake() {
        return make;
    }
    public int getCylinder() {
        return cylinder;
    }

    public void setOwnerId(Person ownerId) {
        this.ownerId = ownerId;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public void setVehicle(String make, int cylinder) {
        this.make=make;
        this.cylinder=cylinder;
    }

    public String toString() {
        return (getOwnerId()+
                "\nMake/Model= "+getMake()+
                "\nEngine= "+getCylinder()+"-cylinder");
    }

    public boolean equals(Vehicle other) {
        return ((ownerId.equals(other.ownerId)) && (make.equals(other.make) && (cylinder==other.cylinder)));
    }


}
