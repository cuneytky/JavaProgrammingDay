package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    //  1--
    public String PO,BA,SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOfSprint;

    //  2--
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    //  3 to 8
    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p -> p.employeeID == employeeID);
    }
    public void  removeDeveloper(int employeeID){
        devopsList.removeIf(p -> p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }


}
/*
create a class called ScrumTeam
    1--  Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	2--   Add A constructor that can set the fileds PO, BA, and SM

Actions:
	  3-  addTester(Tester tester): adds the given tester to the testers ArrayList

	  4-  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	   5-  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	  6-  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	  7-  removeTester(long employeeID): removes the given tester from the testers ArrayList

	  8-  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	  toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */