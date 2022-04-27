package com.company;

public class Bill implements Comparable{

    //instance variables
    private long billNumber;
    private long clientCode;
    private String dueDate;
    private double amount;

    private static final String SAVE_SEPARATOR = "/";

    //constructor
    public Bill(long billNumber, long clientCode, String dueDate, double amount) {
        this.billNumber = billNumber;
        this.clientCode = clientCode;
        this.dueDate = dueDate;
        this.amount = amount;
    }

    //get+set
    public long getBillNumber() {
        return billNumber;
    }
    public void setBillNumber(long billNumber) {
        this.billNumber = billNumber;
    }

    public long getClientCode() {
        return clientCode;
    }
    public void setClientCode(long clientCode) {
        this.clientCode = clientCode;
    }

    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  billNumber + SAVE_SEPARATOR +
                clientCode + SAVE_SEPARATOR +
                dueDate + SAVE_SEPARATOR +
                amount;
    }

    @Override
    public boolean equals(Object o) {
        Bill bill = (Bill) o;
        return bill.toString().equals(this.toString());
    }

    @Override
    public int compareTo(Object o) {
        Bill bill = (Bill) o;

        if (this.getBillNumber() == bill.getBillNumber()) {
            return 0;
        } else if (this.getBillNumber() < bill.getBillNumber()) {
            return -1;
        } else {
            return 1;
        }

    }

}
