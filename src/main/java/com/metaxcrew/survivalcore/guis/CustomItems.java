package com.metaxcrew.survivalcore.guis;

import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CustomItems implements CommandExecutor, Listener {

    // Open Gui Command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("acti.gmgui")){


                Inventory CategorysGUI = Bukkit.createInventory(null, 54, ChatColor.of("#D54A4A") + "Categories");

                // SetItems
                ItemStack null1 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
                ItemStack null2 = new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE, 1);
                ItemStack ToolsC = new ItemStack(Material.IRON_PICKAXE, 1);
                ItemStack WeaponsC = new ItemStack(Material.IRON_SWORD, 1);
                ItemStack DecorationC = new ItemStack(Material.LODESTONE, 1);
                ItemStack FurnitureC = new ItemStack(Material.BEEHIVE, 1);
                ItemStack ArmorC = new ItemStack(Material.IRON_CHESTPLATE, 1);
                ItemStack FoodC = new ItemStack(Material.COOKED_BEEF, 1);
                ItemStack Close = new ItemStack(Material.BARRIER, 1);


                ItemMeta ToolsC_meta = ToolsC.getItemMeta();
                ToolsC_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Tools");
                ArrayList<String> ToolsC_lore = new ArrayList<>();
                ToolsC_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                ToolsC_meta.setLore(ToolsC_lore);
                ToolsC.setItemMeta(ToolsC_meta);

                ItemMeta WeaponsC_meta = WeaponsC.getItemMeta();
                WeaponsC_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Weapons");
                ArrayList<String> WeaponsC_lore = new ArrayList<>();
                WeaponsC_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                WeaponsC_meta.setLore(WeaponsC_lore);
                WeaponsC.setItemMeta(WeaponsC_meta);

                ItemMeta Decoration_meta = DecorationC.getItemMeta();
                Decoration_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Decoration");
                ArrayList<String> Decoration_lore = new ArrayList<>();
                Decoration_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                Decoration_meta.setLore(Decoration_lore);
                DecorationC.setItemMeta(Decoration_meta);

                ItemMeta FurnitureC_meta = FurnitureC.getItemMeta();
                FurnitureC_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Armor");
                ArrayList<String> FurnitureC_lore = new ArrayList<>();
                FurnitureC_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                FurnitureC_meta.setLore(FurnitureC_lore);
                FurnitureC.setItemMeta(FurnitureC_meta);

                ItemMeta FoodC_meta = FoodC.getItemMeta();
                FoodC_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Food");
                ArrayList<String> FoodC_lore = new ArrayList<>();
                FoodC_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                FoodC_meta.setLore(FoodC_lore);
                FoodC.setItemMeta(FoodC_meta);

                ItemMeta ArmorC_meta = ArmorC.getItemMeta();
                ArmorC_meta.setDisplayName(ChatColor.of("#D54A4A") + "Custom Armor");
                ArrayList<String> ArmorC_lore = new ArrayList<>();
                ArmorC_lore.add(ChatColor.of("#D54A4A") + "Click to open");
                ArmorC_meta.setLore(ArmorC_lore);
                ArmorC.setItemMeta(ArmorC_meta);

                ItemMeta Close_meta = Close.getItemMeta();
                Close_meta.setDisplayName(ChatColor.of("#D54A4A") + "Close");
                ArrayList<String> Close_lore = new ArrayList<>();
                Close_lore.add(ChatColor.of("#D54A4A") + "Click to close");
                Close_meta.setLore(Close_lore);
                Close.setItemMeta(Close_meta);



                String money = "%vault_eco_balance_fixed%";
                String playername = "%player_displayname%";


                money = PlaceholderAPI.setPlaceholders(player, money);
                playername = PlaceholderAPI.setPlaceholders(player, playername);

            /*ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta headmeta = (SkullMeta) head.getItemMeta();
            headmeta.setOwningPlayer(player);
            headmeta.setDisplayName(ChatColor.of(new Color(61, 145, 255))+""+ChatColor.BOLD+"PROFILE");
            ArrayList<String> profile_lore = new ArrayList<>();
            profile_lore.add(ChatColor.of(new Color(130, 139, 147))+"Name: "+ ChatColor.of(new Color(0, 141, 183))+sender.getName());
            profile_lore.add(ChatColor.of(new Color(130, 139, 147))+"Money: "+ ChatColor.of(new Color(224, 134, 0))+money+"$");
            headmeta.setLore(profile_lore);
            head.setItemMeta(headmeta);
            //Translate Head
*/

           /*ItemStack language = getSkull("https://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta langhead = (SkullMeta) language.getItemMeta();
            langhead.setDisplayName(ChatColor.of(new Color(130, 139, 147))+"Name: "+ ChatColor.of(new Color(0, 141, 183))+"LANGUAGE");
            language.setItemMeta(langhead);*/

                //Design Left
                CategorysGUI.setItem(0, null1);
                CategorysGUI.setItem(9, null2);
                CategorysGUI.setItem(18, null1);
                CategorysGUI.setItem(27, null2);
                CategorysGUI.setItem(36, null1);
                CategorysGUI.setItem(45, null2);
                //Design Right
                CategorysGUI.setItem(8, null1);
                CategorysGUI.setItem(17, null2);
                CategorysGUI.setItem(26, null1);
                CategorysGUI.setItem(35, null2);
                CategorysGUI.setItem(44, null1);
                CategorysGUI.setItem(53, null2);
                //Categorys
                CategorysGUI.setItem(11, WeaponsC);
                CategorysGUI.setItem(13, ToolsC);
                CategorysGUI.setItem(15, ArmorC);
                CategorysGUI.setItem(29, FurnitureC);
                CategorysGUI.setItem(31, FoodC);
                CategorysGUI.setItem(33, DecorationC);

                //Close
                CategorysGUI.setItem(49, Close);


                player.openInventory(CategorysGUI);


            }else{
                player.sendMessage(ChatColor.of("#D54A4A") + "You do not have required permissions to use this command!");
            }}
        return false;}




    @EventHandler
    public void GamemodeSelector(InventoryClickEvent event) {
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#D54A4A") + "Categories") && event.getCurrentItem() != null) {


            //ToolsGUI
            if (event.getCurrentItem().getType() == Material.IRON_SWORD) {
                if (event.getClick().equals(ClickType.RIGHT)||event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                    Inventory ToolsGUI = Bukkit.createInventory(null, 54, ChatColor.of("#D54A4A") + "Category-Tools");
                    event.getWhoClicked().openInventory(ToolsGUI);

                    //Items
                    ItemStack null1 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
                    ItemStack null2 = new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE, 1);
                    ItemStack Close = new ItemStack(Material.BARRIER, 1);

                    //Lore/Meta Design

                    ItemMeta Close_meta = Close.getItemMeta();
                    Close_meta.setDisplayName(ChatColor.of("#D54A4A") + "Close");
                    ArrayList<String> Close_lore = new ArrayList<>();
                    Close_lore.add(ChatColor.of("#D54A4A") + "Click to close");
                    Close_meta.setLore(Close_lore);
                    Close.setItemMeta(Close_meta);

                    //Design Left
                    ToolsGUI.setItem(0, null1);
                    ToolsGUI.setItem(9, null2);
                    ToolsGUI.setItem(18, null1);
                    ToolsGUI.setItem(27, null2);
                    ToolsGUI.setItem(36, null1);
                    ToolsGUI.setItem(45, null2);
                    //Design Right
                    ToolsGUI.setItem(8, null1);
                    ToolsGUI.setItem(17, null2);
                    ToolsGUI.setItem(26, null1);
                    ToolsGUI.setItem(35, null2);
                    ToolsGUI.setItem(44, null1);
                    ToolsGUI.setItem(53, null2);
                    ToolsGUI.setItem(49, Close);

                    if (event.getCurrentItem().getType() == Material.BARRIER) {
                        event.getWhoClicked().closeInventory();
                    }
                }
                else{
                    event.setCancelled(true);}}

            if (event.getCurrentItem().getType() == Material.ORANGE_STAINED_GLASS) {
                if (event.getClick().equals(ClickType.RIGHT)||event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().sendMessage(ChatColor.of("#D54A4A") + "You changed your gamemode to: " + ChatColor.of("#D54A4A") + "CREATIVE");
                    event.getWhoClicked().closeInventory();
                }
                else{
                    event.setCancelled(true);}}


            if (event.getCurrentItem().getType() == Material.LIME_STAINED_GLASS) {
                if (event.getClick().equals(ClickType.RIGHT)||event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().sendMessage(ChatColor.of("#D54A4A") + "You changed your gamemode to: " + ChatColor.of("#D54A4A") + "SURVIVAL");
                    event.getWhoClicked().closeInventory();
                }else{
                    event.setCancelled(true);}}


            if (event.getCurrentItem().getType() == Material.LIGHT_GRAY_STAINED_GLASS) {
                if (event.getClick().equals(ClickType.RIGHT )||event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().sendMessage(ChatColor.of("#D54A4A") + "You changed your gamemode to: " + ChatColor.of("#D54A4A") + "SPECTATOR");
                    event.getWhoClicked().closeInventory();
                }
            }

            else {

            }
            event.setCancelled(true);}}

}