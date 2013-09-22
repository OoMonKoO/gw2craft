package com.MonK.GW2craft.lib;

import java.util.Random;

import com.MonK.GW2craft.blocks.Blocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
    
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch(world.provider.dimensionId)
        {
               case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
               case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
               case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
  }
 
  private void generateEnd(World world, Random random, int x, int z)
  {
       
  }

  private void generateSurface(World world, Random random, int x, int z)
  {
      this.addOreSpawn(Blocks.oreCopper, world, random, x, z, 16, 16, 4 + random.nextInt(5), 10, 60, 90);
      this.addOreSpawn(Blocks.oreIron, world, random, x, z, 16, 16, 4 + random.nextInt(5), 10, 50, 60);
      this.addOreSpawn(Blocks.oreSilver, world, random, x, z, 16, 16, 4 + random.nextInt(4), 8, 50, 60);
      this.addOreSpawn(Blocks.oreGold, world, random, x, z, 16, 16, 4 + random.nextInt(4), 7, 30, 35);
      this.addOreSpawn(Blocks.orePlatinum, world, random, x, z, 16, 16, 4 + random.nextInt(2), 6, 20, 25);
      this.addOreSpawn(Blocks.oreMithril, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 25);
      this.addOreSpawn(Blocks.oreOrichalcum, world, random, x, z, 16, 16, 4 + random.nextInt(2), 2, 3, 20);

      for (int t = 0; t < 1; t++)
      {
          int chunkX1 = x + random.nextInt(16);
          int chunkY1 = random.nextInt(90);
          int chunkZ1 = z + random.nextInt(16);
          
          (new KertchWorldGenTrees(false, 5, 0, 0, false)).generate(world, random, chunkX1, chunkY1, chunkZ1);
      }
  }

  private void generateNether(World world, Random random, int x, int z)
  {
       
  }

    
   
 
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
           int maxPossY = minY + (maxY - 1);
           assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
           assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
           assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
           assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
           assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
          
           int diffBtwnMinMaxY = maxY - minY;
           for(int x = 0; x < chancesToSpawn; x++)
           {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
           }
           
           
    }
}
