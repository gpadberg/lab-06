package com.example.listycity;

import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * This is a class that defines a city.
 * @author Grace Padberg
 * @version 1.0
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceName() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int compareTo(City c) {
        return this.city.compareTo(c.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.getCityName()) && province.equals(city1.getProvinceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
