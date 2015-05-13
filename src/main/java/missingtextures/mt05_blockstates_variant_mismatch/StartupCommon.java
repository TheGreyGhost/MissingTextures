package missingtextures.mt05_blockstates_variant_mismatch;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT05 blockMT05;

  public static void preInitCommon()
  {
    blockMT05 = (BlockMT05)(new BlockMT05().setUnlocalizedName("mt05_blockname"));
    GameRegistry.registerBlock(blockMT05, ItemBlockMT05.class, "mt05_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
