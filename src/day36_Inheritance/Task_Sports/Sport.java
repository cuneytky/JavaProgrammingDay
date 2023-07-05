package day36_Inheritance.Task_Sports;

public class Sport {
    private String name, rules;
    private int   set, numberOfPlayers,numberOfReferre;
    private double time;


    public void setInfo(String name, String rules, int set, int numberOfPlayers, int numberOfReferre, double time) {
        this.name = name;
        this.rules = rules;
        this.set = set;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void setNumberOfReferre(int numberOfReferre) {
        this.numberOfReferre = numberOfReferre;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void play(){
        System.out.println(getClass().getSimpleName()+" are playing");
    }

    public String toString() {
        return "Sport{" +
                getClass().getSimpleName()+
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", set=" + set +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", time=" + time +" minutes"+
                '}';
    }

}
/*
4. Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules
			methods:
				setInfo()
				play()
				toString()
		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball
			Add any missing variables or methods
			Note: you can search them on google
 */