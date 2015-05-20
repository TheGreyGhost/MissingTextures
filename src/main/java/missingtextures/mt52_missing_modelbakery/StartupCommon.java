package missingtextures.mt52_missing_modelbakery;

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
  public static ItemMT52 itemMT52;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemMT52 = (ItemMT52)(new ItemMT52().setUnlocalizedName("mt52_itemname"));
    GameRegistry.registerItem(itemMT52, "mt52_itemname");
 }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
