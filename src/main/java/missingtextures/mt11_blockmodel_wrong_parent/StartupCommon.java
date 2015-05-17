package missingtextures.mt11_blockmodel_wrong_parent;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT11 blockMT11;

  public static void preInitCommon()
  {
    blockMT11 = (BlockMT11)(new BlockMT11().setUnlocalizedName("mt11_blockname"));
    GameRegistry.registerBlock(blockMT11, "mt11_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
