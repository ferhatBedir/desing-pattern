package behaviorpattern.templatemethod;

public class Espresso extends Coffee {

    public Espresso(String name) {
        super(name);
    }

    @Override
    void prepareCoffee() {
        try {
            Thread.sleep(1000);
            System.out.println("Espresso prepared with coffee beans and water..");

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }
    }


}
