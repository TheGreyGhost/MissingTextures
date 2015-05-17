package missingtextures.mt19_blockmodel_texture_domain_forgotten;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT19 blockMT19;

  public static void preInitCommon()
  {
    blockMT19 = (BlockMT19)(new BlockMT19().setUnlocalizedName("mt19_blockname"));
    GameRegistry.registerBlock(blockMT19, "mt19_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
