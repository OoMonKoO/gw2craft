package com.MonK.GW2craft.lib;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    
    static Configuration config = new Configuration();
    public static void init(File file){
        
        config = new Configuration(file);
        
        try{
            
            config.load();
            
            /** BLOCKS & ORES **/
            
            IDs.oreIronBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreIronBlock_name, IDs.oreIronBlock_ID_DEFAULT).getInt(IDs.oreIronBlock_ID_DEFAULT);
            IDs.oreCopperBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreCopperBlock_name, IDs.oreCopperBlock_ID_DEFAULT).getInt(IDs.oreCopperBlock_ID_DEFAULT);
            IDs.oreSilverBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreSilverBlock_name, IDs.oreSilverBlock_ID_DEFAULT).getInt(IDs.oreSilverBlock_ID_DEFAULT);
            IDs.oreGoldBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreGoldBlock_name, IDs.oreGoldBlock_ID_DEFAULT).getInt(IDs.oreGoldBlock_ID_DEFAULT);
            IDs.orePlatinumBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.orePlatinumBlock_name, IDs.orePlatinumBlock_ID_DEFAULT).getInt(IDs.orePlatinumBlock_ID_DEFAULT);
            IDs.oreMithrilBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreMithrilBlock_name, IDs.oreMithrilBlock_ID_DEFAULT).getInt(IDs.oreMithrilBlock_ID_DEFAULT);
            IDs.oreOrichalcumBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.oreOrichalcumBlock_name, IDs.oreOrichalcumBlock_ID_DEFAULT).getInt(IDs.oreOrichalcumBlock_ID_DEFAULT);
            IDs.logKertchBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.logKertchBlock_name, IDs.logKertchBlock_ID_DEFAULT).getInt(IDs.logKertchBlock_ID_DEFAULT);
            IDs.leafKertchBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.leafKertchBlock_name, IDs.leafKertchBlock_ID_DEFAULT).getInt(IDs.leafKertchBlock_ID_DEFAULT);
            IDs.saplingKertchBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.saplingKertchBlock_name, IDs.saplingKertchBlock_ID_DEFAULT).getInt(IDs.saplingKertchBlock_ID_DEFAULT);
            IDs.logGreenWoodBlock_ID = config.get(Configuration.CATEGORY_BLOCK, Names.logGreenWoodBlock_name, IDs.logGreenWoodBlock_ID_DEFAULT).getInt(IDs.logGreenWoodBlock_ID_DEFAULT);
            
            
            
            // IDs.oreBaseBlock_actual = config.getBlock(Configuration.CATEGORY_BLOCK, Names.oreBaseBlock_name, IDs.oreBaseBlock_default).getInt();
            
            /** ITEMS **/
            
            IDs.oreCopperItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreCopperItem_name, IDs.oreCopperItem_ID_DEFAULT).getInt(IDs.oreCopperItem_ID_DEFAULT);
            IDs.oreIronItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreIronItem_name, IDs.oreIronItem_ID_DEFAULT).getInt(IDs.oreIronItem_ID_DEFAULT);
            IDs.oreSilverItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreSilverItem_name, IDs.oreSilverItem_ID_DEFAULT).getInt(IDs.oreSilverItem_ID_DEFAULT);
            IDs.oreGoldItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreGoldItem_name, IDs.oreGoldItem_ID_DEFAULT).getInt(IDs.oreGoldItem_ID_DEFAULT);
            IDs.orePlatinumItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.orePlatinumItem_name, IDs.orePlatinumItem_ID_DEFAULT).getInt(IDs.orePlatinumItem_ID_DEFAULT);
            IDs.oreMithrilItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreMithrilItem_name, IDs.oreMithrilItem_ID_DEFAULT).getInt(IDs.oreMithrilItem_ID_DEFAULT);
            IDs.oreOrichalcumItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.oreOrichalcumItem_name, IDs.oreOrichalcumItem_ID_DEFAULT).getInt(IDs.oreOrichalcumItem_ID_DEFAULT);
            IDs.logGreenWoodItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.logGreenWoodItem_name, IDs.logGreenWoodItem_ID_DEFAULT).getInt(IDs.logGreenWoodItem_ID_DEFAULT);
            IDs.ingotCopperItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotCopperItem_name, IDs.ingotCopperItem_ID_DEFAULT).getInt(IDs.ingotCopperItem_ID_DEFAULT);
            IDs.ingotIronItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotIronItem_name, IDs.ingotIronItem_ID_DEFAULT).getInt(IDs.ingotIronItem_ID_DEFAULT);
            IDs.ingotSilverItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotSilverItem_name, IDs.ingotSilverItem_ID_DEFAULT).getInt(IDs.ingotSilverItem_ID_DEFAULT);
            IDs.ingotGoldItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotGoldItem_name, IDs.ingotGoldItem_ID_DEFAULT).getInt(IDs.ingotGoldItem_ID_DEFAULT);
            IDs.ingotPlatinumItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotPlatinumItem_name, IDs.ingotPlatinumItem_ID_DEFAULT).getInt(IDs.ingotPlatinumItem_ID_DEFAULT);
            IDs.ingotMithrilItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotMithrilItem_name, IDs.ingotMithrilItem_ID_DEFAULT).getInt(IDs.ingotMithrilItem_ID_DEFAULT);
            IDs.ingotOrichalcumItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.ingotOrichalcumItem_name, IDs.ingotOrichalcumItem_ID_DEFAULT).getInt(IDs.ingotOrichalcumItem_ID_DEFAULT);
            
            
            /** TOOLS **/
            
            IDs.toolCopperPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolCopperPickaxeItem_name, IDs.toolCopperPickaxe_ID_DEFAULT).getInt(IDs.toolCopperPickaxe_ID_DEFAULT);
            IDs.toolIronPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolIronPickaxeItem_name, IDs.toolIronPickaxeItem_ID_DEFAULT).getInt(IDs.toolIronPickaxeItem_ID_DEFAULT);
            IDs.toolSilverPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolSilverPickaxeItem_name, IDs.toolSilverPickaxeItem_ID_DEFAULT).getInt(IDs.toolSilverPickaxeItem_ID_DEFAULT);
            IDs.toolGoldPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolGoldPickaxeItem_name, IDs.toolGoldPickaxeItem_ID_DEFAULT).getInt(IDs.toolGoldPickaxeItem_ID_DEFAULT);
            IDs.toolMithrilPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolMithrilPickaxeItem_name, IDs.toolMithrilPickaxeItem_ID_DEFAULT).getInt(IDs.toolMithrilPickaxeItem_ID_DEFAULT);
            IDs.toolPlatinumPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolPlatinumPickaxeItem_name, IDs.toolPlatinumPickaxeItem_ID_DEFAULT).getInt(IDs.toolPlatinumPickaxeItem_ID_DEFAULT);
            IDs.toolOrichalcumPickaxeItem_ID = config.get(Configuration.CATEGORY_ITEM, Names.toolOrichalcumPickaxeItem_name, IDs.toolOrichalcumPickaxeItem_ID_DEFAULT).getInt(IDs.toolOrichalcumPickaxeItem_ID_DEFAULT);


            //IDs.BaseBlock_actual = config.getBlock(config.CATEGORY_BLOCK, BlockNames.BaseBlock, BlockIds.BaseBlock_default).getInt();
            
        }
        catch(Exception e){
            
            FMLLog.log(Level.SEVERE, e, Reference.ID + " has trouble loading the config");
        }
        finally{
            
            config.save();
        }
    }


}
