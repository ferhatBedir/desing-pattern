package behaviorpattern.strategy;

import java.math.BigDecimal;

public class BankB implements Bank {

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("Bank_B ile %sTL ödemeniz başarıyla alındı..", amount);

    }


}
