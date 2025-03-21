package com.sravan.SpringRestCRUD_N_UnitTests.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info", schema = "cloud_vendor_info")
public class CloudVendor {

        @Id
        private String vendorId;
        private String vendorName;
        private String vendorAddress;
        private String vendorPhoneNumber;


    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

}

/*

MySQL query to be executed for creating table

  CREATE TABLE cloud_vendor_info.cloud_vendor_info (
    vendor_id VARCHAR(255) PRIMARY KEY,
    vendor_name VARCHAR(255),
    vendor_address VARCHAR(255),
    vendor_phone_number VARCHAR(255)
);
*/

