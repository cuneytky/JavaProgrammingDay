package day54_FullReview.java_ecommerce_project.src.category;
import java.time.LocalDateTime;
import java.util.UUID;
public class Electronic extends Category{
    public Electronic(UUID id, String name) {
        super(id, name); // super is call parent class
    }
    @Override
    public LocalDateTime findDeliveryDueDate() {
        LocalDateTime localDateTime= LocalDateTime.now();
        return localDateTime.plusDays(4);
    }
    @Override
    public String generateCategoryCode() {
        return "EL-"+ getId().toString().substring(0,8);
    }
}
