package com.lumini.challenge.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lumini.challenge.exception.UnprocessableEntityException;
import com.lumini.challenge.models.response.AddressResponse;
import com.lumini.challenge.validation.ValidationCnpj;

import java.io.IOException;
import java.io.InputStream;

public class AddressService {

    public static AddressResponse mockAddressResponse(String cnpj) throws IOException {
        if (ValidationCnpj.isValid(cnpj)) {
            return mockAddress();
        }
        throw new UnprocessableEntityException("CNPJ inválido");
    }

    public static AddressResponse mockAddress() throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("mock/addressResponse.json");
        return new ObjectMapper().readValue(is, AddressResponse.class);
    }


}
