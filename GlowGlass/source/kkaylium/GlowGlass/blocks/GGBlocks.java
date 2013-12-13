package kkaylium.GlowGlass.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class GGBlocks {
	
	public static Block GlowGlass_WHITE;
	
	public static void initBlocks()
	{
		GlowGlass_WHITE = new BlockGlowGlass(500).setUnlocalizedName("GlowGlass");
			GameRegistry.registerBlock(GlowGlass_WHITE, "WhiteGlowGlass");
			LanguageRegistry.addName(GlowGlass_WHITE, "Glow Glass: White");
		
	}

}
