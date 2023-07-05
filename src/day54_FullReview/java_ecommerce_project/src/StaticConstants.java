package day54_FullReview.java_ecommerce_project.src;
import day54_FullReview.java_ecommerce_project.src.balance.Balance;
import day54_FullReview.java_ecommerce_project.src.category.Category;
import day54_FullReview.java_ecommerce_project.src.discount.Discount;
import day54_FullReview.java_ecommerce_project.src.order.Order;

import java.util.ArrayList;
import java.util.List;
public class StaticConstants {
    public static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static final List<Category> CATEGORY_LIST = new ArrayList<>();
    public static final List<Product> PRODUCT_LIST = new ArrayList<>();
    public static final List<Balance> CUSTOMER_BALANCE_LIST = new ArrayList<>();
    public static final List<Balance> GIFT_CARD_BALANCE_LIST = new ArrayList<>();
    public static final List<Discount> DISCOUNT_LIST= new ArrayList<>();
    public static final List<Order> ORDER_LIST = new ArrayList<>();
    // buyuk harf cunku final unutma uygulama boyle zorunlu değil
    // static --> call with the class name only
}
