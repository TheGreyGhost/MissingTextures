package missingtextures.mt05_blockstates_variant_mismatch;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class BlockMT05 extends Block
{
  public BlockMT05()
  {
    super(Material.rock);
    this.setCreativeTab(CreativeTabs.tabBlock);   // the block will appear on the Blocks tab in creative
  }

  @SideOnly(Side.CLIENT)
  public EnumWorldBlockLayer getBlockLayer()
  {
    return EnumWorldBlockLayer.SOLID;
  }

  @Override
  public boolean isOpaqueCube() {
    return true;
  }

  @Override
  public boolean isFullCube() {
    return true;
  }

  @Override
  public int getRenderType() {
    return 3;
  }

  // necessary to define which properties your blocks use
  // will also affect the variants listed in the blockstates model file
  @Override
  protected BlockState createBlockState()
  {
    return new BlockState(this, new IProperty[] {FIRSTPROPERTY, SECONDPROPERTY});
  }

  public static final PropertyEnum FIRSTPROPERTY = PropertyEnum.create("firstproperty", EnumProperty1.class);
  public static final PropertyEnum SECONDPROPERTY = PropertyEnum.create("secondproperty", EnumProperty2.class);

  public static enum EnumProperty1 implements IStringSerializable {
    FIRST;
    @Override
    public String getName()
    {
      return "first";
    }
  }

  public enum EnumProperty2 implements IStringSerializable {
    SECOND;
    @Override
    public String getName() {
      return "second";
    }
  }

  // this function returns the correct item type corresponding to the colour of our block;
  // i.e. when a sign is broken, it will drop the correct item.  Ignores Facing, because we get the same item
  //   no matter which way the block is facing
  @Override
  public int damageDropped(IBlockState state)
  {
    return 0;
  }

  // create a list of the subBlocks available for this block, i.e. one for each colour
  // ignores facings, because the facing is calculated when we place the item.
  //  - used to populate items for the creative inventory
  // - the "metadata" value of the block is set to the colours metadata
  @Override
  @SideOnly(Side.CLIENT)
  public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
  {
    list.add(new ItemStack(itemIn, 1, 0));
  }

  // getStateFromMeta, getMetaFromState are used to interconvert between the block's property values and
  //   the stored metadata (which must be an integer in the range 0 - 15 inclusive)
  // The property is encode as:
  // - lower two bits = facing direction (i.e. 0, 1, 2, 3)
  // - upper two bits = colour (i.e. 0, 4, 8, 12)
  @Override
  public IBlockState getStateFromMeta(int meta)
  {
    return this.getDefaultState();
  }

  @Override
  public int getMetaFromState(IBlockState state)
  {
    return 0;
  }

  // this method isn't required if your properties only depend on the stored metadata.
  // it is required if:
  // 1) you are making a multiblock which stores information in other blocks eg BlockBed, BlockDoor
  // 2) your block's state depends on other neighbours (eg BlockFence)
  @Override
  public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
  {
    return state;
  }

  // when the block is placed, set the appropriate facing direction based on which way the player is looking
  // the colour of block is contained in meta, it corresponds to the values we used for getSubBlocks
  @Override
  public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
    return this.getDefaultState();
  }

}
