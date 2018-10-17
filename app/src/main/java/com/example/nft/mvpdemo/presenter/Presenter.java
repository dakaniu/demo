package com.example.nft.mvpdemo.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.nft.mvpdemo.model.IUserModel;
import com.example.nft.mvpdemo.model.UserInfo;
import com.example.nft.mvpdemo.model.UserModel;
import com.example.nft.mvpdemo.view.IUserView;

/**
 * Created by nft on 18-10-11.
 */

public class Presenter implements OnLoadUserListener{
    private final static String TAG = Presenter.class.getSimpleName();
    private IUserView mUserView;
    private IUserModel mUserModel;
    private Context mCtx;
    public Presenter(Context context,IUserView view){
        this.mCtx = context;
        mUserView = view;
        mUserModel = new UserModel();
    }
    public void loadUserInfo(String username){
         mUserModel.getUserInfo(username,this);
    }

    public void saveUserInfo(String username,String password){
        mUserModel.saveUserInfo(username,password);
    }

    @Override
    public void onFailed() {
//        Log.i(TAG,"用户信息加载失败");
        Toast.makeText(mCtx,"用户信息加载失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(UserInfo userInfo) {
//        Log.i(TAG,"用户信息获取成功");
        Toast.makeText(mCtx,"用户信息获取成功",Toast.LENGTH_SHORT).show();
        mUserView.setUsername(userInfo.getUser_name());
        mUserView.setUserPassWord(userInfo.getUser_pass_word());
    }
}
