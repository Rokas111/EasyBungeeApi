package main.cmd;

import main.EBApi;
import main.lib.cmd.Command;
import main.lib.cmd.ICommand;
import org.bukkit.command.CommandMap;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandManager {
    private final List<Command> commands = new ArrayList<>();
    public void runCommand(Player p, ICommand cmd, String enteredCmd, String[] args) {
        if (!p.getPlayer().hasPermission(cmd.getPermission())) {
            p.sendMessage("");
            return;
        }
        cmd.run(p,enteredCmd, args);
    }
    public void runCommand(ICommand cmd, String enteredCmd, String[] args) {
        cmd.runConsole(enteredCmd, args);
    }
    public void registerCommand(Command cmd) {
        commands.add(cmd);
        try {
            final Field f = EBApi.pl.getServer().getClass().getDeclaredField("commandMap");
            f.setAccessible(true);
            ((CommandMap) f.get(EBApi.pl.getServer())).register(cmd.getCmdAliases().get(0),cmd);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public List<Command> getCommands() {
        return Collections.unmodifiableList(this.commands);
    }
}
