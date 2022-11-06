package Week09;

public class StringManipulator {
    
    public String str;                                  // one attribute

    public StringManipulator(String str) {              // oneconstructor
        this.str = str;
    }

    public void firstTwoChars () {
        str=str.toUpperCase().substring(0,2);
    }

    public  String tripler () {
        char char1 = str.charAt(str.length()-2);
        char char2 = str.charAt(str.length()-1);

        String newstring = "" + char1+char2;

return newstring.repeat(3);
    }
}
