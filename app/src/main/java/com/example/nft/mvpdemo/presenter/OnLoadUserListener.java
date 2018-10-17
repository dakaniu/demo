package com.example.nft.mvpdemo.presenter;

import com.example.nft.mvpdemo.model.UserInfo;

/**
 * Created by nft on 18-10-17.
 */

public interface OnLoadUserListener {
    void onSuccess(UserInfo userInfo);
    void onFailed();
}
