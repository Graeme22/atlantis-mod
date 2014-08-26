package atlantismod.common.block;

import java.util.Random;

import atlantismod.common.AtlantisMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
//the seaweed does not grow at the moment.
public class BlockSeaweed extends Block implements IPlantable{

	public BlockSeaweed(int par1)
    {
		//water material will work for now, but it is still a little bit funky.
        super(par1, Material.water);
        float f = 0.375F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        this.setTickRandomly(true);
    }
	
    /**
     * Returns if this material is considered solid or not
     */
    public boolean isSolid()
    {
        return false;
    }
	
	/**
    * Ticks the block if it's been scheduled
    */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.getBlockMaterial(par2, par3 + 1, par4) == Material.water)
        {
            int l;

            for (l = 1; par1World.getBlockId(par2, par3 - l, par4) == this.blockID; ++l)
            {
                ;
            }

            if (l < 3)
            {
                int i1 = par1World.getBlockMetadata(par2, par3, par4);

                if (i1 == 15)
                {
                    par1World.setBlock(par2, par3 + 1, par4, this.blockID);
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
                }
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
    	//this is a bit long, it might need some work.
    	boolean isWater = (par1World.getBlockMaterial(par2 - 1, par3, par4) == Material.water || par1World.getBlockMaterial(par2 + 1, par3, par4) == Material.water || par1World.getBlockMaterial(par2, par3, par4 + 1) == Material.water || par1World.getBlockMaterial(par2, par3, par4 - 1) == Material.water || par1World.getBlockMaterial(par2, par3 - 1, par4) == Material.water);
        Block block = Block.blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        //return statement needs more work.
        return (block == Block.sand && isWater || block == this && isWater);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        this.checkBlockCoordValid(par1World, par2, par3, par4);
    }

    /**
     * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
     */
    /*needs more work; at the moment the seaweed will not grow all the way up to the surface,
	it will stop at one block below the surface.*/
    protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
    {
    	//this is a bit long
    	boolean isAir = (par1World.isAirBlock(par2, par3 - 1, par4));
    	
        if (isAir)
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return this.canPlaceBlockAt(par1World, par2, par3, par4);
    }

    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return AtlantisMod.seaweedItem.itemID;
    }

    
    public boolean isOpaqueCube()
    {
        return false;
    }

    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    
    public int getRenderType()
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)

    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return AtlantisMod.seaweedItem.itemID;
    }

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return EnumPlantType.Water;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return world.getBlockMetadata(x, y, z);
	}
	
}