package com.example.dell.dl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.dl.presenter.DlPresenter;
import com.example.dell.dl.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview {

    private EditText text_phone;
    private EditText text_pwd;
    private Button btn_dl;
    private Button btn_zc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_phone = findViewById(R.id.text_phone);
        text_pwd = findViewById(R.id.text_pwd);
        btn_dl = findViewById(R.id.btn_dl);
        btn_zc = findViewById(R.id.btn_zc);
        //获取输入框内容
        final String name = text_phone.getText().toString();
        final String pwd = text_pwd.getText().toString();
        final DlPresenter dlPresenter = new DlPresenter(this);
        btn_dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.isEmpty()&&!pwd.isEmpty())
                {
                    dlPresenter.dlPre(name,pwd);
                }
            }
        });
    }



    @Override
    public void JumpActivity() {

    }

    @Override
    public void ToastActivity() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hiddenLoading() {

    }
}
