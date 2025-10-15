public class ProductManager {
       public static void main(String[] args) {
           System.out.println("Product Manager System");
       }
       
       public double calculateDiscount(double price, double discountPercent) {
           return price - (price * discountPercent / 100);
       }
   }