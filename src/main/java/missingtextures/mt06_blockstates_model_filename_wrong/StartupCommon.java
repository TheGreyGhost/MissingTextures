package missingtextures.mt06_blockstates_model_filename_wrong;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT06 blockMT06;

  public static void preInitCommon()
  {
    blockMT06 = (BlockMT06)(new BlockMT06().setUnlocalizedName("mt06_blockname"));
    GameRegistry.registerBlock(blockMT06, "mt06_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
