package com.jsako.mobilesafe.receiver;

import com.jsako.mobilesafe.service.UpdateWidgetService;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;


public class MyWidget extends AppWidgetProvider {
	@Override
	public void onReceive(Context context, Intent intent) {
		super.onReceive(context, intent);
		System.out.println("onreceive");
		Intent i=new Intent(context,UpdateWidgetService.class);
		context.startService(intent);
	}
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}
	
	@Override
	public void onEnabled(Context context) {
		super.onEnabled(context);
		Intent intent=new Intent(context,UpdateWidgetService.class);
		context.startService(intent);
	}
	
	@Override
	public void onDisabled(Context context) {
		super.onDisabled(context);
		Intent intent=new Intent(context,UpdateWidgetService.class);
		context.stopService(intent);
	}
}
