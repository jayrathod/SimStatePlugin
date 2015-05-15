var simstateplugin = function () {};

simstateplugin.prototype.get = function(success,fail) {
	 return cordova.exec(success,fail,"SimStatePlugin",
        "get",[]);
}

// Plug into Cordova
cordova.addConstructor(function() {

    if (!window.Cordova) {
        window.Cordova = cordova;
    };

    if(!window.plugins) window.plugins = {};
    window.plugins.SimStatePlugin = new SimStatePlugin();
});
