package behaviorpattern.strategy;

import java.math.BigDecimal;

public class BankC implements Bank {

    @Override
    public void pay(BigDecimal amount) {
        System.out.printf("Bank_C ile %sTL ödemeniz başarıyla alındı..", amount);

    }


}
