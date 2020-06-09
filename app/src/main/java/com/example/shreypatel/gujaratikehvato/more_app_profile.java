package com.example.shreypatel.gujaratikehvato;

public class more_app_profile {

    private String app_name, app_info;
    private int image1;


    public more_app_profile(String app_name, String app_info, int image1) {
        this.app_name = app_name;
        this.app_info = app_info;
        this.image1 = image1;
    }

    public String getTxt1() {
        return app_name;
    }

    public void setTxt1(String app_name) {
        this.app_name = app_name;
    }


    public String getText() {
        return app_info;
    }

    public void setText(String app_info) {
        this.app_info = app_info;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }
}
