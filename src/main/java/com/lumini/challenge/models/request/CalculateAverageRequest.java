package com.lumini.challenge.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lumini.challenge.commons.Model;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class CalculateAverageRequest extends Model {

    @JsonProperty("notes")
    @ApiModelProperty(example = "[5.5,7.8]", value = "Valores para retirar a média", required = true)
    private List<Float> notes;

    public List<Float> getNotes() {
        return notes;
    }

    public void setNotes(List<Float> notes) {
        this.notes = notes;
    }
}
