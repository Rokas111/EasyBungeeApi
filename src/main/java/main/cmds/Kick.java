package main.cmds;

import api.spigot.player.SpigotPlayer;
import main.lib.cmd.Command;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Kick extends Command {
    public Kick() {
        super("EasyBungee.Kill", "Kill", Arrays.asList("<Player>"), false, "getexp");
    }
    public void runConsole(String enteredCmd, String[] args) {
        SpigotPlayer sp = new SpigotPlayer(args[0]);
        if (args.length == 1) sp.kick().send(); else sp.kick(String.join(" ",args)).send();
    }

    @Override
    public void run(Player p, String enteredCmd, String[] args) {
        SpigotPlayer sp = new SpigotPlayer(args[0]);
        if (args.length == 1) sp.kick().send(); else sp.kick(String.join(" ",args)).send();
    }
}
