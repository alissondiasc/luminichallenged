package com.lumini.challenge.resource;

import com.lumini.challenge.models.request.CalculateAverageRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/calculate")
public interface CalculateApi {

    @ApiOperation(value = "Cálculo de médias.",
            nickname = "calculateAverage",
            notes = "Retorna o cálculo da média dos dados dornecidos.",
            response = Double.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Double.class)})
    @PostMapping(value = "/average",
            produces = {"application/json"})
    ResponseEntity<Double> calculateAverage(
            @RequestBody CalculateAverageRequest calculateAverageRequest);
}
