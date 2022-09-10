package tw.org.anikaba.soulofdream;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author anikaba
 */
public class Main extends JavaPlugin {

    private Logger logger = getLogger();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TestEvent(logger), this);
        // init();
        logger.info("測試開始");
        test();
    }

    @Override
    public void onDisable() {
    }

    private void test() {
        int version = Bukkit.getUnsafe().getDataVersion();

    }

    private void init() {
        File itemFile = new File("./plugins/Metronome/Metronome.yml");
        if (!itemFile.exists()) {
            saveResource("Metronome.yml", false);
        }
        FileConfiguration metronome = YamlConfiguration.loadConfiguration(itemFile);
        //data = new MetData(metronome, this);
    }
}