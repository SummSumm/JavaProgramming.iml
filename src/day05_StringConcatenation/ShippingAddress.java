package day05_StringConcatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Jimmy Joe", buildingNo = "12B-7", street = "Noole", city = "Toronto", country = "Canada", zipCode = "TR2";

        System.out.println("Name  = " + name);
        System.out.println("Address = " + street + " Street " + buildingNo);
        System.out.println(city + "/" + country);
        System.out.println(zipCode);

        /*
        ALTERNATIVE
        System.out.println("Name  = " + name "\n" + "Address = " + street + " Street " + buildingNo)
        boşluklar için dikkat etmek lazım
         */




    }
}

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */