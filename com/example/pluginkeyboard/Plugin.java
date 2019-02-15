package com.example.pluginkeyboard;
import org.nift4.pluginkeyboard.PluginKeyboardAPI;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Plugin implements PluginKeyboardAPI.Plugin
{
	@Override
	public void onBtnClick(PluginKeyboardAPI.Api api, String name)
	{
		AlertDialog d = new AlertDialog.Builder(api.getCtx())
		.setCancelable(true)
		.setTitle("Plugin Keyboard")
		.setMessage("Example Plugin")
		.setNeutralButton("OK", new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface p1, int p2)
			{
				p1.dismiss();
			}
		})
		.create();
		api.fixDialog(d);
		d.show();
	}
}
