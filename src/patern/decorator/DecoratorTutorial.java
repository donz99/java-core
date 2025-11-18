package patern.decorator;

public class DecoratorTutorial {
}

interface Product {
    int getPrice();
} // В этом магазине продаются продукты (создаём интерфейс Product)

class Milk implements Product {  // Есть конкретный пордукт (молоко)
    private final int price;    // Имеет поле price

    Milk(final int price) {
        this.price = price;
    } // И имеет конструктор в котором задаётся price

    @Override
    public int getPrice() {
        return this.price;
    }  // И реализацию метода getPrice (от интерфейса)
}

abstract class Decorator implements Product {
    final Product product;

    protected Decorator(Product product){
        this.product = product;
    }
}

class MilkDiscount extends Decorator {
    public MilkDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice()-15;
    }
}

class Shop {   // У нас есть некий магазин (класс Магазин)
    public static void main(String[] args) {
        Product milk = new Milk(50);
        Product milkDiscount = new MilkDiscount(milk);
        Product milkDiscount2 = new MilkDiscount(new MilkDiscount(milk));

        System.out.println(milkDiscount.getPrice());
        System.out.println(milkDiscount2.getPrice());
    }
}
