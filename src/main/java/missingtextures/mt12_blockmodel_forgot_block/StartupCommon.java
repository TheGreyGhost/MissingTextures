package missingtextures.mt12_blockmodel_forgot_block;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT12 blockMT12;

  public static void preInitCommon()
  {
    blockMT12 = (BlockMT12)(new BlockMT12().setUnlocalizedName("mt12_blockname"));
    GameRegistry.registerBlock(blockMT12, "mt12_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
