package tw.org.anikaba.soulofdream;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

public class TestEvent implements Listener {

    Logger logger;
    public TestEvent(Logger logger) {
        this.logger = logger;
    }

    @EventHandler
    public void onCraftItem(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            Arrays.stream(Material.values()).toList().forEach(material -> {
                ItemStack stack = new ItemStack(material);
                event.getPlayer().getInventory().setItemInMainHand(stack);
                ItemStack itemStack = event.getPlayer().getInventory().getItemInMainHand();
                if (itemStack != null) {
                    Map<String, Object> map = itemStack.serialize();
                    logger.info("==========================================");
                    logger.info(map.toString());
                }
            });
        }
    }
}