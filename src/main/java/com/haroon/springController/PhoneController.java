package com.haroon.springController;


import com.haroon.springModel.Phone;
import com.haroon.springService.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneController {

    private PhoneService phoneService;

    @Autowired(required = true)
    @Qualifier(value = "phoneService")
    public void setPhoneService(PhoneService ps){
        this.phoneService = ps;
    }
}
