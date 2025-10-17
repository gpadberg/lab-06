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

    /**
     * This returns the name of the city
     * @return
     *  Return the name of the city
     */
    public String getCityName() {
        return city;
    }

    /**
     * This sets the name of the city
     * @param city
     *  This is the name of the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This returns the name of the province
     * @return
     *  Return the name of the province
     */
    public String getProvinceName() {
        return province;
    }

    /**
     * This sets the name of the province
     * @param province
     *  This is the name of the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This compares two cities based on their names
     * @param c the object to be compared.
     * @return
     *  Return 0 if the names are the same
     */
    @Override
    public int compareTo(City c) {
        return this.city.compareTo(c.getCityName());
    }

    /**
     * This returns whether two cities are equal or not, based on their city and province names
     * @param o
     * @return
     *  Return true if the cities are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.getCityName()) && province.equals(city1.getProvinceName());
    }

    /**
     * This returns the hashcode of the city
     * @return
     *  Return the hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
