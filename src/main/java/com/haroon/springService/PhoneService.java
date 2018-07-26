package com.haroon.springService;

import com.haroon.springModel.Phone;

import java.util.List;

public interface PhoneService {

    public void addPhone(Phone p);
    public void updatePhone(Phone p);
    public List<Phone> listPhones();
    public Phone getPhoneById(int id);
    public void removePhone(int id);

}
