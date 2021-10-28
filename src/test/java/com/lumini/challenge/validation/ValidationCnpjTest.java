package com.lumini.challenge.validation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ValidationCnpjTest {

    @Test
    public void givenisValidShouldRetunTrue() {
        final String cnpj = "45543915000181";
        boolean isValid = ValidationCnpj.isValid(cnpj);
        assertEquals(isValid, Boolean.TRUE);
    }

    @Test
    public void givenisValidShouldRetunFalse() {
        final String cnpj = "45543915000181xxx";
        boolean isValid = ValidationCnpj.isValid(cnpj);
        assertEquals(isValid, Boolean.FALSE);
    }
}
