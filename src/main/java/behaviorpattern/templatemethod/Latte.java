package behaviorpattern.templatemethod;

public class Latte extends Coffee {

    public Latte(String name) {
        super(name);
    }

    @Override
    void prepareCoffee() {
        try {
            Thread.sleep(2000);
            System.out.println("Latte prepared with coffee beans and milk..");

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }
    }


}
