package com.lumini.challenge.resource;

import com.lumini.challenge.models.response.AddressResponse;
import com.lumini.challenge.service.AddressService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
@Api(tags = {"Address"})
public class AddressResource implements AddressApi {

    @Override
    public ResponseEntity<AddressResponse> findAnddressByCnpj(String cnpj) throws IOException {
        return ResponseEntity.ok(AddressService.mockAddressResponse(cnpj));
    }
}
