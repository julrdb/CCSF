package Quiz.Finals;

public class Email extends Document{
    private String sender, recipient, emailTitle;

    public Email() { //default
        super();
        sender="anon";
        recipient="unknown";
        emailTitle="blankTitle";
    }
    public Email(Document t,String snd,String rcpt, String emTitle) {
        super(t);
        sender=snd;
        recipient=rcpt;
        emailTitle=emTitle;
    }
    public Email(Email other) {
        super(other);
        sender=other.sender;
        recipient=other.recipient;
        emailTitle=other.emailTitle;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void set(String t) {
        setText(t);
    }

    public void setSender(String snd) {
        sender=snd;
    }

    public void setRecipient(String rcpt) {
        recipient=rcpt;
    }

    public void setEmailTitle(String emTitle) {
        emailTitle=emTitle;
    }

    public void setAll(String t, String snd, String rcpt, String emTitle) {
        setText(t); //invoking from Document super class; overriding.
        sender=snd;
        recipient=rcpt;
        emailTitle=emTitle;
    }

    public String toString() {
        return("The following input: \n"+
                "Sender: "+getSender()+"\n"+
                "Recipient: "+getRecipient()+"\n"+
                "Email Title: "+getEmailTitle() +"\n"+
                "\t\t----Text Body----\n"+
                super.toString());
    }


}
