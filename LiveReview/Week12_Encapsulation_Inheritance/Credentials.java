package Week12_Encapsulation_Inheritance;

public class Credentials {

    private String name = "A12345";
    private String password = "Cydeo123.";

    //when these instance variables are public, they can be reached easily in login by
    // sout(name + " and " + password)
    //but we'll make them private sot hat they cannot be reached easily - then we'll need getter and setter

    public String getName () {
        if (true){                   // you can put a condition here
        return name;}
        else return "condition has not been satisfied";
    }

    public String getPassword () {
        return password;
    }

    public void setPassword(String newPassword) {
        if (true) {
            this.password=newPassword;
        } else {
            System.exit(-1);
        }
    }
}
