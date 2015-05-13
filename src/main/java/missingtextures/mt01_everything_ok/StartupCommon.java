package missingtextures.mt01_everything_ok;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT01 blockMT01;

  public static void preInitCommon()
  {
    blockMT01 = (BlockMT01)(new BlockMT01().setUnlocalizedName("mt01_blockname"));
    GameRegistry.registerBlock(blockMT01, "mt01_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
