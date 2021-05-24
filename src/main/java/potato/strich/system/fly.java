package potato.strich.system;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly {

    public static class CommandFly implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

            if (!(sender instanceof Player)) {

                return true;

            }

            Player player = ((Player) sender).getPlayer();

            if (!(player.hasPermission("system.fly"))) {

                player.sendMessage(ChatColor.GOLD + "System " + ChatColor.DARK_GRAY + "| " +  ChatColor.RED + "Keine Rechte");

                    return true;

            }

            if (args.length == 0) {

                if (!(player.getAllowFlight())) {


                    player.setAllowFlight(true);
                    player.setFlying(true);

                    player.sendMessage(ChatColor.GOLD + "System " + ChatColor.DARK_GRAY + "| " + ChatColor.GREEN + "Du kannst nun Fliegen!");


                } else {

                    player.setAllowFlight(false);
                    player.setFlying(false);

                    player.sendMessage(ChatColor.GOLD + "System " + ChatColor.DARK_GRAY + "| " + ChatColor.RED + "Du kannst nun nicht Fliegen!");

                }

            } else if (args.length == 1) {

                Player target = Bukkit.getPlayer(args[0]);

            } else {

                player.sendMessage(ChatColor.GOLD + "System " + ChatColor.DARK_GRAY + "| " + ChatColor.RED + "Lerne den command");

            }

            return false;
        }
    }
}
