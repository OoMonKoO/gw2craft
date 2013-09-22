package com.MonK.GW2craft.lib;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.MonK.GW2craft.blocks.Blocks;
import com.MonK.GW2craft.items.Items;

public class Recipes {
    
    public static void init() {
        
        FurnaceRecipes.smelting().addSmelting(Blocks.oreCopper.blockID, new ItemStack(Items.oreCopperItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.oreIron.blockID, new ItemStack(Items.oreIronItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.oreSilver.blockID, new ItemStack(Items.oreSilverItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.oreGold.blockID, new ItemStack(Items.oreGoldItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.orePlatinum.blockID, new ItemStack(Items.orePlatinumItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.oreMithril.blockID, new ItemStack(Items.oreMithrilItem), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Blocks.oreOrichalcum.blockID, new ItemStack(Items.oreOrichalcumItem), 0.1F);
        
        //GameRegistry.addRecipe(new ItemStack(Items.toolCopperPickaxeItem), new Object[] {"", "", ""});
        
    }

}
