package main;

import lombok.Getter;
import main.cmd.CommandManager;
import main.cmds.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class EBApi extends JavaPlugin implements Listener {
    public static EBApi pl;
    @Getter private CommandManager commandManager;
    public void onEnable() {
        pl = this;
        commandManager = new CommandManager();
        registerCommands();
    }
    public void onDisable() {
        pl = null;
    }
    private void registerCommands() {
        commandManager.registerCommand(new BroadCastAll());
        commandManager.registerCommand(new BTeleport());
        commandManager.registerCommand(new GetExp());
        commandManager.registerCommand(new Kick());
        commandManager.registerCommand(new Kill());
    }
}
