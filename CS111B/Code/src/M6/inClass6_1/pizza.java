package M6.inClass6_1;

import java.util.Scanner;

public class pizza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum 3 orders/person. How many would you like to order today? ");
        numPizzas = sc.nextInt();
        p = new pizza[numPizzas];
        for (int i=0;i<p.length;i++) {
            p[i] = new pizza();
            System.out.println("---Pizza #"+(i+1)+": ---");
            System.out.print("Enter size of pizza: ");
            String s = sc.next();
            System.out.print("How much cheese? ");
            double c = sc.nextDouble();
            System.out.print("How much pepperoni? ");
            double pepp = sc.nextDouble();
            System.out.print("How much ham? ");
            double h = sc.nextDouble();
            p[i].setPizza(s,c,pepp,h);
            //System.out.println(p[i]);
        }
        System.out.println();
        for (int i=0;i<p.length;i++) {
            System.out.println(p[i]);
        }
        System.out.println(p[p.length-1].totalCost());

    }

    private static int numPizzas;
    private double cheese, pepperoni, ham, cost;
    private String size;
    private static pizza[] p;

//    public static pizza p1 = new pizza();
//    public static pizza p2 = new pizza();
//    public static pizza p3 = new pizza();

    //Should I set size1, size2, size3, cheese1, cheese2, cheese3, etc. instance variables to make the multiple pizza order to work??
    public pizza() { //no-argument constructor
        size="s";
        cheese=pepperoni=ham=0;
        cost=0;
    }
    public pizza(String si, double ch, double pepp, double ha) {
        size = si;
        cheese = ch;
        pepperoni = pepp;
        ham = ha;
    }
    public String getSize() {
        return size;
    }
    public double getCheese() {
        return cheese;
    }
    public double getPepperoni() {
        return pepperoni;
    }
    public double getHam() {
        return ham;
    }
    public void setNumPizzas(int numPizzas) {
        pizza.numPizzas = numPizzas;
    }

    public void setPizza(String si, double ch, double pepp, double ha) {
        this.size = si;
        this.cheese = ch;
        this.pepperoni = pepp;
        this.ham = ha;
    }

    public double sizePrice(String size) {
        if(size.equalsIgnoreCase("s")) {
            cost = 10;
        }
        else if(size.equalsIgnoreCase("m")) {
            cost = 12;
        }
        else if(size.equalsIgnoreCase("l")) {
            cost = 14;
        }
        return cost;
    }
    public double calcCost() {
        cost = (sizePrice(size)+((2*getCheese())+(2*getPepperoni())+(2*getHam())));
        return cost;
    }
    //calcTotal is incomplete. Don't know how to incorporate the setPizza1, setPizza2, setPizza3 into the equation. Maybe I should build getters equivalent to the setPizza setters.
    public  double calcTotal() {
        if (numPizzas == 1)
            return p[0].calcCost();
        else if (numPizzas == 2)
            return p[0].calcCost()+p[1].calcCost();
        else if (numPizzas == 3)
            return p[0].calcCost()+p[1].calcCost()+p[2].calcCost();
        else
            return 0;
    }
    public String toString() {
        return("Pizza size: "+getSize()+String.format("\nNo. of Cheese: %1$.1f\nNo. of Pepperoni: %2$.1f\nNo. of Ham: %3$.1f\nCost of the pizza: $%4$.2f",getCheese(),getPepperoni(),getHam(),calcCost()));
    }
    public String totalCost() {
        return (String.format("---Overall cost: ---\n$%.2f",calcTotal()));
    }

}
