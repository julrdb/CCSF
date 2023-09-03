package M6.inClass6_2;

public class demoHotdogStand {
    public static void main(String[] args) {
        hotdogStand stand1 = new hotdogStand(101, 35);
        hotdogStand stand2 = new hotdogStand(102, 35);
        hotdogStand stand3 = new hotdogStand(103, 35);
        hotdogStand stand0 = new hotdogStand();
        stand1.justSold();
        stand3.justSold();
        stand3.justSold();
        System.out.println("Stand0. "+stand0);
        System.out.println("Stand1. "+stand1);
        System.out.println("Stand2. "+stand2);
        System.out.println("Stand3. "+stand3);
        System.out.println("\nTotal combined: "+ hotdogStand.allHotdogs()); //you can use any object on this case just to enable invoking allHotdogs().
    }
}
