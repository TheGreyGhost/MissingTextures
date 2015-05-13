package missingtextures.mbe10_item_simple;

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
  public static ItemSimple itemSimple;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemSimple = (ItemSimple)(new ItemSimple().setUnlocalizedName("mbe10_item_simple"));
    GameRegistry.registerItem(itemSimple, "mbe10_item_simple");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
