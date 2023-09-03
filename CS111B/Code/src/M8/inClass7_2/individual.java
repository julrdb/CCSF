package M8.inClass7_2;

public class individual {
    private String name;
    private String phoneNumber;

    public individual() {
        name = null;
        phoneNumber = null;
    }
    public individual(String newName, String newPhoneNumber) { //parameterized constructor
        name = newName;
        phoneNumber = newPhoneNumber;
    }

    public individual(individual newIndividual) { //copy constructor
        name = newIndividual.name;
        phoneNumber = newIndividual.phoneNumber;
    }

    public void setBoth(String newName, String newPhoneNumber) {
        name = newName;
        phoneNumber = newPhoneNumber;
    }
    public void setName(String newName) {
        name = newName;

    }
    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return "Name = " + name +", Phone Number = " + phoneNumber;
    }

    public boolean equals(individual newIndividual) {
        return(this.name==newIndividual.name && this.phoneNumber==newIndividual.phoneNumber);
    }

}



