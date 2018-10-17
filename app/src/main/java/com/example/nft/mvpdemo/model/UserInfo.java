package com.example.nft.mvpdemo.model;

/**
 * Created by nft on 18-10-11.
 */

public class UserInfo {
    private String user_name;
    private String user_pass_word;

    public UserInfo(String name, String passWord){
        this.user_name = name;
        this.user_pass_word = passWord;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass_word() {
        return user_pass_word;
    }

    public void setUser_pass_word(String user_pass_word) {
        this.user_pass_word = user_pass_word;
    }
}
