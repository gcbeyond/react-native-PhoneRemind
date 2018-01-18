package com.ractive_helloworld;



import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.widget.Toast;
import java.util.Map;
import java.util.HashMap;

import javax.annotation.Nullable;

/**
 * Created by xyt on 2018/1/18.
 */

public class MyselfAPI extends ReactContextBaseJavaModule {
    private  static final String DURATION_SHORT_KEY="SHORT";
    private static final String DURATION_LONG_KEY="LONG";

    public MyselfAPI(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastExample";
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String,Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY,MyselfAPI.DURATION_SHORT_KEY);
        constants.put(DURATION_LONG_KEY,MyselfAPI.DURATION_LONG_KEY);
        return constants;
    }
    @ReactMethod
    public void show(String message,int duration){
        Toast.makeText(getReactApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
