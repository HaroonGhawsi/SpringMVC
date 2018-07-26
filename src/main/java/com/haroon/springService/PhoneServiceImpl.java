package com.haroon.springService;

import com.haroon.springDao.PhoneDAO;
import com.haroon.springModel.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    public void setPhoneDAO(PhoneDAO phoneDAO){
        this.phoneDAO = phoneDAO;
    }


    @Override
    public void addPhone(Phone p) {
        this.phoneDAO.addPhone(p);

    }

    @Override
    public void updatePhone(Phone p) {
        this.phoneDAO.updatePhone(p);

    }

    @Override
    public List<Phone> listPhones() {

        return this.phoneDAO.listPhones();
    }

    @Override
    public Phone getPhoneById(int id) {
        return this.phoneDAO.getPhoneById(id);
    }

    @Override
    public void removePhone(int id) {
        this.phoneDAO.removePhone(id);
    }
}
