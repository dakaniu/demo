package com.example.nft.mvpdemo.model;

import android.content.pm.PackageManager;
import android.util.SparseArray;

import com.example.nft.mvpdemo.presenter.OnLoadUserListener;

import java.util.HashMap;

/**
 * Created by nft on 18-10-11.
 */

public class UserModel implements IUserModel{

    private SparseArray<UserInfo> mUsersArray = new SparseArray<>();
    private HashMap<String,UserInfo> map = new HashMap();
    @Override
    public void saveUserInfo(String userName,String passWord) {
//        mUsersArray.append(String.valueOf(userName),new UserInfo(userName,passWord));
        map.put(userName,new UserInfo(userName,passWord));
    }

    @Override
    public void getUserInfo(String userName, OnLoadUserListener loadUserListener) {
        try {
            UserInfo userInfo = map.get(userName);
            if (userInfo == null){
                loadUserListener.onFailed();
            } else {
                loadUserListener.onSuccess(userInfo);
            }
        } catch (Exception e){
            loadUserListener.onFailed();
        }
    }
}
