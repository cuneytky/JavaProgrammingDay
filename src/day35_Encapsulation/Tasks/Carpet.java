package day35_Encapsulation.Tasks;

public class Carpet {
    private double width,length;
    private boolean isPersian;
    private double unitPrice;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public Carpet(double width, double length, boolean isPersian, double unitPrice) {
        setWidth(width);
        setLength(length);
        setPersian(isPersian);
        setUnitPrice(unitPrice);
    }


    public double calcCost(){
        double result = 0;
        result = (!isPersian) ? width * length * unitPrice : width * length * unitPrice + 200;
        return result;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", isPersian=" + isPersian +
                ", unitPrice=" + unitPrice +
                ", Total price=" + calcCost() +
                '}';
    }
}

/*
3. Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of
                        the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice

 */
