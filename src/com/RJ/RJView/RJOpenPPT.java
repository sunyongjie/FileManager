package com.RJ.RJView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class RJOpenPPT extends RJOpenAction {
	
	public RJOpenPPT(Context context, String path) {
		super(context, path);
	}
	@Override
	public void open() {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.parse(url), "application/vnd.ms-powerpoint");
		//intent.setComponent(component)
		context.startActivity(intent);
	}

}