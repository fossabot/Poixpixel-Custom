package com.poixpixelcustom.Commands

import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class EnrichCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, s: String, strings: Array<String>): Boolean {
        if (sender is Player) {
            val player = sender
            val inventory = player.inventory
            val itemstack = ItemStack(Material.DIAMOND, 64)
            inventory.addItem(itemstack)
            player.sendMessage("You got 64 diamonds!!")
        } else {
            sender.sendMessage("You must be a player!")
            return false
        }
        return false
    }
}