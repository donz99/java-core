package patern.decorator;

public class DecoratorTutorial {
    interface Product {int getPrice();}

    class Milk implements Product {
        private final int price;

        Milk(final int price) {this.price = price;}

        @Override
        public int getPrice() {return this.price;}
    }

    class Shop {
        public static void main(String[] args) {

        }
    }
}
