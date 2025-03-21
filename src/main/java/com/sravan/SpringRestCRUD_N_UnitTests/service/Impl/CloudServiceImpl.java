package com.sravan.SpringRestCRUD_N_UnitTests.service.Impl;

import com.sravan.SpringRestCRUD_N_UnitTests.repository.CloudVendorRepository;
import com.sravan.SpringRestCRUD_N_UnitTests.model.CloudVendor;
import com.sravan.SpringRestCRUD_N_UnitTests.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public Optional<CloudVendor> getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId);
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {

        return cloudVendorRepository.findAll();
    }
}
