package net.coreprotect.services;

import net.coreprotect.CoreProtect;

public class PluginInitializationService {
    public static boolean initializePlugin(CoreProtect plugin) {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }
        return true;
    }
}
