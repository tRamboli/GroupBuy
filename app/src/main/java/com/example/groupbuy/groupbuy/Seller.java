package com.example.groupbuy.groupbuy;

import android.location.Address;

import java.util.Date;

public class Seller {
    private int uid;
    private String nickname;
    private String firstname;
    private String eMail;
    private String password;
    private String surname;
    private String PhoneNumber;
    private Date birthDate;
    private Address [] shippingaddress;
    private double rating;
    private int ratesCount;

    public Seller(int uid, String nickname, String firstname, String eMail, String password, String surname, String phoneNumber, Date birthDate, Address[] shippingaddress) {
        this.uid = uid;
        this.nickname = nickname;
        this.firstname = firstname;
        this.eMail = eMail;
        this.password = password;
        this.surname = surname;
        PhoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.shippingaddress = shippingaddress;
        rating=0;
        ratesCount=0;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setShippingaddress(Address[] shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRatesCount(int ratesCount) {
        this.ratesCount = ratesCount;
    }

    public int getUid() {
        return uid;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Address[] getShippingaddress() {
        return shippingaddress;
    }

    public double getRating() {
        return rating;
    }

    public int getRatesCount() {
        return ratesCount;
    }


}
