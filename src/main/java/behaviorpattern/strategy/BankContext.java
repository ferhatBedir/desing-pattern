package behaviorpattern.strategy;


public class BankContext {

    private final Bank bank;

    public BankContext(String bankName) {
        if ("BANK_A".equals(bankName)) {
            this.bank = new BankA();
            return;
        } else if ("BANK_B".equals(bankName)) {
            this.bank = new BankB();
            return;
        } else if ("BANK_C".equals(bankName)) {
            this.bank = new BankC();
            return;
        }

        this.bank = null;

    }

    public Bank getBank() {
        return bank;

    }


}
