package A7;

public class Truck extends Vehicle {
    private double loadCap;
    private int towingCap;

    public Truck() {
        super();
        loadCap = towingCap = 0;
    }
    public Truck(Person/*String*/ id, String mk, int cyl, double ldCap, int twCap) {
        super(id,mk,cyl);
        loadCap = ldCap;
        towingCap = twCap;
    }
    public Truck(Truck other) {
        super(other);
        loadCap = other.loadCap;
        towingCap = other.towingCap;
    }
    //Can you do getter for an object or is it only meant for primitive type?
//    public Vehicle getSpec() {
//        return spec;
//    }
    public double getLoadCap() {
        return loadCap;
    }
    public int getTowingCap() {
        return towingCap;
    }
    public void setLoadCap(double loadCap) {
        this.loadCap = loadCap;
    }
    public void setTowingCap(int towingCap) {
        this.towingCap = towingCap;
    }
    public void setTruck(double loadCap, int towingCap) {
        this.loadCap = loadCap;
        this.towingCap = towingCap;
    }
    public String toString() {
        return ("Here's the current PickUp configuration: "+
                "\n"+super.toString()+
//                "\nReiterate vehicle spec:"+getSpec()+" (For testing getter vs super.toString())"+
                "\nLoad Capacity= "+getLoadCap()+" tons"+
                "\nTowing Capacity= "+getTowingCap()+" lbs");
    }
    public boolean equals(Truck other) {
        return (super.equals(other)&&(loadCap==other.loadCap)&&(towingCap==other.towingCap));
    }


}
