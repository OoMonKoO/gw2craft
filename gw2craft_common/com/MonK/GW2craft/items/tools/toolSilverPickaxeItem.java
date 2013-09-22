package com.MonK.GW2craft.items.tools;

import com.MonK.GW2craft.GW2craft;
import com.MonK.GW2craft.lib.Names;
import com.MonK.GW2craft.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class toolSilverPickaxeItem extends ItemPickaxe {

    public toolSilverPickaxeItem(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        this.setUnlocalizedName(Names.toolSilverPickaxeItem_unlocalizedName);
        this.setCreativeTab(GW2craft.gw2craft);
        this.setMaxStackSize(1); 
  
    }

        
    
 @Override
     @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + Names.toolSilverPickaxeItem_unlocalizedName); }
    
    }

