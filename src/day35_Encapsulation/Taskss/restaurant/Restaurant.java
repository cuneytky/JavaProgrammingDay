package day35_Encapsulation.Taskss.restaurant;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String owner, location ;
    private int numberOfStars;
    private ArrayList<Server> arrayList = new ArrayList<>();
    private ArrayList<Chef> chefArrayList= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }


    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public ArrayList<Server> getArrayList() {
        return arrayList;
    }

    public ArrayList<Chef> getChefArrayList() {
        return chefArrayList;
    }



    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void setArrayList(ArrayList<Server> arrayList) {
        this.arrayList = arrayList;
    }

    public void setChefArrayList(ArrayList<Chef> chefArrayList) {
        this.chefArrayList = chefArrayList;
    }




    public void hireServer(Server server){
        arrayList.add(server);
    }

    public void hireServer(Server [] servers){
        arrayList.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefArrayList.add(chef);
    }

    public void hireChef(Chef [] chefs){
        chefArrayList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefArrayList.removeIf(p-> p.getEmployeeID() == employeeID);
    }
    public void terminateServer(int employeeID){
        arrayList.removeIf(p-> p.getEmployeeID() ==employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", arrayList=" + arrayList +
                ", chefArrayList=" + chefArrayList +
                '}';
    }
}
/*
5. Restaurant Task:
    re-do the Restaurant task by making all the fields private in each custom classes

    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class
 */
//******************************************************************************
/*
 - day31 restaurant test
6.3 Create a class called Restaurant
	Attributes:
	      Owner (String), Location (String), numberOfStars (int)
	      Servers (ArrayList of Server objects)
	      Chefs (ArrayList of Chef objects)
    Add a constructor that sets the owner, location, and number of stars.
	                Actions: (all void methods)

	 hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	 hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	 hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	 hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	 terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	 terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	 toString(): Return (String) of all the information of a Restaurant object.
	            No need to print the whole list of Servers or Chefs.
	             Print the number of Servers and Chefs along side the other information

 */