# SimStatePlugin
Cordova Sim State Plugin for android

As we all know that every device incorporates a sim card. Andorid library provides handful of API's which helps to determine the current sim state that may be any one of the following :<br/>
<br/>
SIM_STATE_UNKNOWN=0<br/>
SIM_STATE_ABSENT=1<br/>
SIM_STATE_PIN_REQUIRED=2<br/>
SIM_STATE_PUK_REQUIRED=3<br/>
SIM_STATE_NETWORK_LOCKED=4<br/>
SIM_STATE_READY=5<br/>
<br/>
This plugin provides interface to retrive the current sim state which may be any one of the above mentioned state. This plugin may be very handful in following scenarios: Consider we need to register user through sms to any enterprise server then for validation this plugin can be used. Another scenario include a security domain app which requires sim card to be always unlocked as and when if cellphone is stolen and sim is blocked by network operator if would be impossible to open app as sim will not be in ready state it would preferably in pin_required / puk_required state, etc.<br/>
<br/>
<h3>Installing the plugin</h3><br/>

1.Download the repo using GIT or just a ZIP from Github.<br/>
2.Add the plugin to your project (from the root of your project):<br/>
cordova plugin add https://github.com/jayrathod/SimStatePlugin.git<br/>
<br/>
<h3>Using the plugin</h3>

Plugin allows usage of following method viz.<br/>
<br/>
1.get(successCallback,failureCallback)<br/>

The above method returns any one of the integer value depending on the current sim state.
