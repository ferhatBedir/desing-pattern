package behaviorpattern.templatemethod;

public abstract class Coffee {

    private final String name;

    protected Coffee(String name) {
        this.name = name;

    }

    public void doCoffee() {
        grindCoffeeBeans();
        prepareCoffee();
        deliverCoffee();

    }

    private void grindCoffeeBeans() {
        System.out.println("Coffee beans grinded..");

    }

    abstract void prepareCoffee();

    private void deliverCoffee() {
        System.out.printf("Coffee: %s delivered..", this.name);

    }


}
