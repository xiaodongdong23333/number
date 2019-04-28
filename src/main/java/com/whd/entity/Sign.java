package com.whd.entity;

public class Sign extends SignKey {
    private String checkIn;

    private String checkOut;

    private String isSign;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn == null ? null : checkIn.trim();
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut == null ? null : checkOut.trim();
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign == null ? null : isSign.trim();
    }
}