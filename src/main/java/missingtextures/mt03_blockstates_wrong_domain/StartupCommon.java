package missingtextures.mt03_blockstates_wrong_domain;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT03 blockMT03;

  public static void preInitCommon()
  {
    blockMT03 = (BlockMT03)(new BlockMT03().setUnlocalizedName("mt03_blockname"));
    GameRegistry.registerBlock(blockMT03, "mt03_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
