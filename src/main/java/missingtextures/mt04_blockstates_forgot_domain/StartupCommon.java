package missingtextures.mt04_blockstates_forgot_domain;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT04 blockMT04;

  public static void preInitCommon()
  {
    blockMT04 = (BlockMT04)(new BlockMT04().setUnlocalizedName("mt04_blockname"));
    GameRegistry.registerBlock(blockMT04, "mt04_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
