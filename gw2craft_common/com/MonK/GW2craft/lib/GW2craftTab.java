package com.MonK.GW2craft.lib;

import com.MonK.GW2craft.blocks.Blocks;

import net.minecraft.creativetab.CreativeTabs;

public class GW2craftTab extends CreativeTabs{

    public GW2craftTab(int id, String name) {
        super(id, name);
    }

    @Override
    public int getTabIconItemIndex() {
        return Blocks.oreCopper.blockID;
        
    }
}
