package learn.note.design_pattern;


interface Product {
    void display();
}

class ConcreteProductA implements Product {
    @Override
    public void display() {
        System.out.println("Product A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void display() {
        System.out.println("Product B");
    }
}

interface Factory {
    Product createProduct();
}

class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
