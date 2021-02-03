package tk.BlueCmdr.QuickCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickCraft extends JavaPlugin implements CommandExecutor {
    Map<String, List> map = new HashMap<>();

    public void onEnable() {
        for (String s : getConfig().getStringList("recipe_list")) {
            List<ItemStack> items;

            items.add(getConfig().getString(""))

            map.put(s, new ArrayList());
        }
    }

    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("addrecipe")) {
            if (sender.hasPermission("quickcraft.addrecipe")) {

            }
        }
        return true;
    }
}
