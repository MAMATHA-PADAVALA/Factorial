package com.gradle.findfactorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFactorialTest {

    @Test
    void sholudReturnMinusOneForNegativeNumber() {

        FindFactorial findFactorial = new FindFactorial(-2);
        assert findFactorial.findFactorilOfANumber()==-1;


    }

    @Test
    void shouldReturnOneForZero() {

        FindFactorial findFactorial = new FindFactorial(0);
        assert findFactorial.findFactorilOfANumber()==1;

    }

    @Test
    void shouldReturnOneForOne() {

        FindFactorial findFactorial = new FindFactorial(1);
        assert findFactorial.findFactorilOfANumber()==1;

    }

    @Test
    void shouldReturnTwoForTwo() {

        FindFactorial findFactorial = new FindFactorial(2);

    assert findFactorial.findFactorilOfANumber()==2;
    }
}



