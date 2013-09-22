package com.MonK.GW2craft;
import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

import com.MonK.GW2craft.blocks.Blocks;
import com.MonK.GW2craft.items.Items;
import com.MonK.GW2craft.lib.GW2craftTab;
import com.MonK.GW2craft.lib.Recipes;
import com.MonK.GW2craft.lib.Reference;
import com.MonK.GW2craft.lib.WorldGen;
import com.MonK.GW2craft.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

    @Mod( modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
    @NetworkMod( channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = true )


public class GW2craft {
    
    @SidedProxy( clientSide = Reference.PROXY_LOCATION + ".ClientProxy", serverSide = Reference.PROXY_LOCATION + ".CommonProxy")
    public static CommonProxy proxy;
    //public static EnumToolMaterial refinedcopper = EnumHelper.addToolMaterial("RefinedCopper", 1, 150, 3.0F, 1.0F, 2);
    //public static EnumToolMaterial refinediron = EnumHelper.addToolMaterial("RefinedIron", 2, 200, 4.0F, 1.0F, 5);

    public static CreativeTabs gw2craft = new GW2craftTab(CreativeTabs.getNextID(), Reference.NAME);
    
    @EventHandler
    public static void load ( FMLPreInitializationEvent event ) {
    com.MonK.GW2craft.lib.ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.ID + File.separator + Reference.ID + ".cfg"));
        proxy.initRenderers();
        proxy.initSounds();
        Items.init();
        Blocks.init();

        WorldGen worldgen = new WorldGen();
        GameRegistry.registerWorldGenerator(worldgen);
        
}
    
    @EventHandler
    public static void load ( FMLInitializationEvent event ) {
        

        MinecraftForge.setBlockHarvestLevel(Blocks.oreCopper, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(Blocks.oreIron, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(Blocks.oreSilver, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(Blocks.oreGold, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(Blocks.oreMithril, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(Blocks.orePlatinum, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(Blocks.oreOrichalcum, "pickaxe", 3);


        MinecraftForge.setToolClass(Items.toolCopperPickaxeItem, "pickaxe", 1);
        MinecraftForge.setToolClass(Items.toolIronPickaxeItem, "pickaxe", 1);
        MinecraftForge.setToolClass(Items.toolSilverPickaxeItem, "pickaxe", 2);
        MinecraftForge.setToolClass(Items.toolGoldPickaxeItem, "pickaxe", 2);
        MinecraftForge.setToolClass(Items.toolMithrilPickaxeItem, "pickaxe", 3);
        MinecraftForge.setToolClass(Items.toolPlatinumPickaxeItem, "pickaxe", 3);
        MinecraftForge.setToolClass(Items.toolOrichalcumPickaxeItem, "pickaxe", 3);

        Items.addNames();
        Blocks.addNames();
        Recipes.init();
        LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.NAME, "en_US", Reference.NAME);        

}
    
    @EventHandler
    public static void load ( FMLPostInitializationEvent event ) {
        
    }
    
}
