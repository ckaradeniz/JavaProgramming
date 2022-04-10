package day31_Constructors.PracticeTasks.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server[] servers = {
                new Server("cengiz",123, 15, true),
                new Server("muhsin", 124, 16, false),
                new Server("abdul",125, 17,true),
        };

        Chef[] chefs = {
                new Chef("ahmet remzi", 126, 20, true),
                new Chef("ramazan", 137, 22, false),
                new Chef("hamza", 132, 25, true),

        };

        Restaurant restaurant = new Restaurant("Muharrem Sonmez", "Noordwijk", 4);
        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);


    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of
	        	Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
	            in the Restaurant object

	            - Print your whole restaurants information

 */