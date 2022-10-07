package com.serenitydojo.datatypes;

import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

public class WhenWorkingWithFloatingPointNumbers {
    @Test
    public void convertingTemperature() {
        float celsius = 0F;
        float convertToFahrenheit = (celsius * 9/5) + 32;
        System.out.println(convertToFahrenheit);

    }
    @Test
    public void convertingWeights(){
        float kilos = 50F;
        float constant = 2.205F;

        float convertToPounds = kilos * constant;
        System.out.println(convertToPounds);
    }
}
