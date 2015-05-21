package missingtextures.mt60_itemmodel_missing_parent_tag;

import missingtextures.mt65_itemblock_parent_model_wrong.BlockMT65;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{
  public static BlockMT65 blockMT65;

  public static void preInitCommon()
  {
    blockMT65 = (BlockMT65)(new BlockMT65().setUnlocalizedName("mt60_blockname"));
    GameRegistry.registerBlock(blockMT65, "mt60_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
