package missingtextures.mt13_blockmodel_missing_texture_tag;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT13 blockMT13;

  public static void preInitCommon()
  {
    blockMT13 = (BlockMT13)(new BlockMT13().setUnlocalizedName("mt13_blockname"));
    GameRegistry.registerBlock(blockMT13, "mt13_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
