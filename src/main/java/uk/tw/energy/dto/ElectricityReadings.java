package uk.tw.energy.dto;

import uk.tw.energy.domain.ElectricityReading;

import java.util.List;

public class ElectricityReadings {

    private List<ElectricityReading> electricityReadingList;

    public ElectricityReadings(List<ElectricityReading> electricityReadingList) {
        this.electricityReadingList = electricityReadingList;
    }

    public List<ElectricityReading> getElectricityReadingList() {
        return electricityReadingList;
    }
}
