package com.sensationalk.android.myuidesign;

import android.media.Image;

/**
 * Created by user on 11/07/2016.
 */
public class Modelclass  {
    private int pictures;
    private String name;
    private Float money;
    private String date;
    private int btnColor;
    public String btnText;

    public Modelclass(int btnColor, String btnText, String date, Float money, String name, int pictures) {
        this.btnColor = btnColor;
        this.btnText = btnText;
        this.date = date;
        this.money = money;
        this.name = name;
        this.pictures = pictures;
    }

    public int getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(int btnColor) {
        this.btnColor = btnColor;
    }

    public String getBtnText() {
        return btnText;
    }

    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPictures() {
        return pictures;
    }

    public void setPictures(int pictures) {
        this.pictures = pictures;
    }
}
