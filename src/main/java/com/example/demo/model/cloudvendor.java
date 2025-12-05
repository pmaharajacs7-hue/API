package com.example.demo.model;

public class cloudvendor {
    private String vendorname;
    private String vendorlocation;
    private String vendorph;
    private String vendorId;

    public cloudvendor()   {
    }

    public cloudvendor(String vendorname, String vendorlocation, String vendorph, String vendorId) {
        this.vendorname = vendorname;
        this.vendorlocation = vendorlocation;
        this.vendorph = vendorph;
        this.vendorId = vendorId;
    }
    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }
    public String getVendorname() {
        return vendorname;
    }
    public void setVendorlocation(String vendorlocation) {
        this.vendorlocation = vendorlocation;
    }
    public String getVendorlocation() {
        return vendorlocation;
    }
    public void setVendorph(String vendorph) {
        this.vendorph = vendorph;
    }
    public String getVendorph() {
        return vendorph;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorId() {
        return vendorId;
}
}