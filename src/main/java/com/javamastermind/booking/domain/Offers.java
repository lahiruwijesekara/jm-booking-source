package com.javamastermind.booking.domain;

/**
 * @author lahiru_w
 *
 */
public class Offers
{
    private String offername;

    private String startDate;

    private String validTill;

    private String offerDiscription;

    private String fullPrice;

    private String discountedPrice;

    public String getOffername()
    {
        return offername;
    }

    public void setOffername(String offername)
    {
        this.offername = offername;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getValidTill()
    {
        return validTill;
    }

    public void setValidTill(String validTill)
    {
        this.validTill = validTill;
    }

    public String getOfferDiscription()
    {
        return offerDiscription;
    }

    public void setOfferDiscription(String offerDiscription)
    {
        this.offerDiscription = offerDiscription;
    }

    public String getFullPrice()
    {
        return fullPrice;
    }

    public void setFullPrice(String fullPrice)
    {
        this.fullPrice = fullPrice;
    }

    public String getDiscountedPrice()
    {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice)
    {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString()
    {
        return "Offers [offername=" + offername + ", startDate=" + startDate + ", validTill=" + validTill
            + ", offerDiscription=" + offerDiscription + ", fullPrice=" + fullPrice + ", discountedPrice="
            + discountedPrice + "]";
    }

}
