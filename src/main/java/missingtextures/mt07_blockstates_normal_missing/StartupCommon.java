package missingtextures.mt07_blockstates_normal_missing;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT07 blockMT07;

  public static void preInitCommon()
  {
    blockMT07 = (BlockMT07)(new BlockMT07().setUnlocalizedName("mt07_blockname"));
    GameRegistry.registerBlock(blockMT07, "mt07_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
