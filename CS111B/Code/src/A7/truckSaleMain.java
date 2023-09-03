package A7;

public class truckSaleMain {
    public static void main(String[] args) {
        Truck blank1 = new Truck();
        System.out.println(blank1+"\n");
        Truck blank2 = new Truck();
        System.out.println(blank2);
        System.out.println();
        Person buyer1 = new Person("Jeremy Goddard");
        Truck order1 = new Truck(buyer1,"Toyota Tacoma",6,0.81,4600);

        System.out.println(order1+"\n");
        Truck order2 = new Truck(order1);
        order2.setVehicle("GMC Sierra",8);
        order2.setTruck(1.12,13400);
        System.out.println(order2);
        System.out.println();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        if(v1.equals(v2))
            System.out.println("v1 & v2 are equal.");
        else
            System.out.println("v1 & v2 NOT equal");
        /*There is a sticky issue when recompiling classes. When I mess with boolean methods for truck and vehicle, my blank1 & blank2 objects become NOT equal*/
        if(blank1.equals(blank2))
            System.out.println("blank1 & blank2 are equal.");
        else
            System.out.println("blank1 & blank2 are NOT equal.");

        if(order1.equals(order2))
            System.out.println("\nThe two orders are the same. ");
        else
            System.out.println("\nThe two orders are NOT the same. ");
    }
}
