//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.pandaos.smartconfig;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.pandaos.smartconfig.R.layout;
import com.pandaos.smartconfig.utils.Device;
import com.pandaos.smartconfig.utils.DeviceListAdapter_;
import com.pandaos.smartconfig.utils.RecentDeviceListAdapter_;
import com.pandaos.smartconfig.utils.SharedPreferencesInterface_;

public final class DevicesFragment_
    extends DevicesFragment
{

    private View contentView_;
    private Handler handler_ = new Handler();

    private void init_(Bundle savedInstanceState) {
        prefs = new SharedPreferencesInterface_(getActivity());
        recentDeviceListAdapter = RecentDeviceListAdapter_.getInstance_(getActivity());
        deviceListAdapter = DeviceListAdapter_.getInstance_(getActivity());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
        devices_refresh_spinner = ((ProgressBar) findViewById(com.pandaos.smartconfig.R.id.devices_refresh_spinner));
        devices_recent_listview = ((ListView) findViewById(com.pandaos.smartconfig.R.id.devices_recent_listview));
        devices_list_listview = ((ListView) findViewById(com.pandaos.smartconfig.R.id.devices_list_listview));
        devices_refresh_button = ((ImageView) findViewById(com.pandaos.smartconfig.R.id.devices_refresh_button));
        {
            View view = findViewById(com.pandaos.smartconfig.R.id.devices_refresh_button);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DevicesFragment_.this.devices_refresh_button();
                    }

                }
                );
            }
        }
        {
            AdapterView<?> view = ((AdapterView<?> ) findViewById(com.pandaos.smartconfig.R.id.devices_list_listview));
            if (view!= null) {
                view.setOnItemClickListener(new OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        devices_list_listview(((Device) parent.getAdapter().getItem(position)));
                    }

                }
                );
            }
        }
        {
            AdapterView<?> view = ((AdapterView<?> ) findViewById(com.pandaos.smartconfig.R.id.devices_recent_listview));
            if (view!= null) {
                view.setOnItemClickListener(new OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        devices_recent_listview(((Device) parent.getAdapter().getItem(position)));
                    }

                }
                );
            }
        }
        ((RecentDeviceListAdapter_) recentDeviceListAdapter).afterSetContentView_();
        ((DeviceListAdapter_) deviceListAdapter).afterSetContentView_();
        afterViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.tab_devices_view, container, false);
        }
        return contentView_;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        afterSetContentView_();
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    public static DevicesFragment_.FragmentBuilder_ builder() {
        return new DevicesFragment_.FragmentBuilder_();
    }

    @Override
    public void showRefreshProgress() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    DevicesFragment_.super.showRefreshProgress();
                } catch (RuntimeException e) {
                    Log.e("DevicesFragment_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void hideRefreshProgress() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    DevicesFragment_.super.hideRefreshProgress();
                } catch (RuntimeException e) {
                    Log.e("DevicesFragment_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void updateRecentDeviceList() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    DevicesFragment_.super.updateRecentDeviceList();
                } catch (RuntimeException e) {
                    Log.e("DevicesFragment_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void updateDeviceList() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    DevicesFragment_.super.updateDeviceList();
                } catch (RuntimeException e) {
                    Log.e("DevicesFragment_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public DevicesFragment build() {
            DevicesFragment_ fragment_ = new DevicesFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}