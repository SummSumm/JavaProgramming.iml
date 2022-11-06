package day30_CustomClass;

public class CarClass {

    public String brand;
    public String model;
    public String colour;
    public int year;
    public double price;


    public void setInfo(String carbrand, String carmodel, String carcolour, int caryear, double carprice) {
        brand = carbrand;
        model = carmodel;
        colour = carcolour;
        year = caryear;
        price = carprice;

    }

    public String toString() {
        return "CarClass{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive() {
        System.out.println("Driving " + brand +" " +model);
    }
}

