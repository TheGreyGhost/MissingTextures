package missingtextures.mt09_block_registered_in_init;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT09 blockMT09;

  public static void preInitCommon()
  {
  }

  public static void initCommon()
  {
    blockMT09 = (BlockMT09)(new BlockMT09().setUnlocalizedName("mt09_blockname"));
    GameRegistry.registerBlock(blockMT09, "mt09_blockname");
  }

  public static void postInitCommon()
  {
  }

}
