package day44and45_OOPAbstraction_Interface.Animal;

 public class Cat extends Animal{


    public Cat(String name, String breed, String gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
            System.out.println(getName() + " is eating fish.");
        }

        public void meow (){
            System.out.println(getName() + " is meowing.");
        }

}
