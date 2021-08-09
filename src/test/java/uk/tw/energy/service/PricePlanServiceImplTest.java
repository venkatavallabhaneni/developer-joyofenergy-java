package uk.tw.energy.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.tw.energy.domain.PricePlan;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PricePlanServiceImplTest {


    private PricePlanService pricePlanService;
    private MeterReadingService meterReadingService;

    private static final String PRICE_PLAN_ID = "price-plan-id";
    private static final String SMART_METER_ID = "smart-meter-id";


    @BeforeEach
    public void setUp() {
        List<PricePlan> pricePlans = null;
        meterReadingService = new MeterReadingServiceImpl(new HashMap<>());
        pricePlanService = new PricePlanServiceImpl(pricePlans, meterReadingService);
    }

    @Test
    public void givenMeterIdThatDoesNotHaveAnyElectricityReadingsShouldReturnNull() {

        assertThat(pricePlanService.getConsumptionCostOfElectricityReadingsForEachPricePlan("unknown-id")).isEqualTo(Optional.empty());
    }

   
}
