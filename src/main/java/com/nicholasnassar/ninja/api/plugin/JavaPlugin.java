package com.nicholasnassar.ninja.api.plugin;

public class JavaPlugin implements Plugin {
    private PluginDescriptionInfo description;

    public void init(PluginDescriptionInfo description) {
        this.description = description;
    }

    public void onEnable() {

    }

    public void onDisable() {

    }

    public PluginDescriptionInfo getDescription() {
        return description;
    }
}
