package com.example.simstateplugin;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import android.content.Context;
import android.telephony.TelephonyManager;

//This plugin returns the integer value for the following sim states
/*
 *     SIM_STATE_UNKNOWN=0
 *     SIM_STATE_ABSENT=1
 *     SIM_STATE_PIN_REQUIRED=2
 *     SIM_STATE_PUK_REQUIRED=3
 *     SIM_STATE_NETWORK_LOCKED=4
 *     SIM_STATE_READY=5
 */
public class SimStatePlugin extends CordovaPlugin {

	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) {
		if (action.equals("get")) {
			TelephonyManager telephonyManager = (TelephonyManager) this.cordova
					.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
			int simState = telephonyManager.getSimState();
			callbackContext.sendPluginResult(new PluginResult(
					PluginResult.Status.OK, simState));
			return true;
		}
		callbackContext.sendPluginResult(new PluginResult(
				PluginResult.Status.ERROR));
		return false;
	}
}
