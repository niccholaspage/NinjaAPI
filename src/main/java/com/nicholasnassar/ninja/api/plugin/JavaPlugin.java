package com.nicholasnassar.ninja.api.plugin;

public class JavaPlugin implements Plugin {
    private final PluginDescriptionInfo description;

    public JavaPlugin(PluginDescriptionInfo description) {
        this.description = description;
    }

    public void onEnable() {
        //TODO: Implement this
    }

    public void onDisable() {

    }

    public PluginDescriptionInfo getDescription() {
        return description;
    }
}
