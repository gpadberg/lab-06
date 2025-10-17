package com.example.listycity;

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
}
