import java.util.List;
import java.util.ArrayList;

interface Product {
  public String getName();

  public String getDescription();

  public double getPrice();

  public int getQuantity();

}

class ElectronicProduct implements Product {
  private double price;
  private String name;
  private String brand;
  private int warranty;

  ElectronicProduct(double price, String name, String brand, int warranty) {
    this.price = price;
    this.name = name;
    this.brand = brand;
    this.warranty = warranty;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public int getWarranty() {
    return warranty;
  }

}

class ClothingProduct implements Product {
  private double price;
  private String name;
  private String size;
  private String color;

  ClothingProduct(double price, String name, String size, String color) {
    this.price = price;
    this.name = name;
    this.size = size;
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

}

class ShoppingCart {

  private List<Product> products;

  public ShoppingCart() {
    this.products = new ArrayList<Product>();
  }

  public void addProduct(Product product) {
    this.products.add(product);
  }

  public void removeProduct(Product product) {
    this.products.remove(product);
  }

  public List<Product> getProducts() {
    return this.products;
  }
}

class Checkout {

  private double totalPrice;
  private String shippingAddress;
  private String paymentMethod;

  public Checkout(double totalPrice, String shippingAddress, String paymentMethod) {
    this.totalPrice = totalPrice;
    this.shippingAddress = shippingAddress;
    this.paymentMethod = paymentMethod;
  }

  public void processPayment() {
    if (paymentMethod.equals("Credit Card")) {
      System.out.println(" process the payment with the credit card");
    } else if (paymentMethod.equals("PayPal")) {
      System.out.println("process the payment with PayPal");
    }
  }

  public void shipOrder() {
    System.out.println(" order is shipped to the  address" + getShippingAddress());
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
}

class InsufficientStockException extends Exception {
  public InsufficientStockException(String message) {
    super(message);
  }
}

class InvalidPaymentException extends Exception {
  public InvalidPaymentException(String message) {
    super(message);
  }
}

public class Shopping {
  public static void main(String[] args) {
    // Create a list of products
    List<Product> products = new ArrayList<>();
    products.add(new ElectronicProduct(2000, "nokia", "nok", 20));
    products.add(new ClothingProduct(10000, "iphone", "20", "black"));

    // Create a shopping cart
    ShoppingCart cart = new ShoppingCart();

    // Add products to the shopping cart
    for (Product product : products) {
      cart.addProduct(product);
    }

    // Checkout
    try {
      Checkout checkout = new Checkout(4000, "sirsi", "paypal");
      checkout.processPayment();
      System.out.println("Order placed successfully!");
    } catch (InsufficientStockException | InvalidPaymentException e) {
      System.out.println(e.getMessage());
    }

  }
}