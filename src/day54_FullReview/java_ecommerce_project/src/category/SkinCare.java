package day54_FullReview.java_ecommerce_project.src.category;
import java.time.LocalDateTime;
import java.util.UUID;
public class SkinCare extends Category{
    public SkinCare(UUID id, String name) {
        super(id, name);
    }
    @Override
    public LocalDateTime findDeliveryDueDate() {
        return LocalDateTime.now();
    }
}
