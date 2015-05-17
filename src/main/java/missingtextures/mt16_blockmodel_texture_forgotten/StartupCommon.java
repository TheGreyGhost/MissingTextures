package missingtextures.mt16_blockmodel_texture_forgotten;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT16 blockMT16;

  public static void preInitCommon()
  {
    blockMT16 = (BlockMT16)(new BlockMT16().setUnlocalizedName("mt16_blockname"));
    GameRegistry.registerBlock(blockMT16, "mt16_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
