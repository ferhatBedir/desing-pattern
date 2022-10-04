package behaviorpattern.strategy;

import java.math.BigDecimal;

public class BankA implements Bank {

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("Bank_A ile %sTL ödemeniz başarıyla alındı..", amount);

    }


}
