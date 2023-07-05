package day35_Encapsulation.Taskss.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO, BA, SM;
    private int daysOfSprint;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> developerArrayList= new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ArrayList<Developer> getDeveloperArrayList() {
        return developerArrayList;
    }

    public void setDeveloperArrayList(ArrayList<Developer> developerArrayList) {
        this.developerArrayList = developerArrayList;
    }



    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developerArrayList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developerArrayList.addAll(Arrays.asList(developers));
    }

    public void removeTester(String employeeID){
        testersList.removeIf(p-> p.getEmployeeID() == employeeID);
    }

    public void removeDeveloper(String employeeID){
        developerArrayList.removeIf(p-> p.getEmployeeID() == employeeID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                ", testersList=" + testersList +
                ", number of testers=" + testersList.size() +
                ", developerArrayList=" + developerArrayList +
                ", number of developers=" + developerArrayList.size() +
                '}';
    }
}
/*
4. ScrumTeam Task:
    re-do the Scrum task by making all the fields private in each custom classes


    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class
 */
// *********************************************************
/*
day 31 scrum team task;
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