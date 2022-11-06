package May14Review.poly_demo;

public class Father extends Parent implements Worker{
    @Override
    public void raiseChild() {
        System.out.println("parent is raising child");
    }

    @Override
    public void playWithChild() {
        System.out.println("parent is playing with child");
    }

    @Override
    public void feedChild() {
        System.out.println("parent is feeding child");
    }

    @Override
    public void work(String job) {
        System.out.println("parent is working as a " + job);
    }

    @Override
    public double getPaid() {
        return 100000;
    }

}
