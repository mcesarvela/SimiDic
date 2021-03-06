package com.ketanolab.simidic.anim;

import com.ketanolab.simidic.R;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class PrincipalText implements ViewFactory {

	private Context context;

	public PrincipalText(Context context) {
		this.context = context;
	}

	public View makeView() {
		TextView t = new TextView(context);
		t.setGravity(Gravity.CENTER);
		t.setTextSize(20);
		t.setTextColor(context.getResources().getColor(R.color.black1));
		return t;
	}

}
