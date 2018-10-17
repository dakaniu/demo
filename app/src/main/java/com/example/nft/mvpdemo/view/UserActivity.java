package com.example.nft.mvpdemo.view;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nft.mvpdemo.R;
import com.example.nft.mvpdemo.presenter.Presenter;

public class UserActivity extends Activity implements IUserView,View.OnClickListener{

    private EditText mUserName,mPassWord;
    private Button mLoad,mSave;
    private Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initView();
        mLoad.setOnClickListener(this);
        mSave.setOnClickListener(this);
        mPresenter = new Presenter(getApplicationContext(),this);
    }
    private void initView(){
        mUserName = (EditText)findViewById(R.id.edit_name);
        mPassWord=(EditText)findViewById(R.id.edit_pass_word);
        mLoad = (Button) findViewById(R.id.bt_load);
        mSave = findViewById(R.id.bt_save);
    }

    @Override
    public void setUsername(String username) {
        mUserName.setText(username);
        mUserName.setTextColor(Color.GREEN);
    }

    @Override
    public void setUserPassWord(String passWord) {
        mPassWord.setText(passWord);
        mPassWord.setTextColor(Color.GREEN);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.bt_load:
                mPresenter.loadUserInfo(mUserName.getText().toString());
                break;
            case R.id.bt_save:
                mPresenter.saveUserInfo(mUserName.getText().toString(),mPassWord.getText().toString());
                break;
        }

    }
}
