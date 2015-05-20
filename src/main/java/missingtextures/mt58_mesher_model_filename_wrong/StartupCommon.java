package missingtextures.mt58_mesher_model_filename_wrong;

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
  public static ItemMT58 itemMT58;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemMT58 = (ItemMT58)(new ItemMT58().setUnlocalizedName("mt58_itemname"));
    GameRegistry.registerItem(itemMT58, "mt58_itemname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
