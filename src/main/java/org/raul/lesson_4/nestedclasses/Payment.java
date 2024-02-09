package org.raul.lesson_4.nestedclasses;

/* 6.Создать класс Payment с внутренним классом, с помощью объектов
которого можно сформировать покупку из нескольких товаров.*/
public class Payment {
    private float cardAccount;

    public Payment() {
    }

    public Payment(float cardAccount) {
        this.cardAccount = cardAccount;
    }

    public float getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(float cardAccount) {
        this.cardAccount = cardAccount;
    }

    public class Shopping {
        private String itemName;
        private float itemPrice;

        public Shopping(String itemName, float itemPrice) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        public String getItemName() {
            return itemName;
        }

        public float getItemPrice() {
            return itemPrice;
        }
    }
}
