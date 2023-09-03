package M9.inClass7_inheritance1;

public class Doctor extends Person {
    private String specialty;
    private double visitFee;

    public Doctor() {
        super();
        specialty="None";
        visitFee=0.00;
    }
    public Doctor(String name, Date2 d, String spec, double vF) {
        super(name,d);
        specialty=spec;
        visitFee=vF;
    }
    public Doctor(Doctor other) {
        super(other);
        specialty=other.specialty;
        visitFee=other.visitFee;
    }

    public void setAll(String spec, double vF) {
        specialty = spec;
        visitFee = vF;
    }
    public void setSpecialty(String specialty) {
        this.specialty=specialty;
    }
    public void setVisitFee(double visitFee) {
        this.visitFee=visitFee;
    }

    public String toString() {
        return "Doctor:" +
                "\n"+ super.toString() +
                "\nSpecialty= " + specialty +
                "\nVisitFee= $" + visitFee;
    }
    public boolean equals(Doctor other) {
        return (super.equals(other)&&(specialty.equals(other.specialty))&&(visitFee==other.visitFee));
    }
}
