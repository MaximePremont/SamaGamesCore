package net.samagames.core.api.settings;

import net.samagames.api.settings.ISettingsManager;
import net.samagames.core.ApiImplementation;

import java.util.Map;
import java.util.UUID;

public class SettingsManager implements ISettingsManager
{
    private ApiImplementation api;

    public SettingsManager(ApiImplementation api)
    {
        this.api = api;
    }

    public Map<String, String> getSettings(UUID player)
    {
        // TODO: PlayerData playerData = (PlayerData) api.getPlayerManager().getPlayerData(player);
        // TODO: playerData.getPlayerBean().
        /*Map<String, String> data = SamaGamesAPI.get().getPlayerManager().getPlayerData(player).getValues();
        HashMap<String, String> settings = new HashMap<>();
        data.entrySet().stream().filter(line -> line.getKey().startsWith("settings.")).forEach(line -> {
            String setting = line.getKey().split(".")[0];
            settings.put(setting, line.getValue());
        });/*/

        return null;
    }

    public String getSetting(UUID player, String setting)
    {
        return null;//SamaGamesAPI.get().getPlayerManager().getPlayerData(player).get("settings." + setting);
    }

    public void setSetting(UUID player, String setting, String value)
    {
        //SamaGamesAPI.get().getPlayerManager().getPlayerData(player).set("settings." + setting, value);
    }

    public void setSetting(UUID player, String setting, String value, Runnable callback)
    {
        /*Bukkit.getServer().getScheduler().runTaskAsynchronously(SamaGamesAPI.get().getPlugin(), () -> {
            SamaGamesAPI.get().getPlayerManager().getPlayerData(player).set("settings." + setting, value);
            callback.run();
        });*/
    }
}
