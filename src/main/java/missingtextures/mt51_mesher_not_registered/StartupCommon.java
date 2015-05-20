package missingtextures.mt51_mesher_not_registered;

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
  public static ItemMT51 itemMT51;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemMT51 = (ItemMT51)(new ItemMT51().setUnlocalizedName("mt51_itemname"));
    GameRegistry.registerItem(itemMT51, "mt51_itemname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
