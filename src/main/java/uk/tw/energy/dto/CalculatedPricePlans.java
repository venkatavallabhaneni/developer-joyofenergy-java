package uk.tw.energy.dto;

import java.util.List;
import java.util.Objects;

public class CalculatedPricePlans {

    private String currentPricePlanId;
    private List<PricePlanComparison> pricePlanComparisons;

    public CalculatedPricePlans(String currentPricePlanId, List<PricePlanComparison> pricePlanComparisons) {
        this.currentPricePlanId = currentPricePlanId;
        this.pricePlanComparisons = pricePlanComparisons;
    }

    public String getCurrentPricePlanId() {
        return currentPricePlanId;
    }

    public List<PricePlanComparison> getPricePlanComparisons() {
        return pricePlanComparisons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatedPricePlans that = (CalculatedPricePlans) o;
        return getCurrentPricePlanId().equals(that.getCurrentPricePlanId()) && getPricePlanComparisons().equals(that.getPricePlanComparisons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrentPricePlanId(), getPricePlanComparisons());
    }
}
