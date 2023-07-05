package day36_Inheritance.Task_Planet;

public class Planet {
    public String name,mass, volume;
    public double radius,surfaceGravity,surfaceArae;
    public long  population;


    public void setInfo(String name, double radius, double surfaceGravity, double surfaceArae, String mass, String volume, long population) {
        this.name = name;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArae = surfaceArae;
        this.mass = mass;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +" kg"+
                ", radius=" + radius +" km"+
                ", surfaceGravity=" + surfaceGravity +" m/sn2"+
                ", surfaceArae=" + surfaceArae +" km2"+
                ", volume=" + volume +" km3"+
                ", population=" + population +
                '}';
    }
}
/*
5. Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google


 */