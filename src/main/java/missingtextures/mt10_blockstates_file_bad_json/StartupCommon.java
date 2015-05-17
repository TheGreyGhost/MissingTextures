package missingtextures.mt10_blockstates_file_bad_json;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT10 blockMT10;

  public static void preInitCommon()
  {
    blockMT10 = (BlockMT10)(new BlockMT10().setUnlocalizedName("mt10_blockname"));
    GameRegistry.registerBlock(blockMT10, "mt10_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
