package com.example.dell.dl.model;

import android.util.Log;

import com.example.dell.dl.network.MyTask;

public class DlModel implements Imodel
{

    @Override
    public void dl(final String url, final String username, final String pwd, final DlCallBack dlCallBack)
    {
        new Runnable()
        {
            @Override
            public void run() {
                new MyTask<String>(url,username,pwd).setTaskListener(new MyTask.TaskListeners() {
                    @Override
                    public void result(String t)
                    {
                        Log.i("ddd","result"+t);
                        if (t!=null)
                        {
                            dlCallBack.onStatus(t);
                        }
                        else
                        {
                            dlCallBack.onFailed();
                        }

                    }
                }).execute();

            }
        }.run();


    }
}
