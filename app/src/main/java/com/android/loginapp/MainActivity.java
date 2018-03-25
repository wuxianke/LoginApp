package com.android.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.account)
    EditText accountText;
    @BindView(R.id.password)
    EditText passwordText;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    public void login(View view) {
        String account = accountText.getText().toString();
        String password = passwordText.getText().toString();
        if ("v3887023".equals(account) && "v3862523".equals(password)) {
            Toast.makeText(this, "登陆成功！", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "登录失败！", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    public void test(){}
}
