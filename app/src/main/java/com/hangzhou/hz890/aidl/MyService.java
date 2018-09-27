package com.hangzhou.hz890.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       return new MyBinder();
    }

    class MyBinder extends IMyAidlInterface.Stub{

        @Override
        public String getName() throws RemoteException {
            return "服务器返回的数据";
        }

        @Override
        public void setName(String name) throws RemoteException {
            Log.e("xxx:",name);
        }
    }

}
