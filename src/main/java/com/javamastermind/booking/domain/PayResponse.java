package com.javamastermind.booking.domain;

/**
 * @author lahiru_w
 *
 */
public class PayResponse
{
    private String transactionId;

    private String responseCode;

    private String paymentAmount;

    private String status;

    public String getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getResponseCode()
    {
        return responseCode;
    }

    public void setResponseCode(String responseCode)
    {
        this.responseCode = responseCode;
    }

    public String getPaymentAmount()
    {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount)
    {
        this.paymentAmount = paymentAmount;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

}
