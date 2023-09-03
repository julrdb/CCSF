package Quiz.Finals; //Please comment this out if necessary. This is my IDE folder structure.

public class Document {
    private String text;

    public Document() { //default constructor
        text="___";
    }
    public Document(String t) { //parameterized constructor
        text=t;
    }
    public Document(Document other) { //copy constructor
        text=other.text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return ("Doc text: \n"+getText());
    }

    public boolean equals(Document other) {
        return(text.equals(other.text));
    }

}
