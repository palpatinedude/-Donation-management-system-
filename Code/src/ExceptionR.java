public class ExceptionR extends Exception{ //ExceptionR για την RequestDinationList
    public ExceptionR() {}
    public ExceptionR(String msg) {super(msg);}
    public String toString() {
        return "ExceptionR: This is not acceptable!";
    }
}
