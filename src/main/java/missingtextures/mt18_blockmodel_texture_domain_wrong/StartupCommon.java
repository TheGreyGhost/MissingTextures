package missingtextures.mt18_blockmodel_texture_domain_wrong;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupCommon
{
  public static BlockMT18 blockMT18;

  public static void preInitCommon()
  {
    blockMT18 = (BlockMT18)(new BlockMT18().setUnlocalizedName("mt18_blockname"));
    GameRegistry.registerBlock(blockMT18, "mt18_blockname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
