// Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

interface Dish {
  int quantity1 = 40;
  int quantity2 = 50;
  int quantity3 = 80;

  void getName();

  void getPrice();

  void getIngredients();

  void removeDish();

  void addDish();

  void getTotalCost();
}

class Restaurant implements Dish {
  public void getName() {
    String product1 = "Biriyani";
    String product2 = "Parota";
    String product3 = "sukka";
    System.out.println(product1 + " " + product2 + " " + product3);
  }

  public void getPrice() {
    int p1Price = 2000;
    int p2Price = 4000;
    int p3Price = 3000;
    int total_price = p1Price + p2Price + p3Price;
    System.out.println("the total price is " + total_price);
  }

  public void getIngredients() {
    int quantity1 = 40;
    int quantity2 = 50;
    int quantity3 = 80;
    int total_qantity = quantity1 + quantity2 + quantity3;
    System.out.println("the total quantity is " + total_qantity);
  }

  public void removeDish() {
    int removeP1 = quantity1 - 10;
    int removeP2 = quantity2 - 20;
    int removeP3 = quantity3 - 15;
    int remaining_product = removeP1 + removeP2 + removeP3;
    System.out.println("remaining food are" + remaining_product);
  }

  public void addDish() {
    int addP1 = quantity1 + 15;
    int addP2 = quantity2 + 12;
    int addP3 = quantity3 + 13;
    int additional_product = addP1 + addP2 + addP3;
    System.out.println("after adding food" + additional_product);
  }

  public void getTotalCost() {
    int priceP1 = quantity1 * 2000;
    int priceP2 = quantity2 * 4000;
    int priceP3 = quantity3 * 3000;
    int total_cost = priceP1 + priceP2 + priceP3;
    System.out.println("total price is " + total_cost);
  }

}

class Macro {
  public static void main(String args[]) {
    Dish p = new Restaurant();
    p.getIngredients();
    p.getPrice();
    p.getTotalCost();
    p.removeDish();
    p.addDish();
    p.getName();
  }
}