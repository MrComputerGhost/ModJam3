package kkaylium.GlowGlass.doors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.GlowGlass.GlowGlass;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class GGDoorItem extends Item{
		
	public Block doorBlock;
	public GGDoorItem(int par1, Block par2Block)
	{
		super(par1);
		this.maxStackSize = 1;
		this.doorBlock = par2Block;
		this.setCreativeTab(GlowGlass.GGTab);
	}
	 public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	    {
	    if (par7 != 1)
	    {
	    return false;
	    }
	    else
	    {
	    ++par5;
	    Block block = this.doorBlock;

	    if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
	    {
	    if (!block.canPlaceBlockAt(par3World, par4, par5, par6))
	    {
	    return false;
	    }
	    else
	    {
	    int i1 = MathHelper.floor_double((double)((par2EntityPlayer.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
	    ItemDoor.placeDoorBlock(par3World, par4, par5, par6, i1, block);
	    --par1ItemStack.stackSize;
	    return true;
	    }
	    }
	    else
	    {
	    return false;
	    }
	    }
	    }
	 
	 @Override
     public void registerIcons(IconRegister iconRegister)
     {
		 itemIcon = iconRegister.registerIcon("glowglass:GlowDoorWHITE");
     }
	 
	 @Override
	 @SideOnly(Side.CLIENT)
	 public boolean requiresMultipleRenderPasses() 
	 {
	     return true;
	 }
	 
	
}
