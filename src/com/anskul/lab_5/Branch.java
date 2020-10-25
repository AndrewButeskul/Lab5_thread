
package com.anskul.lab_5;

import java.io.Serializable;

public class Branch implements Serializable
{

    private String name;
    private String state;
    private String id;
    private String country;
    private String city;
    private String index;
    private String phone;
    private String email;
    private String address;
    private final static long serialVersionUID = -1914366872070013372L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Branch() {
    }

    /**
     * 
     * @param country
     * @param address
     * @param city
     * @param phone
     * @param name
     * @param index
     * @param state
     * @param id
     * @param email
     */
    public Branch(String name, String state, String id, String country, String city, String index, String phone, String email, String address) {
        super();
        this.name = name;
        this.state = state;
        this.id = id;
        this.country = country;
        this.city = city;
        this.index = index;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nState: " + state + "\nid: " + id + "\nCountry: " + country + "\nCity " + city + "\nIndex: " + index +
                "\nPhone: " + phone + "\nEmail: " + email + "\nAddress: " + address;
    }

}
