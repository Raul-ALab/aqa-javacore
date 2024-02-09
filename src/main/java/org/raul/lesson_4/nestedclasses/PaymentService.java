package org.raul.lesson_4.nestedclasses;

class PaymentService {
    public static void shoppingCart(Payment payment, String item, float price) {
        Payment.Shopping shopping = payment.new Shopping(item, price);

        if (payment.getCardAccount() >= shopping.getItemPrice()) {
            float updatedBalance = payment.getCardAccount() - shopping.getItemPrice();
            System.out.println("Operation completed. You bought " + shopping.getItemName());

            payment.setCardAccount(updatedBalance); // decrease balance
            System.out.println("Your card balance is " + payment.getCardAccount());
        } else {
            System.out.println("You don't have sufficient balance for " + shopping.getItemName());
        }
    }
}
