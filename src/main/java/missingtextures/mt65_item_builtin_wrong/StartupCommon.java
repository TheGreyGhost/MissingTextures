package missingtextures.mt65_item_builtin_wrong;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT65 blockMT65;

  public static void preInitCommon()
  {
    blockMT65 = (BlockMT65)(new BlockMT65().setUnlocalizedName("mt65_blockname"));
    GameRegistry.registerBlock(blockMT65, "mt65_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
