package pl.vhcf.me.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import pl.vhcf.me.utils.Messages;

public class CommandHelp implements CommandExecutor{
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("help")) {
        	if(!sender.hasPermission("zhcf.commands.help")){
        		sender.sendMessage(Messages.PREFIX + Messages.NO_PERM);
        		return true;
        	}
        	sender.sendMessage(Messages.LINE1);
        	sender.sendMessage(Messages.LINE2);
        	sender.sendMessage(Messages.LINE3);
        	sender.sendMessage(Messages.LINE4);
        	sender.sendMessage(Messages.LINE5);
        	sender.sendMessage(Messages.LINE6);
        	sender.sendMessage(Messages.LINE7);
        	return true;
        }
		return false;
	}
}
        