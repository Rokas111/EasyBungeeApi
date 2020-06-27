package main.cmds;

import api.spigot.player.SpigotPlayer;
import main.lib.cmd.Command;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Kill extends Command {
    public Kill() {
        super("EasyBungee.Kill", "Kill", Arrays.asList("<Player>"), false, "getexp");
    }
    public void runConsole(String enteredCmd, String[] args) {
    }

    @Override
    public void run(Player p, String enteredCmd, String[] args) {
        SpigotPlayer sp = new SpigotPlayer(p.getName());
        sp.kill().send();
    }
}
