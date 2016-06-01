package com.nicholasnassar.ninja.api.plugin;

public interface Plugin {
    void onEnable();

    void onDisable();

    PluginDescriptionInfo getDescription();
}
