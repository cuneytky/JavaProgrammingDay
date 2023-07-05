package day35_Encapsulation.Tasks;

public class Item {

    private String name;
    private double unitPrice;
    private double quantity;


    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("name can not be empty");
            return;
        }
        if(!Character.isLetter(name.charAt(0))){
            System.err.println("name has to be letter");
        }
        char[] arr = name.toCharArray();
        for (char c : arr) {
            if(!(Character.isLetterOrDigit(c) || c ==' ')){
                System.err.println("name can not contain special characters other than space");
            }
        }
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("unitPrice can not be negative");
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        if(quantity<0){
            System.err.println("quantity can not be negative");
            return;
        }
        if(name.equalsIgnoreCase("toilet paper")){
            if(quantity>1){
                System.err.println("toilet paper can not be more than 1");
                return;
            }
        }
        this.quantity = quantity;
    }
    public Item(String name, double unitPrice, double quantity) {
       setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost= " + calcCost() +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

      Encapsulate all the fields:
        Conditions:
           name can not be empty or blank
            name can not contain any special characters other than space
            name must start with letters
            unit price can not be negative
            quantity can not be negative
           if the Item name is toilet paper (case insensitive) then
            the quantity can not be more than 1


     Add a constructor that allows user to set all the fields when the object is created.
		(If the arguments not valid it should not be set to the instances)

    instance methods:
        calcCost(): returns the total cost
         toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */
