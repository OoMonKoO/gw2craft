package com.MonK.GW2craft.lib;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.MonK.GW2craft.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
    
    public static void init() {
        
        FurnaceRecipes.smelting().addSmelting(Items.oreCopperItem.itemID , new ItemStack(Items.ingotCopperItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Items.oreIronItem.itemID, new ItemStack(Items.ingotIronItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.oreSilverItem.itemID, new ItemStack(Items.ingotSilverItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.oreGoldItem.itemID, new ItemStack(Items.ingotGoldItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.orePlatinumItem.itemID, new ItemStack(Items.ingotPlatinumItem), 0.3F);
        FurnaceRecipes.smelting().addSmelting(Items.oreMithrilItem.itemID, new ItemStack(Items.ingotMithrilItem), 0.3F);
        FurnaceRecipes.smelting().addSmelting(Items.oreOrichalcumItem.itemID, new ItemStack(Items.ingotOrichalcumItem), 0.8F);
        
        ItemStack enchanted = new ItemStack(Items.toolIronPickaxeItem);
        enchanted.addEnchantment(Enchantment.aquaAffinity, 1);
        
        GameRegistry.addShapelessRecipe(enchanted, new Object[] {
                new ItemStack(Items.toolIronPickaxeItem), new ItemStack(Item.bucketWater)}); 
        
        ItemStack enchanted1 = new ItemStack(Items.toolIronPickaxeItem);
        enchanted1.addEnchantment(Enchantment.efficiency, 1);
        
        GameRegistry.addShapelessRecipe(enchanted1, new Object[] {
                new ItemStack(Items.toolIronPickaxeItem), new ItemStack(Item.appleRed)}); 
            
       
    }
    
    
}
