package missingtextures.mt20_texture_malformed;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT20 blockMT20;

  public static void preInitCommon()
  {
    blockMT20 = (BlockMT20)(new BlockMT20().setUnlocalizedName("mt20_blockname"));
    GameRegistry.registerBlock(blockMT20, "mt20_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
