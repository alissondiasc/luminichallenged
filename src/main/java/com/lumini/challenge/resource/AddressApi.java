package com.lumini.challenge.resource;

import com.lumini.challenge.models.response.AddressResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api/v1/address")
public interface AddressApi {


    @ApiOperation(value = "Consulta o endereço do beneficiario", nickname = "getAnddress")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = AddressResponse.class)})
    @GetMapping(value = "/cnpj/{cnpj}",
            produces = {"application/json"})
    ResponseEntity<AddressResponse> findAnddressByCnpj(@PathVariable("cnpj")
                                                       @ApiParam(value = "CNPJ", required = true) String cnpj) throws IOException;
}
