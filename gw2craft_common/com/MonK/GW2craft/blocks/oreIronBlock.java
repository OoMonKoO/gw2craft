package com.MonK.GW2craft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.MonK.GW2craft.GW2craft;
import com.MonK.GW2craft.items.Items;
import com.MonK.GW2craft.lib.Names;
import com.MonK.GW2craft.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class oreIronBlock extends Block{
    
    public oreIronBlock(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName(Names.oreIronBlock_unlocaliziedName);
        this.setCreativeTab(GW2craft.gw2craft);
        this.setHardness(1.8F);
        this.setResistance(10F);
        this.setLightValue(0.2F);
        
            
        }
        public int idDropped(int i, Random rand , int j) {
        
            return Items.oreIronItem.itemID; }
        
        public int quantityDropped (Random rand) {
            return rand.nextInt(3);
            
        }
        
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        blockIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + Names.oreIronBlock_unlocaliziedName);
        
    }

}
