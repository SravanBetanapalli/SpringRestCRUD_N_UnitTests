package com.sravan.SpringRestCRUD_N_UnitTests.service;

import com.sravan.SpringRestCRUD_N_UnitTests.model.CloudVendor;

import java.util.List;
import java.util.Optional;


public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public Optional<CloudVendor> getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
