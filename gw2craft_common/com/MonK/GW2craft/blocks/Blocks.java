package com.MonK.GW2craft.blocks;

import net.minecraft.block.Block;
import com.MonK.GW2craft.lib.IDs;
import com.MonK.GW2craft.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
public static Block oreCopper;
public static Block oreIron;
public static Block oreSilver;
public static Block oreGold;
public static Block orePlatinum;
public static Block oreMithril;
public static Block oreOrichalcum;
public static Block oreBaseBlock;
public static Block logKertchBlock;
public static Block leafKertchBlock;
public static Block saplingKertchBlock;

public static void init() {
oreCopper = new oreCopperBlock(IDs.oreCopperBlock_ID);
GameRegistry.registerBlock(oreCopper, Names.oreCopperBlock_name);

oreIron = new oreIronBlock(IDs.oreIronBlock_ID);
GameRegistry.registerBlock(oreIron, Names.oreIronBlock_name);

oreSilver = new oreSilverBlock(IDs.oreSilverBlock_ID);
GameRegistry.registerBlock(oreSilver, Names.oreSilverBlock_name);

oreGold = new oreGoldBlock(IDs.oreGoldBlock_ID);
GameRegistry.registerBlock(oreGold, Names.oreGoldBlock_name);

orePlatinum = new orePlatinumBlock(IDs.orePlatinumBlock_ID);
GameRegistry.registerBlock(orePlatinum, Names.orePlatinumBlock_name);

oreMithril = new oreMithrilBlock(IDs.oreMithrilBlock_ID);
GameRegistry.registerBlock(oreMithril, Names.oreMithrilBlock_name);

oreOrichalcum = new oreOrichalcumBlock(IDs.oreOrichalcumBlock_ID);
GameRegistry.registerBlock(oreOrichalcum, Names.oreOrichalcumBlock_name);

logKertchBlock = new logKertchBlock(IDs.logKertchBlock_ID);
GameRegistry.registerBlock(logKertchBlock, Names.logKertchBlock_name);

leafKertchBlock = new leafKertchBlock(IDs.leafKertchBlock_ID);
GameRegistry.registerBlock(leafKertchBlock, Names.leafKertchBlock_name);

saplingKertchBlock = new saplingKertchBlock(IDs.saplingKertchBlock_ID);
GameRegistry.registerBlock(saplingKertchBlock, Names.saplingKertchBlock_name);

//oreBaseBlock = new oreBaseBlock(IDs.oreBaseBlock_actual);
//GameRegistry.registerBlock(oreBaseBlock, oreBaseBlockHandler.class);

}

public static void addNames() {
    LanguageRegistry.addName(oreCopper, Names.oreCopperBlock_name);
    LanguageRegistry.addName(oreIron, Names.oreIronBlock_name);
    LanguageRegistry.addName(oreSilver, Names.oreSilverBlock_name);
    LanguageRegistry.addName(oreGold, Names.oreGoldBlock_name);
    LanguageRegistry.addName(orePlatinum, Names.orePlatinumBlock_name);
    LanguageRegistry.addName(oreMithril, Names.oreMithrilBlock_name);
    LanguageRegistry.addName(oreOrichalcum, Names.oreOrichalcumBlock_name);
    LanguageRegistry.addName(logKertchBlock, Names.logKertchBlock_name);
    LanguageRegistry.addName(leafKertchBlock, Names.leafKertchBlock_name);
    LanguageRegistry.addName(saplingKertchBlock, Names.saplingKertchBlock_name);
    
    //for(int i = 0; i < Names.oreBaseBlock_name.length; i++) {
      //  LanguageRegistry.addName(new ItemStack(oreBaseBlock, 1, i), Names.oreBaseBlock_name[i]);
        }
    }
    


