package de.maxhenkel.voicechat;

import net.minecraft.server.level.ServerPlayer;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

//ss

public class BukkitUtils {

    public static ServerPlayer getPlayer(Player player) {
        return ((CraftPlayer) player).getHandle();
    }

}
