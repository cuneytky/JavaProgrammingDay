package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "Tom Hanks",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "55501B";
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode;
        System.out.println(address);
    }
}
/*
TASK-2 :
2. Declare the following variables:
        1. name
        2. buildingNumber
        3. streetName
        4. city
        5. state
        6. zipCode
3. Use concatenation to print the full address
 */
