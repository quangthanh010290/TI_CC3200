//
//  Copyright (c) 2014 Texas Instruments. All rights reserved.
//

package com.pandaos.smartconfig;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.ViewById;

@EFragment(R.layout.ap_mode_page3)
public class APModePage3 extends Fragment {

	@ViewById
	TextView ap_mode_page3_next;
	
	@Click
	void ap_mode_page3_next() {
		ViewPager pager = (ViewPager) getActivity().findViewById(R.id.pager);
		pager.setCurrentItem(3, true);
	}
	
}