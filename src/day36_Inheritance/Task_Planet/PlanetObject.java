package day36_Inheritance.Task_Planet;

public class PlanetObject {
    public static void main(String[] args) {

        Earth earth=new Earth();
        earth.setInfo("Earth",6356.8,9.80,510_100_000,"5.9724 * 10^24","108321*10^10",7_837_000_000l);
        System.out.println(earth);

        System.out.println("------------------");

        Moon moon = new Moon();
        moon.setInfo("Moon",1738.1,1.62,38_000_000,"0.07346 * 10^24","21968*10^10",0);
        System.out.println(moon);

        System.out.println("------------------");

        Mercury mercury = new Mercury();
        mercury.setInfo("Mercury",2439.7,3.7,74_800_000,"3,285E23 ","6,083 * 10^10 ",0);
        System.out.println(mercury);

        System.out.println("------------------");

        Venus venus = new Venus();
        venus.setInfo("Venus",6051.8,8.87,460_200_000,"4,867E24","9,2843 * 10^11",0);
        System.out.println(venus);

        System.out.println("------------------");
        /*
        Planet{name='Earth', mass=5.9724 * 10^24 kg, radius=6356.8 km, surfaceGravity=9.8 m/sn2, surfaceArae=5.101E8 km2, volume=108321*10^10 km3, population=7837000000}
------------------
       Planet{name='Moon', mass=0.07346 * 10^24 kg, radius=1738.1 km, surfaceGravity=1.62 m/sn2, surfaceArae=3.8E7 km2, volume=21968*10^10 km3, population=0}
------------------
       Planet{name='Mercury', mass=3,285E23  kg, radius=2439.7 km, surfaceGravity=3.7 m/sn2, surfaceArae=7.48E7 km2, volume=6,083 * 10^10  km3, population=0}
------------------
       Planet{name='Venus', mass=4,867E24 kg, radius=6051.8 km, surfaceGravity=8.87 m/sn2, surfaceArae=4.602E8 km2, volume=9,2843 * 10^11 km3, population=0}
------------------

         */


    }
}
