package uk.tw.energy.dto;

import uk.tw.energy.domain.ElectricityReading;

import java.util.List;

public class ElectricityReadings {

    private List<ElectricityReading> electricityReadings;

    public ElectricityReadings(List<ElectricityReading> electricityReadings) {
        this.electricityReadings = electricityReadings;
    }

    public List<ElectricityReading> getElectricityReadings() {
        return electricityReadings;
    }
}
