import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import strategy.*;

public class MainTest {
  public ShoppingCart cart;

  @Before
  public void setup() {
    cart = new ShoppingCart();
    cart.addBook("HeadFirst Design Patterns", 30.0);
    cart.addBook("Head First Java", 30.0);
    cart.addBook("Java for Dummies", 20.0);
  }

  @Test
  public void test_api() {
    ShoppingCart cart = new ShoppingCart();
    cart.addBook("HeadFirst Design Patterns", 30.0);
    cart.addBook("Head First Java", 30.0);
    cart.addBook("Java for Dummies", 20.0);

    cart.pay(new PaymentStrategy() {
      public void pay(double total) {

      }
    });

   }

   @Test
   public void test() {
    assertThat(cart.total, is(30.0 + 30.0 + 20.0));
   }

   @Ignore //@Test
   public void paymentStrategy_payMethod_shouldBeCalled_whenCartPayMethodIsCalled() {
     boolean[] callAttempt = {false};
     cart.pay(new PaymentStrategy() {
       public void pay(double total) {
         callAttempt[0] = true;
       }
     });

     assertThat(callAttempt, is(true));
   }

   @Test
   public void paymentStrategy_shouldReceiveCorrectlTotalValue() {
     double[] totalValue = {0.0};
     cart.pay(new PaymentStrategy() {
       public void pay(double total) {
         totalValue[0] = total;
       }
     });

     assertThat(totalValue[0], is(30.0 + 30.0 + 20.0));
   }

   @Test
   public void payPalPaymentStrategy_api() {
     cart.pay(new PayPalPaymentStrategy("email@example.com", "Books", 100.0));
   }

}
