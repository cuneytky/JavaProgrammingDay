package day35_Encapsulation.Taskss.restaurant;

public class Server {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
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
        if(employeeID<=0){
            System.err.println("employee ID not negative or zero");
            return;
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<=0){
            System.err.println("hourlyRate not negative or zero");
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }


    public void takeOrder(){
        System.out.println(name+" is taking an order" );
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

    public String fullTime(){
        if(fullTime==true){
            return "full-time";
        }else {
            return "part-time";
        }
    }
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate= $" + hourlyRate +
                ", fullTime= " + fullTime() +
                '}';
    }
}
/*
day31 restaurant task
6. Restaurant Task:
	6.1  Create a class called Server

	   Attributes:
	       name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

          Add A constructor that can set all the fields

	      Actions: (all void methods)
	           takeOrder(): server's name + "is taking an order"
	           cleanTable(): server's name + "is cleaning the table"
	           toString(): Returns (String) all the information of a Server
	   -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */