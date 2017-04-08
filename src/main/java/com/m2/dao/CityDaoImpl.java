package com.m2.dao;


import com.m2.persistence.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CityDaoImpl extends AbstractDao<Integer, City> implements CityDao{
    public City findById(int id) {
        return getByKey(id);
    }

    public List<City> findAllCities() {
        return null;
    }

    public void saveCity(City city) {
        persist(city);
    }

    public void deleteById(int id) {
        delete(findById(id));
    }
}
