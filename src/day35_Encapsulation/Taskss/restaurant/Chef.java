package day35_Encapsulation.Taskss.restaurant;

public class Chef {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTim;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTim) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTim(fullTim);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean getFullTime() {
        return fullTim;
    }

    public void setFullTim(boolean fullTim) {
        this.fullTim = fullTim;
    }

    public void makeOrder(){
        System.out.println(name + "is making an order");
    }
    public void washDishes(){
        System.out.println(name + "is washing the dishes");
    }
    public String fullTime(){
        if(fullTim==true){
            return "full-time";
        }else{
            return "part-time";
        }
    }
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID= " + employeeID +
                ", hourlyRate= " + hourlyRate +
                ", fullTime= " + fullTime() +
                '}';
    }


}
/*
day31 restaurant task:
6.2 Create a class called Chef
		       Attributes:
	name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
	Add A constructor that can set all the fields

		       Actions: (all void methods)
	makeOrder(): chef's name + "is making an order"
	washDishes(): chef's name + "is washing the dishes"
	toString(): Returns (String) all the information of a Chef
	-> Extra: For fullTime status, instead of printing a boolean value,
	          print "full-time" or "part-time"

 */