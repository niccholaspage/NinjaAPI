package com.nicholasnassar.ninja.api.plugin;

public class PluginDescriptionInfo {
    private final String name;

    private final String version;

    public PluginDescriptionInfo(String name, String version) {
        this.name = name;

        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}
