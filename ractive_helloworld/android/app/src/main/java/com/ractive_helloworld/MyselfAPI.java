package com.ractive_helloworld;



import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.widget.Toast;
import java.util.Map;
import java.util.HashMap;
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
}
