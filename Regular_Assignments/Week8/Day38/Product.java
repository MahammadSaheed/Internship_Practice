import java.util.ArrayList;
import java.util.Scanner;

class ProductItem {
  String p_name;
  String p_id;
  double price;

  ProductItem(String p_name, String p_id, double price) {
    this.p_name = p_name;
    this.p_id = p_id;
    this.price = price;
  }

  public String getP_name() {
    return p_name;
  }

  public void setP_name(String p_name) {
    this.p_name = p_name;
  }

  public String getP_id() {
    return p_id;
  }

  public void setP_id(String p_id) {
    this.p_id = p_id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  class ProductList {
    ArrayList<Products> item = new ArrayList<Products>();
    Scanner sc = new Scanner(System.in);

    void addProduct(ProductItem productItem) {
      item.add(productItem);
      System.out.println("the added products");
    }

    void removeProduct(ProductItem productItem) {
      if (item.contains(ProductList)) {
        item.remove(productItem);
        System.out.println("we found the removed item");
      } else {
        System.out.println("we didn't found it");
      }
    }
  }
}

class Product {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ProductList items = new Productlist();
    for (int i = 0; i < 5; i++) {
      System.out.println("the items" + i + 1 + "is");
      items.addProducts(new Products(sc.next(), sc.next(), sc.nextDouble()));
    }
  }
}