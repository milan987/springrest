package com.m2.dao;

import com.m2.persistence.City;

import java.util.List;


public interface CityDao {
    City findById(int id);

    public List<City> findAllCities();

    void saveCity(City city);

    void deleteById(int id);

}
