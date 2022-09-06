package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    @Test
    void givenOperand1QueryParam_thenCreateQueryString_whenDoseNotAnyExceptions() {
        QueryString queryString = new QueryString("operand1","11");

        assertThat(queryString).isNotNull();
    }
}
