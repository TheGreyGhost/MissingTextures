package missingtextures.mt02_blockstates_filename_mismatch;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT02 blockMT02;

  public static void preInitCommon()
  {
    blockMT02 = (BlockMT02)(new BlockMT02().setUnlocalizedName("mt02_blockname_mismatch"));
    GameRegistry.registerBlock(blockMT02, "mt02_blockname_mismatch");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
