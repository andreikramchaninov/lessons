package strategy;

public class ShoppingCart {
  public double total;

  public void addBook(String title, double price) {
    total += price;
  }

  public void pay(PaymentStrategy paymentStrategy) {
    paymentStrategy.pay(total);
  }

}
