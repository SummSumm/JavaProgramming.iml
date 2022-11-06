package day40_Final_KW;

public class FinalVariable {

    // it'll give compile error in instance variables bc it will be changed.
    // if you want to use it, use a constructor

    final int age;

    public FinalVariable(int age) {
        this.age = age;
    }

    // with static, we need a static block
    // statics are called through class name
    // onlt static can be reassigned. Final can NEVER be reassigned

    final static String name;

    static {
        name="Lila";
    }


    public static void main(String[] args) {


        final double pi = 3.14;   // unchangable

        // final String name; --> boyle olmaz

        final String name;
        name = "Wooden Spoon";
        FinalVariable f1 = new FinalVariable(54);
        System.out.println(f1.age);
// can't change now

    }


}
