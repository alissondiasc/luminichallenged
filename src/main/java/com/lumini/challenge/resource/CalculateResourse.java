package com.lumini.challenge.resource;

import com.lumini.challenge.models.request.CalculateAverageRequest;
import com.lumini.challenge.service.CalculateService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@Api(tags = {"Calculate"})
public class CalculateResourse implements CalculateApi {

    @Override
    public ResponseEntity<Double> calculateAverage(CalculateAverageRequest request) {

        return ResponseEntity.ok(CalculateService.calculateAverage(request));
    }
}
