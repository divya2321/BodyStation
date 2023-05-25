/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Beans;

import java.util.Date;

/**
 *
 * @author nipun
 */
public class PaymentInvoiceModel {
      /**
     * @return the fromD
     */
    public Date getFromD() {
        return fromD;
    }

    /**
     * @param fromD the fromD to set
     */
    public PaymentInvoiceModel setFromD(Date fromD) {
        this.fromD = fromD;
        return this;
    }

    /**
     * @return the toD
     */
    public Date getToD() {
        return toD;
    }

    /**
     * @param toD the toD to set
     */
    public PaymentInvoiceModel setToD(Date toD) {
        this.toD = toD;
        return this;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public PaymentInvoiceModel setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * @return the invId
     */
    public int getInvId() {
        return invId;
    }

    /**
     * @param invId the invId to set
     */
    public PaymentInvoiceModel setInvId(int invId) {
        this.invId = invId;
        return this;
    }

    /**
     * @return the memId
     */
    public int getMemId() {
        return memId;
    }

    /**
     * @param memId the memId to set
     */
    public PaymentInvoiceModel setMemId(int memId) {
        this.memId = memId;
        return this;
    }
    
    private Date fromD;
    private Date toD;
    private String paymentType;
    private int invId;
    private int memId;
    
}