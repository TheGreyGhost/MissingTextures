package missingtextures.mt08_blockstates_variant_missing;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class BlockMT08 extends Block
{
  public BlockMT08()
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
    return new BlockState(this, new IProperty[] {FIRSTPROPERTY});
  }

  public static final PropertyBool FIRSTPROPERTY = PropertyBool.create("boolean");

  // this function returns the correct item type corresponding to the colour of our block;
  // i.e. when a sign is broken, it will drop the correct item.  Ignores Facing, because we get the same item
  //   no matter which way the block is facing
  @Override
  public int damageDropped(IBlockState state)
  {
    return (Boolean)(state.getValue(FIRSTPROPERTY)) ? 1 : 0;
  }

  @Override
  public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
   return getStateFromMeta(meta);
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
    list.add(new ItemStack(itemIn, 1, 1));
  }

  // getStateFromMeta, getMetaFromState are used to interconvert between the block's property values and
  //   the stored metadata (which must be an integer in the range 0 - 15 inclusive)
  // The property is encode as:
  // - lower two bits = facing direction (i.e. 0, 1, 2, 3)
  // - upper two bits = colour (i.e. 0, 4, 8, 12)
  @Override
  public IBlockState getStateFromMeta(int meta)
  {
    if (meta == 1) return this.getDefaultState().withProperty(FIRSTPROPERTY, true);
    return this.getDefaultState().withProperty(FIRSTPROPERTY, false);
  }

  @Override
  public int getMetaFromState(IBlockState state)
  {
    return (Boolean)(state.getValue(FIRSTPROPERTY)) ? 1 : 0;
  }
}
