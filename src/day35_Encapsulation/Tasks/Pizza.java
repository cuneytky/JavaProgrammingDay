package day35_Encapsulation.Tasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize(){
        return size;
    }
    public int getNumberOfCheeseTopping(){
        return numberOfCheeseTopping;
    }
    public int getNumberOfPepperoniTopping(){
        return numberOfPepperoniTopping;
    }

    public void setSize(String size){
        if(size == null){
            System.err.println("Size can not be null");
            System.exit(1);
        }
        if (!( size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") ) ){
            System.out.println("size is only small-medium-large");
          return;
        }

        this.size=size;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping){
        if(numberOfCheeseTopping<0){
            System.err.println("cheese number can not negative");
            return;
        }
        if( (size.equalsIgnoreCase("small")&& numberOfCheeseTopping>3) ||(size.equalsIgnoreCase("medium")&& numberOfCheeseTopping>4)||(size.equalsIgnoreCase("large")&& numberOfCheeseTopping>5)){
            System.err.println("cheese number is more");
            return;
        }
        this.numberOfCheeseTopping=numberOfCheeseTopping;
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if(numberOfCheeseTopping<0){
            System.err.println("pepperoni number can not negative");
            return;
        }
        if( (size.equalsIgnoreCase("small")&& numberOfPepperoniTopping>4) ||(size.equalsIgnoreCase("medium")&& numberOfPepperoniTopping>5)||(size.equalsIgnoreCase("large")&& numberOfPepperoniTopping>6)){
            System.err.println("pepperoni number is more");
            return;
        }
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    public double calcCost(){
        double result = 0;
        if(size.equalsIgnoreCase("small")){
            result += numberOfCheeseTopping*12 + numberOfPepperoniTopping*12;
        } else if (size.equalsIgnoreCase("medium")) {
            result += numberOfCheeseTopping*14 + numberOfPepperoniTopping*14;
        }else if (size.equalsIgnoreCase("large")) {
            result += numberOfCheeseTopping*16 + numberOfPepperoniTopping*16;
        }
        return result;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping= " + numberOfPepperoniTopping +
                " Total cost='" + calcCost() +
                '}';
    }
}
/*
5. Pizza Task:
	5.1 Create class named Pizza:
			private variables:
				size, numberOfCheeseTopping, numberOfPepperoniTopping

	Encapsulate all the fields
			Conditions:
		size of the pizza can only be small, medium, large. case insensitive

		Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

		Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

	Add a constructor that allows user to set all the fields when the object is created.
		(If the arguments not valid it should not be set to the instances)

	Methods:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size,
			quantity of each topping, and the pizza cost as calculated by
			 calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
