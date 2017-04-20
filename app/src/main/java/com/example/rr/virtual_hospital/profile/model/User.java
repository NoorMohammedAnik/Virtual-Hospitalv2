package com.example.rr.virtual_hospital.profile.model;

/**
 * Created by Ramim on 4/20/2017.
 */

public class User {
    private String Name, BloodGroup, CotactNumber,Address,LastDonated,Division;

    public User() {
    }

    public User(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public String getCotactNumber() {
        return CotactNumber;
    }

    public void setCotactNumber(String cotactNumber) {
        CotactNumber = cotactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLastDonated() {
        return LastDonated;
    }

    public void setLastDonated(String lastDonated) {
        LastDonated = lastDonated;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }
}
