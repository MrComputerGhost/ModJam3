package kkaylium.GlowGlass;

import kkaylium.GlowGlass.blocks.GGBlocks;
import kkaylium.GlowGlass.gen.GGBiomeOreGen;
import kkaylium.GlowGlass.items.GGItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod (modid = "glowglass", name = "GlowGlass", version = "0.0.001")
@NetworkMod (clientSideRequired = true, serverSideRequired = false)
public class GlowGlass 
{
	@Instance
	public static GlowGlass instance;
	
	@SidedProxy(clientSide = "kkaylium.GlowGlass.ClientProxy", serverSide = "kkaylium.GlowGlass.CommonProxy")
	public static CommonProxy proxy; 
	
	public static CreativeTabs GGTab = new GlowGlassCreativeTab(CreativeTabs.getNextID(), "Glow Glass");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GGBlocks.initBlocks();
		GGItems.initItems();
	
		GameRegistry.registerWorldGenerator(new GGBiomeOreGen());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
