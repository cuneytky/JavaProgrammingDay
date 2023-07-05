package day35_Encapsulation.Taskss.restaurant;

public class MyRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("ali",123,30,true);
        Server server2 = new Server("veli",456,30,false);

        System.out.println(server1);
        System.out.println(server2);
        Server[] servers = {server1,server2};

        System.out.println("------------------------------");

       Chef chef1= new Chef("kaya",987,40,true);
        Chef chef2= new Chef("rock",654,40,false);
        System.out.println(chef1);
        System.out.println(chef2);
        Chef[] chefs={chef1,chef2};

        System.out.println("-------------------------------");
        Restaurant restaurant= new Restaurant("ck","esk",2);
        restaurant.hireServer(server1);
        restaurant.hireServer(servers);
        restaurant.hireChef(chef1);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println("-------------------------------");



    }
}
