package missingtextures.mt62_itemmode_parent_domain_wrong;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class BlockMT62 extends Block
{
  public BlockMT62()
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
}