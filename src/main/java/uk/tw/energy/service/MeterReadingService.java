package uk.tw.energy.service;

import uk.tw.energy.domain.ElectricityReading;
import uk.tw.energy.domain.MeterReadings;
import uk.tw.energy.dto.ElectricityReadings;

import java.util.List;
import java.util.Optional;

public interface MeterReadingService {

    public Optional<ElectricityReadings> getReadings(String smartMeterId);

    public MeterReadings storeReadings(String smartMeterId, List<ElectricityReading> electricityReadings);
}
