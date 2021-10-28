package com.lumini.challenge.service;

import com.lumini.challenge.models.request.CalculateAverageRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculateServiceTest {

    @Test
    public void givenCalculateAverageShouldReutnCorrect() {
        CalculateAverageRequest request = new CalculateAverageRequest();
        request.setNotes(Arrays.asList(10.0f, 10.0f));
        Double average = CalculateService.calculateAverage(request);

        assertEquals(average, 10.0D);
    }

    @Test
    public void givenCalculateAverageShouldReutnIncorrect() {
        CalculateAverageRequest request = new CalculateAverageRequest();
        request.setNotes(Arrays.asList(10.0f, 10.0f));
        Double average = CalculateService.calculateAverage(request);

        assertThat(average, is(not(5.0)));
    }
}
