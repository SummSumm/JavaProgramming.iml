package day32_CustomClass_Constructors;

public class carpet {
    public double width, length, unitPrice;  // we write public so that we can access them in different classes. If we don't write it, we can't access them.
    boolean isPersian;

    public carpet(double width, double length, double unitPrice, boolean isPersian) {// constructor name must be same as hte class name
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;                                   // instanceları çalıştırmak için this.
        this.isPersian = isPersian;

    }

                            //paranteze bişey yazmaya gerek yok; zaten onceki metotta istedik
    public double price () {  // neden "static" yok? Çünkü static olsa farklı halılara farklı bilgiler yukleyemeyiz. Her yerde aynı çalışır main method gibi

        double totalPrice = (width*length)*unitPrice;
        if (isPersian) {
            totalPrice +=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total price = £" + price() +
                '}';
    }
}
