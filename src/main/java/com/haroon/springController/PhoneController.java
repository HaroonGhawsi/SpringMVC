package com.haroon.springController;


import com.haroon.springModel.Phone;
import com.haroon.springService.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhoneController {

    private PhoneService phoneService;

    @Autowired(required = true)
    @Qualifier(value = "phoneService")
    public void setPhoneService(PhoneService ps){
        this.phoneService = ps;
    }

    @RequestMapping(value = "/phones", method = RequestMethod.GET)
    public String listPhones(Model model){
        model.addAttribute("phone", new Phone());
        model.addAttribute("listPhones", this.phoneService.listPhones());

        return "phone";
    }

    /*
    For add and update phone both
     */

    @RequestMapping(value = "/phone/add", method = RequestMethod.POST)
    public String addPhone(@ModelAttribute("phone") Phone p){
        if(p.getId() == 0){
            // new phone, add it
            this.phoneService.addPhone(p);
        }else {
            /*
            Existing phone, call update
             */
            this.phoneService.updatePhone(p);
        }
        return "redirect:/phones";
    }
}
