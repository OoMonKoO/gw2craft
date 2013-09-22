package com.MonK.GW2craft.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.MonK.GW2craft.GW2craft;
import com.MonK.GW2craft.lib.Names;
import com.MonK.GW2craft.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**public class oreBaseBlock extends Block {
    
    public oreBaseBlock (int id) {
        super (id, Material.rock);
        this.setCreativeTab(GW2craft.gw2craft);
        
    }
@SideOnly(Side.CLIENT)
public static Icon[] icons; 

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister icon) {
    icons = new Icon[Names.oreBaseBlock_unlocalized_name.length];
    
    for (int i = 0; i < icons.length; i++) {
        icons[i] = icon.registerIcon(Reference.ID.toLowerCase() + ":" + Names.oreBaseBlock_unlocalized_name[i]);}
        
    }
    
@Override
public Icon getIcon(int side, int meta) {
    return icons[meta];
}
    
@Override
public int damageDropped(int meta) {
    return meta;
    
}
   @Override
   public void getSubBlocks(int id, CreativeTabs tab, List list) {
       for (int i = 0; i < Names.oreBaseBlock_name.length; i++) {
           list.add(new ItemStack(this, 1, i));
           
       }
   }
}

*/