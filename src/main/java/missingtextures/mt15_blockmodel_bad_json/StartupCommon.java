package missingtextures.mt15_blockmodel_bad_json;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT15 blockMT15;

  public static void preInitCommon()
  {
    blockMT15 = (BlockMT15)(new BlockMT15().setUnlocalizedName("mt15_blockname"));
    GameRegistry.registerBlock(blockMT15, "mt15_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
