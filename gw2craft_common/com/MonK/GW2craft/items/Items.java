package com.MonK.GW2craft.items;

import com.MonK.GW2craft.items.tools.toolCopperPickaxeItem;
import com.MonK.GW2craft.items.tools.toolGoldPickaxeItem;
import com.MonK.GW2craft.items.tools.toolIronPickaxeItem;
import com.MonK.GW2craft.items.tools.toolMithrilPickaxeItem;
import com.MonK.GW2craft.items.tools.toolOrichalcumPickaxeItem;
import com.MonK.GW2craft.items.tools.toolPlatinumPickaxeItem;
import com.MonK.GW2craft.items.tools.toolSilverPickaxeItem;
import com.MonK.GW2craft.lib.IDs;
import com.MonK.GW2craft.lib.Names;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Items {
    public static Item oreCopperItem;
    public static Item oreIronItem;
    public static Item oreSilverItem;
    public static Item oreGoldItem;
    public static Item orePlatinumItem;
    public static Item oreMithrilItem;
    public static Item oreOrichalcumItem;
    public static Item logGreenWoodItem;
    public static Item ingotCopperItem;
    public static Item ingotIronItem;
    public static Item ingotSilverItem;
    public static Item ingotGoldItem;
    public static Item ingotPlatinumItem;
    public static Item ingotMithrilItem;
    public static Item ingotOrichalcumItem;
    
    /** TOOLS **/
    
    public static Item toolCopperPickaxeItem;
    public static Item toolIronPickaxeItem;
    public static Item toolSilverPickaxeItem;
    public static Item toolGoldPickaxeItem;
    public static Item toolMithrilPickaxeItem;
    public static Item toolPlatinumPickaxeItem;
    public static Item toolOrichalcumPickaxeItem;
    
    public static void init(){
        oreCopperItem = new oreCopperItem(IDs.oreCopperItem_ID);
        oreIronItem = new oreIronItem(IDs.oreIronItem_ID);
        oreSilverItem = new oreSilverItem(IDs.oreSilverItem_ID);
        oreGoldItem = new oreGoldItem(IDs.oreGoldItem_ID);
        orePlatinumItem = new orePlatinumItem(IDs.orePlatinumItem_ID);
        oreMithrilItem = new oreMithrilItem(IDs.oreMithrilItem_ID);
        oreOrichalcumItem = new oreOrichalcumItem(IDs.oreOrichalcumItem_ID);
        logGreenWoodItem = new logGreenWoodItem(IDs.logGreenWoodItem_ID);
        ingotCopperItem = new ingotCopperItem(IDs.ingotCopperItem_ID);
        ingotIronItem = new ingotIronItem(IDs.ingotIronItem_ID);
        ingotSilverItem = new ingotSilverItem(IDs.ingotSilverItem_ID);
        ingotGoldItem = new ingotGoldItem(IDs.ingotGoldItem_ID);
        ingotPlatinumItem = new ingotPlatinumItem(IDs.ingotPlatinumItem_ID);
        ingotMithrilItem = new ingotMithrilItem(IDs.ingotMithrilItem_ID);
        ingotOrichalcumItem = new ingotOrichalcumItem(IDs.ingotOrichalcumItem_ID);

        /** TOOLS **/
        
        toolCopperPickaxeItem = new toolCopperPickaxeItem(IDs.toolCopperPickaxeItem_ID, EnumToolMaterial.WOOD);
        toolIronPickaxeItem = new toolIronPickaxeItem(IDs.toolIronPickaxeItem_ID, EnumToolMaterial.STONE);
        toolSilverPickaxeItem = new toolSilverPickaxeItem(IDs.toolSilverPickaxeItem_ID, EnumToolMaterial.STONE);
        toolGoldPickaxeItem = new toolGoldPickaxeItem(IDs.toolGoldPickaxeItem_ID, EnumToolMaterial.IRON);
        toolMithrilPickaxeItem = new toolMithrilPickaxeItem(IDs.toolMithrilPickaxeItem_ID, EnumToolMaterial.IRON);
        toolPlatinumPickaxeItem = new toolPlatinumPickaxeItem(IDs.toolPlatinumPickaxeItem_ID, EnumToolMaterial.EMERALD);
        toolOrichalcumPickaxeItem = new toolOrichalcumPickaxeItem(IDs.toolOrichalcumPickaxeItem_ID, EnumToolMaterial.EMERALD);

        
    }
    
    public static void addNames(){
        LanguageRegistry.addName(oreCopperItem,  Names.oreCopperItem_name);
        LanguageRegistry.addName(oreIronItem, Names.oreIronItem_name);
        LanguageRegistry.addName(oreSilverItem, Names.oreSilverItem_name);
        LanguageRegistry.addName(oreGoldItem, Names.oreGoldItem_name);
        LanguageRegistry.addName(orePlatinumItem, Names.orePlatinumItem_name);
        LanguageRegistry.addName(oreMithrilItem, Names.oreMithrilItem_name);
        LanguageRegistry.addName(oreOrichalcumItem, Names.oreOrichalcumItem_name);
        LanguageRegistry.addName(logGreenWoodItem, Names.logGreenWoodItem_name);
        LanguageRegistry.addName(ingotCopperItem, Names.ingotCopperItem_name);
        LanguageRegistry.addName(ingotIronItem, Names.ingotIronItem_name);
        LanguageRegistry.addName(ingotSilverItem, Names.ingotSilverItem_name);
        LanguageRegistry.addName(ingotGoldItem, Names.ingotGoldItem_name);
        LanguageRegistry.addName(ingotPlatinumItem, Names.ingotPlatinumItem_name);
        LanguageRegistry.addName(ingotMithrilItem, Names.ingotMithrilItem_name);
        LanguageRegistry.addName(ingotOrichalcumItem, Names.ingotOrichalcumItem_name);
        
        /** TOOLS **/
        
        LanguageRegistry.addName(toolCopperPickaxeItem, Names.toolCopperPickaxeItem_name);
        LanguageRegistry.addName(toolIronPickaxeItem, Names.toolIronPickaxeItem_name);
        LanguageRegistry.addName(toolSilverPickaxeItem, Names.toolSilverPickaxeItem_name);
        LanguageRegistry.addName(toolGoldPickaxeItem, Names.toolGoldPickaxeItem_name);
        LanguageRegistry.addName(toolMithrilPickaxeItem, Names.toolMithrilPickaxeItem_name);
        LanguageRegistry.addName(toolPlatinumPickaxeItem, Names.toolPlatinumPickaxeItem_name);
        LanguageRegistry.addName(toolOrichalcumPickaxeItem, Names.toolOrichalcumPickaxeItem_name);
        
        
        
    }

}
