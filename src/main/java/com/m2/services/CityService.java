package com.m2.services;

import com.m2.dao.CityDao;
import com.m2.persistence.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityDao cityDao;

    public City findById(int id){
        return cityDao.findById(id);
    }
}
