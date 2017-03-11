//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.pandaos.smartconfig.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.googlecode.androidannotations.api.BackgroundExecutor;

public final class MDnsHelper_
    extends MDnsHelper
{

    private Context context_;

    private MDnsHelper_(Context context) {
        context_ = context;
        init_();
    }

    public void afterSetContentView_() {
        if (!(context_ instanceof Activity)) {
            return ;
        }
    }

    /**
     * You should check that context is an activity before calling this method
     * 
     */
    public View findViewById(int id) {
        Activity activity_ = ((Activity) context_);
        return activity_.findViewById(id);
    }

    @SuppressWarnings("all")
    private void init_() {
        if (context_ instanceof Activity) {
            Activity activity = ((Activity) context_);
        }
    }

    public static MDnsHelper_ getInstance_(Context context) {
        return new MDnsHelper_(context);
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

    @Override
    public void startDiscovery() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MDnsHelper_.super.startDiscovery();
                } catch (RuntimeException e) {
                    Log.e("MDnsHelper_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void stopDiscovery() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MDnsHelper_.super.stopDiscovery();
                } catch (RuntimeException e) {
                    Log.e("MDnsHelper_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

}