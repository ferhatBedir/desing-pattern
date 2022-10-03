package behaviorpattern.templatemethod;

public class Americano extends Coffee {

    public Americano(String name) {
        super(name);
    }

    @Override
    void prepareCoffee() {
        try {
            Thread.sleep(1500);
            System.out.println("Americano prepared with coffee beans and extra water..");

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }

    }


}
