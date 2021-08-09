package uk.tw.energy.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class PricePlanComparison {

    private String pricePlanId;
    private BigDecimal calculatePrice;

    public BigDecimal getCalculatePrice() {
        return calculatePrice;
    }

    public String getPricePlanId() {
        return pricePlanId;
    }

    public PricePlanComparison(String pricePlanId, BigDecimal calculatePrice) {
        this.pricePlanId = pricePlanId;
        this.calculatePrice = calculatePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricePlanComparison that = (PricePlanComparison) o;
        return pricePlanId.equals(that.pricePlanId) && calculatePrice.equals(that.calculatePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePlanId, calculatePrice);
    }
}
