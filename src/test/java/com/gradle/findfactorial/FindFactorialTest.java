package com.gradle.findfactorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFactorialTest {

    @Test
    void sholudReturnFactorialAsMinusOneWhenTheNumberIsNegative() {

        FindFactorial findFactorial = new FindFactorial(-2);
        assert findFactorial.findFactorilOfANumber()==-1;


    }

    @Test
    void shouldReturnFactorialAsOneWhenTheNumberIsZero() {

        FindFactorial findFactorial = new FindFactorial(0);
        assert findFactorial.findFactorilOfANumber()==1;

    }

    @Test
    void shouldReturnFactorialAsOneWhenTheNumberIsOne() {

        FindFactorial findFactorial = new FindFactorial(1);
        assert findFactorial.findFactorilOfANumber()==1;

    }

    @Test
    void shouldReturnFactorialAsTwoWhenTheNumberIsTwo() {

        FindFactorial findFactorial = new FindFactorial(2);

    assert findFactorial.findFactorilOfANumber()==2;
    }

    @Test
    void shouldReturnFactorialAsSixWhenTheNumberIsThree(){
        FindFactorial findFactorial=new FindFactorial(3);
        assert findFactorial.findFactorilOfANumber()==6;

}
}



