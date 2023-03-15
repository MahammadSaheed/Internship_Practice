public class Product {
  private int pid;
  private float price;
  private int qty;

  void setPid(int pid) {
    this.pid = pid;
  }

  void setPrice(float price) {
    this.price = price;
  }

  void setQty(int qty) {
    this.qty = qty;
  }

  int getPid() {
    return this.pid;
  }

  float getPrice() {
    return this.price;
  }

  int getQty() {
    return this.qty;
  }
}
