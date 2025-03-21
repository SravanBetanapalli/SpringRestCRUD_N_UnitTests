package com.sravan.SpringRestCRUD_N_UnitTests.controller;


import com.sravan.SpringRestCRUD_N_UnitTests.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    private CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendor;
        /*new CloudVendor("C1","Vendor 1","Address One","XXXXXX");*/
    }

    @PostMapping("/createvendor")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfull ";
    }


    @PutMapping("/updatevendor")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfull ";
    }

    @DeleteMapping("/deletevendor/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        if(this.cloudVendor.getVendorId().equals(vendorId)){
        this.cloudVendor=null;
        }
        return "CloudVendor of id - " +vendorId+" - is deleted";
    }
}
