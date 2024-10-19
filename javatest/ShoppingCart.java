public class ShoppingCart {
     
   public static void main(String[] args) {   

    Shopping shopping = new Shopping();
    shopping.Items = 2;
    shopping.TotalPrice = 356.99;
    shopping.Discount = 5.0;
    shopping.UserId="vaishnavi1";
    shopping.isEmptyCart=true;

    System.out.println("add item into the cart :" + shopping.Items);
    System.out.println("total price of the product:" + shopping.TotalPrice);
    System.out.println("discount for product :" + shopping.Discount);
    System.out.println("user id for the customer :" + shopping.UserId);
    System.out.println("the cart is empty :" + shopping.isEmptyCart);

    Shopping shopping1 = new Shopping();
    shopping1.Items = 3;
    shopping1.TotalPrice = 335.0;
    shopping1.Discount = 5.0;
    shopping1.UserId="sumanth1";
    shopping1.isEmptyCart=true;

    System.out.println("add item into the cart :" + shopping1.Items);
    System.out.println("total price of the product:" + shopping1.TotalPrice);
    System.out.println("discount for product :" + shopping1.Discount);
    System.out.println("user id for the customer :" + shopping1.UserId);
    System.out.println("the cart is empty :" + shopping1.isEmptyCart);

    Shopping shopping2 = new Shopping();
    shopping2.Items = 2;
    shopping2.TotalPrice = 356.99;
    shopping2.Discount = 5.0;
    shopping2.UserId="vaishnavi1";
    shopping2.isEmptyCart=true;

    System.out.println("add item into the cart :" + shopping2.Items);
    System.out.println("total price of the product:" + shopping2.TotalPrice);
    System.out.println("discount for product :" + shopping2.Discount);
    System.out.println("user id for the customer :" + shopping2.UserId);
    System.out.println("the cart is empty :" + shopping2.isEmptyCart);
        }
}
          
 

           