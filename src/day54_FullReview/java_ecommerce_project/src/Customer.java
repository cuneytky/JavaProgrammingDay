package day54_FullReview.java_ecommerce_project.src;
import java.util.List;
import java.util.UUID;
public class Customer {
    private UUID id; // bununla unique yaptık.
    private String username;
    private String email;

   // 1-> private String address;// bunu kullanmaya gerek yok adress isimli classımız var ve bunu kullanabılırım.
   // 2-> private Address address2;// wrong: because this 1 address- customer can have more address
             // we need multple uses so need to list, array, arraylist.
   // 3-> private ArrayList<Address> address; // ok but not preferable structure.
              //(remember--> ArrayList<Address> abc = new ArrayList<>(); )
              // Class abc = new Class
    private List<Address> addresses; //preferable sructure because polimorphism
            // Interface abc = new Class() ->poly
    // 2 constructors gerekiyor 2 durum istendi customer için;
   // what we call this constructors? --> overloading constroctors
    public Customer(UUID id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    public Customer(UUID id, String username, String email, List<Address> addresses) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.addresses = addresses;
    }
    public UUID getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public List<Address> getAddress() {
        return addresses;
    }
}
