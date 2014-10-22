package io.github.codecademyminecraftmods.atlantismod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class AtlantisCrafting {

	public static void loadRecipes() {

	GameRegistry.addRecipe(new ItemStack(AtlantisMod.teleportFocus),"xxx","xmx","xxx",'x',AtlantisMod.atlanteum,'m',Items.blazeRod);
        GemeRegistry.addRecipe(new ItemStack(AtlantisMod.bubbleFocus), "xxx","xmx","xxx",'x',AtlantisMod.atlanteum,'m',Items.glass_bottle);

        GameRegistry.addRecipe(new ItemStack(AtlantisMod.atlantisWand),"  f"," x ","x  ",'x',Items.blazeRod,'f',AtlantisMod.teleportFocus);

        GameRegistry.addRecipe(new ItemStack(Items.dye,2,15),"x",'x',AtlantisMod.fishHead);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.blockPearl),"xxx","xxx","xxx",'x',AtlantisMod.pearl);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.pearl),"x",'x',AtlantisMod.blockPearl);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.necklace),"ggg","g g"," e ",'g',Items.gold_ingot,'e',AtlantisMod.atlantisEye);
        
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.atlanteum),"xxx","xxx","xxx",'x',AtlantisMod.nuggetAtlanteum);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.nuggetAtlanteum,9),"x",'x',AtlantisMod.atlanteum);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.blockAtlanteum),"xxx","xxx","xxx",'x',AtlantisMod.atlanteum);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.atlanteum,9),"x",'x',AtlantisMod.blockAtlanteum);
        GameRegistry.addSmelting(new ItemStack(AtlantisMod.oreAtlanteum),new ItemStack(AtlantisMod.atlanteum),0.3F);

        GameRegistry.addRecipe(new ItemStack(AtlantisMod.axePearl),"xx ","xs "," s ",'x',AtlantisMod.pearl,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.pickaxePearl),"xxx"," s "," s ",'x',AtlantisMod.pearl,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.hoePearl),"xx "," s "," s ",'x',AtlantisMod.pearl,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.swordPearl)," x "," x "," s ",'x',AtlantisMod.pearl,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.shovelPearl)," x "," s "," s ",'x',AtlantisMod.pearl,'s',Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.axeAtlanteum),"xx ","xs "," s ",'x',AtlantisMod.atlanteum,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.pickaxeAtlanteum),"xxx"," s "," s ",'x',AtlantisMod.atlanteum,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.hoeAtlanteum),"xx "," s "," s ",'x',AtlantisMod.atlanteum,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.swordAtlanteum)," x "," x "," s ",'x',AtlantisMod.atlanteum,'s',Items.stick);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.shovelAtlanteum)," x "," s "," s ",'x',AtlantisMod.atlanteum,'s',Items.stick);

        GameRegistry.addRecipe(new ItemStack(AtlantisMod.divingHelmet),"iii","ibi",'i',Items.iron_ingot,'b',Blocks.iron_bars);
        GameRegistry.addRecipe(new ItemStack(AtlantisMod.scubaSuit),"x x","xsx","xxx",'x',Items.leather,'s',Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.oxygenTank),"xxx","xbx","xxx",'x',Items.iron_ingot,'b',Items.glass_bottle);
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.flippers),"x x","x x",'x',Blocks.waterlily);
		
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.helmetAtlanteum),"xxx","x x",'x',AtlantisMod.atlanteum);
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.chestAtlanteum),"x x","xxx","xxx",'x',AtlantisMod.atlanteum);
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.legsAtlanteum),"xxx","x x","x x",'x',AtlantisMod.atlanteum);
		GameRegistry.addRecipe(new ItemStack(AtlantisMod.bootsAtlanteum),"x x","x x",'x',AtlantisMod.atlanteum);
	}
	
}