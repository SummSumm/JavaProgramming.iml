package Week09;

public class StringManipulatorTask {
    public static void main(String[] args) {

        StringManipulator obj1 = new StringManipulator("java");
        System.out.println(obj1.str);                                  // str took the shape of our obj. --> java

        StringManipulator obj2 = new StringManipulator("Selenium");
        System.out.println(obj2.str);                                 // --> Selenium

        obj1.firstTwoChars(); // my method will do the action (change the str)
        System.out.println(obj1.str);

        StringManipulator obj3 = new StringManipulator("Sumeyye");

        System.out.println(obj3.tripler());

    }
}
