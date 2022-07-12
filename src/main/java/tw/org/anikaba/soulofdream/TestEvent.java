package tw.org.anikaba.soulofdream;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class TestEvent implements Listener {

    @EventHandler
    public void onCraftItem(PlayerItemHeldEvent event) {
        ItemStack stack = event.getPlayer().getItemInUse();
        if (stack != null) {
            Map<String, Object> map = stack.serialize();
            System.out.print(map.toString());
        }

    }
}