package com.ctse.firebasetesting;

public class Driver {

    private String UID;

    public Driver(String UID, double longitude, double latitude) {
        this.UID = UID;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Driver() {
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private double longitude;
    private double latitude;

}
