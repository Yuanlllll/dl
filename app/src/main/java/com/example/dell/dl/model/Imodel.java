package com.example.dell.dl.model;

public interface Imodel
{
    public void dl(String url,String username,String pwd,DlCallBack dlCallBack);
    interface DlCallBack
    {
        public void onStatus(String data);
        public void onFailed();
    }
}
