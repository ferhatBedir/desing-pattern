package behaviorpattern.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TemplateMethodTest {

    @Test
    void should_do_espresso() {

        //GIVEN
        Coffee coffee = new Espresso("Espresso");

        //WHEN
        assertDoesNotThrow(coffee::doCoffee);

        //THEN
        //DoNothing

    }

    @Test
    void should_do_americano() {

        //GIVEN
        Coffee coffee = new Americano("Americano");

        //WHEN
        assertDoesNotThrow(coffee::doCoffee);

        //THEN
        //DoNothing

    }

    @Test
    void should_do_latte() {

        //GIVEN
        Coffee coffee = new Latte("Latte");

        //WHEN
        assertDoesNotThrow(coffee::doCoffee);

        //THEN
        //DoNothing

    }


}
