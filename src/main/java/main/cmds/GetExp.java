package main.cmds;

import api.spigot.SpigotSound;
import api.spigot.player.SpigotPlayer;
import api.spigot.world.SpigotLocation;
import api.spigot.world.SpigotWorld;
import api.spigot.world.item.SpigotItem;
import api.spigot.world.lists.SpigotInventory;
import com.google.common.collect.ImmutableMap;
import main.lib.cmd.Command;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GetExp extends Command {

    public GetExp() {
        super("EasyBungee.GetExp", "Gets Exp", Arrays.asList(""), false, "getexp");
    }
    public void runConsole(String enteredCmd, String[] args) {
    }

    @Override
    public void run(Player p, String enteredCmd, String[] args) {
        SpigotPlayer sp = new SpigotPlayer(p.getName());
        sp.getExp().send(value -> p.sendMessage(ChatColor.GREEN + String.valueOf(value)));
    }
}
