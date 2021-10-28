package com.lumini.challenge.service;

import com.lumini.challenge.models.request.CalculateAverageRequest;

public class CalculateService {


    public static Double calculateAverage(CalculateAverageRequest request) {
        Double average = request.getNotes().stream()
                .mapToDouble(Float::doubleValue)
                .average()
                .orElse(Double.NaN);
        return average;
    }
}
