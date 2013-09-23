package com.MonK.GW2craft.lib;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.MonK.GW2craft.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
    
    public static void init() {
        
/** FURNACE RECIPES **/       
        
        FurnaceRecipes.smelting().addSmelting(Items.oreCopperItem.itemID , new ItemStack(Items.ingotCopperItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Items.oreIronItem.itemID, new ItemStack(Items.ingotIronItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.oreSilverItem.itemID, new ItemStack(Items.ingotSilverItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.oreGoldItem.itemID, new ItemStack(Items.ingotGoldItem), 0.2F);
        FurnaceRecipes.smelting().addSmelting(Items.orePlatinumItem.itemID, new ItemStack(Items.ingotPlatinumItem), 0.3F);
        FurnaceRecipes.smelting().addSmelting(Items.oreMithrilItem.itemID, new ItemStack(Items.ingotMithrilItem), 0.3F);
        FurnaceRecipes.smelting().addSmelting(Items.oreOrichalcumItem.itemID, new ItemStack(Items.ingotOrichalcumItem), 0.8F);
        
/** SHAPED RECIPES **/
        
        GameRegistry.addRecipe(new ItemStack(Items.toolCopperPickaxeItem), new Object[] {
            "ccc"," w "," w ",
            'c', Items.ingotCopperItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolIronPickaxeItem), new Object[] {
            "iii"," w "," w ",
            'i', Items.ingotIronItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolSilverPickaxeItem), new Object[] {
            "sss"," w "," w ",
            's', Items.ingotSilverItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolGoldPickaxeItem), new Object[] {
            "ggg"," w "," w ",
            'g', Items.ingotGoldItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolPlatinumPickaxeItem), new Object[] {
            "ppp"," w "," w ",
            'p', Items.ingotPlatinumItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolMithrilPickaxeItem), new Object[] {
            "mmm"," w "," w ",
            'm', Items.ingotMithrilItem, 'w', Items.logGreenWoodItem });
        
        GameRegistry.addRecipe(new ItemStack(Items.toolOrichalcumPickaxeItem), new Object[] {
            "ooo"," w "," w ",
            'o', Items.ingotOrichalcumItem, 'w', Items.logGreenWoodItem });
        
        
/** ENCHANTS **/ 
        
        ItemStack enchanted = new ItemStack(Items.toolOrichalcumPickaxeItem);
        enchanted.addEnchantment(Enchantment.aquaAffinity, 1);
        
        GameRegistry.addShapelessRecipe(enchanted, new Object[] {
                new ItemStack(Items.toolOrichalcumPickaxeItem), new ItemStack(Item.bucketWater), new ItemStack(Item.diamond), new ItemStack(Items.oreOrichalcumItem)}); 
        
        ItemStack enchanted1 = new ItemStack(Items.toolOrichalcumPickaxeItem);
        enchanted1.addEnchantment(Enchantment.efficiency, 1);
        
        GameRegistry.addShapelessRecipe(enchanted1, new Object[] {
                new ItemStack(Items.toolOrichalcumPickaxeItem), new ItemStack(Items.oreOrichalcumItem), new ItemStack(Item.diamond), new ItemStack(Items.oreOrichalcumItem)}); 
            
       
    }
    
    
}
