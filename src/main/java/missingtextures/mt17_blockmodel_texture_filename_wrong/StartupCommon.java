package missingtextures.mt17_blockmodel_texture_filename_wrong;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT17 blockMT17;

  public static void preInitCommon()
  {
    blockMT17 = (BlockMT17)(new BlockMT17().setUnlocalizedName("mt17_blockname"));
    GameRegistry.registerBlock(blockMT17, "mt17_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
