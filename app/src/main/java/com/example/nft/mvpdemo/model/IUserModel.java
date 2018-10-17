package com.example.nft.mvpdemo.model;

import com.example.nft.mvpdemo.presenter.OnLoadUserListener;

/**
 * Created by nft on 18-10-11.
 */

public interface IUserModel {
    void saveUserInfo(String userName,String passWord);
    void getUserInfo(String userName, OnLoadUserListener loadUserListener);
}
