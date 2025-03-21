package com.sravan.SpringRestCRUD_N_UnitTests.controller;


import com.sravan.SpringRestCRUD_N_UnitTests.model.CloudVendor;
import com.sravan.SpringRestCRUD_N_UnitTests.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    @Autowired
    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService)
    {
        this.cloudVendorService=cloudVendorService;
    }
    private CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId).get();
        //return cloudVendor;
        /*new CloudVendor("C1","Vendor 1","Address One","XXXXXX");*/
    }

    @GetMapping("/allcloudvendors")
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping("/createvendor")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfull ";
    }


    @PutMapping("/updatevendor")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        //this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfull ";
    }

    @DeleteMapping("/deletevendor/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        if(cloudVendorService.getCloudVendor(vendorId).isPresent()){
        cloudVendorService.deleteCloudVendor(vendorId);
        }else return "CloudVendor of id - " +vendorId+" - is already deleted before";
        return "CloudVendor of id - " +vendorId+" - is deleted";
    }
}
