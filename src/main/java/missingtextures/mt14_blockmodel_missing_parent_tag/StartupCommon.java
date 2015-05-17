package missingtextures.mt14_blockmodel_missing_parent_tag;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT14 blockMT14;

  public static void preInitCommon()
  {
    blockMT14 = (BlockMT14)(new BlockMT14().setUnlocalizedName("mt14_blockname"));
    GameRegistry.registerBlock(blockMT14, "mt14_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
