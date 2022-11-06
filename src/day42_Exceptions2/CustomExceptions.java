package day42_Exceptions2;


class FadyException extends RuntimeException {

    public FadyException () {
        super ("Time for a short break");
    }

    public FadyException (String message) {
       super (message);
    }
}   // to make it an unchecked exception

class NoBreak extends Exception {   // to make it a checked exception

}

public class CustomExceptions {
    public static void main(String[] args) {
      //  throw new FadyException("It's time for lunch!");  --> works
        try {                        // --> throw new NoBreak () gives compile error due to no try catch.
            throw new NoBreak();
        } catch (NoBreak e) {
            e.printStackTrace();
        }
    }
}
