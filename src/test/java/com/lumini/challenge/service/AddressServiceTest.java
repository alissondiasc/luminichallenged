package com.lumini.challenge.service;

import com.lumini.challenge.exception.UnprocessableEntityException;
import com.lumini.challenge.models.response.AddressResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AddressServiceTest {

    @Test
    public void givenMockAddressShouldReturnOk() throws IOException {
        final String cnpj = "45543915000181";
        final AddressResponse expect = AddressService.mockAddress();

        AddressResponse actual = AddressService.mockAddressResponse(cnpj);

        assertEquals("Deve retornar o mesmo objeto",
                actual, expect);

    }

    @Test(expected = UnprocessableEntityException.class)
    public void givenMockAddressShouldReturUnprocessableEntity() throws IOException {
        final String cnpj = "45543915000-6181";
        final AddressResponse expect = AddressService.mockAddress();

        AddressService.mockAddressResponse(cnpj);

    }
}
