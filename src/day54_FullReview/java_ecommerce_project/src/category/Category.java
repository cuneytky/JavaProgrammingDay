package day54_FullReview.java_ecommerce_project.src.category;
import java.time.LocalDateTime;
import java.util.UUID;
public abstract class Category {
    private UUID id;
    private String name;
    public Category(UUID id, String name) { // bu kısmı kullanmazsan default olarak chıld classa aktarılır
        this.id = id;                      // extend edince de hata vermez.
        this.name = name;
    }
    public abstract LocalDateTime findDeliveryDueDate();
    public String generateCategoryCode(){
        return id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
