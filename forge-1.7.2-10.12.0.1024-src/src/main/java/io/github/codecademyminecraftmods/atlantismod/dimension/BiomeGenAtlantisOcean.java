package io.github.codecademyminecraftmods.atlantismod.dimension;

import io.github.codecademyminecraftmods.atlantismod.AtlantisMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenOcean;

public class BiomeGenAtlantisOcean extends BiomeGenOcean {
	
	public BiomeGenAtlantisOcean(int par1) {
		super(par1);
		this.topBlock = Blocks.water;
		this.fillerBlock = AtlantisMod.blockDeepSand;
	}

}
