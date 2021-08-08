package uk.tw.energy.service;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import uk.tw.energy.domain.ElectricityReading;
import uk.tw.energy.domain.MeterReadings;
import uk.tw.energy.dto.ElectricityReadings;

import java.sql.Array;
import java.util.*;

@Service
public class MeterReadingServiceImpl implements MeterReadingService {

    private final Map<String, List<ElectricityReading>> meterAssociatedReadings;

    public MeterReadingServiceImpl(Map<String, List<ElectricityReading>> meterAssociatedReadings) {
        this.meterAssociatedReadings = meterAssociatedReadings;
    }

    @Override
    public Optional<ElectricityReadings> getReadings(String smartMeterId) {

       List<ElectricityReading> electricityReadingList = meterAssociatedReadings.get(smartMeterId);
       return Optional.ofNullable(electricityReadingList==null ? null :new ElectricityReadings(meterAssociatedReadings.get(smartMeterId)));
    }

    @Override
    public MeterReadings storeReadings(String smartMeterId, List<ElectricityReading> electricityReadings) {
        meterAssociatedReadings.computeIfAbsent(smartMeterId,key-> new ArrayList<>());
        meterAssociatedReadings.get(smartMeterId).addAll(electricityReadings);
        return new MeterReadings(smartMeterId, meterAssociatedReadings.get(smartMeterId));
    }
}
