package May14Review.poly_demo;

public class SuperMan {
    public static void main(String[] args) {
        //Polymorphism

        Parent SuperMan1 = new Father();

        SuperMan1.raiseChild();
        SuperMan1.playWithChild();
        SuperMan1.feedChild();
        //methods in interface won't work here

        Worker SuperMan2  = new Father();
        SuperMan2.work("teacher");
        SuperMan2.getPaid();

        Father Superman3 = new Father();
        //bu hepsini yapar
        Superman3.raiseChild();
        Superman3.getPaid();


    }
}
