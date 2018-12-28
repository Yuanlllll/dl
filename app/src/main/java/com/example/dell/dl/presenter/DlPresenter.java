package com.example.dell.dl.presenter;

import android.util.Log;

import com.example.dell.dl.MainActivity;
import com.example.dell.dl.api.Api;
import com.example.dell.dl.model.DlModel;
import com.example.dell.dl.model.Imodel;

public class DlPresenter implements Ipresenter
{
    MainActivity mview;
    private final DlModel dlModel;

    public DlPresenter(MainActivity mview) {
        this.mview = mview;
        dlModel = new DlModel();
    }

    @Override
    public void dlPre(String name, String pwd) {
        dlModel.dl(Api.LOGIN, name, pwd, new Imodel.DlCallBack() {
            @Override
            public void onStatus(String data) {
                Log.i("sss","onStatus"+data);
                mview.JumpActivity();
            }

            @Override
            public void onFailed() {

            }
        });

    }
}
