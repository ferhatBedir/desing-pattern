package behaviorpattern.strategy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StrategyPatternTest {

    @ParameterizedTest
    @CsvSource({"BANK_A,100.00", "BANK_B,150.00", "BANK_C,200.00"})
    void should_pay_with_bank_a(String bankName, BigDecimal amount) {

        //GIVEN
        Bank bank = new BankContext(bankName).getBank();

        //WHEN
        assertDoesNotThrow(() -> bank.pay(amount));

        //THEN
        //DoNothing

    }


}
