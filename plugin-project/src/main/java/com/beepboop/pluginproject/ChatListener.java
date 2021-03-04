package com.beepboop.pluginproject;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;

public class ChatListener implements Listener {

    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String playerMessage = event.getMessage().toLowerCase();

        if(playerMessage.equals("jun")) {
            Bukkit.broadcastMessage("This bruh");
            System.out.println("This should be executing.");
        }
    }
}
