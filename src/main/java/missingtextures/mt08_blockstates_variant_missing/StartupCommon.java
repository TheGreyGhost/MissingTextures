package missingtextures.mt08_blockstates_variant_missing;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT08 blockMT08;

  public static void preInitCommon()
  {
    blockMT08 = (BlockMT08)(new BlockMT08().setUnlocalizedName("mt08_blockname"));
    GameRegistry.registerBlock(blockMT08, ItemBlockMT08.class, "mt08_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
