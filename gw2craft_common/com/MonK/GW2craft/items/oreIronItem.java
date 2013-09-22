package com.MonK.GW2craft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.MonK.GW2craft.GW2craft;
import com.MonK.GW2craft.lib.Names;
import com.MonK.GW2craft.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class oreIronItem extends Item{
    
    public oreIronItem(int id) {
        super(id);
        
        this.setCreativeTab(GW2craft.gw2craft);
        this.setUnlocalizedName(Names.oreIronItem_unlocalizedName);
        
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + Names.oreIronItem_unlocalizedName);
        
    }

}
