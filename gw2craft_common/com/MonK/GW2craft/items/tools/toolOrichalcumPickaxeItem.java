package com.MonK.GW2craft.items.tools;

import com.MonK.GW2craft.GW2craft;
import com.MonK.GW2craft.lib.Names;
import com.MonK.GW2craft.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class toolOrichalcumPickaxeItem extends ItemPickaxe {
    
    public toolOrichalcumPickaxeItem(int id, EnumToolMaterial material) {
        super(id, material);
        this.setUnlocalizedName(Names.toolOrichalcumPickaxeItem_unlocalizedName);
        this.setCreativeTab(GW2craft.gw2craft);
        this.setMaxStackSize(1); 
        }
    
    @Override
     @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + Names.toolOrichalcumPickaxeItem_unlocalizedName); }

}
