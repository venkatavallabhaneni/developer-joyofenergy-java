package uk.tw.energy.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.tw.energy.domain.MeterReadings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MeterReadingServiceTest {

    private MeterReadingServiceImpl meterReadingServiceImpl;

    @BeforeEach
    public void setUp() {
        meterReadingServiceImpl = new MeterReadingServiceImpl(new HashMap<>());
    }

    @Test
    public void givenMeterIdThatDoesNotExistShouldReturnNull() {
        assertThat(meterReadingServiceImpl.getReadings("unknown-id")).isEqualTo(Optional.empty());
    }

    @Test
    public void givenMeterReadingThatExistsShouldReturnMeterReadings() {
        MeterReadings meterReadings = meterReadingServiceImpl.storeReadings("random-id", new ArrayList<>());
        assertThat(meterReadingServiceImpl.getReadings("random-id").get().getElectricityReadings()).isEqualTo(new ArrayList<>());
    }
}
