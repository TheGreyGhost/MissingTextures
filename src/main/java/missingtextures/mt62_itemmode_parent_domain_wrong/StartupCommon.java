package missingtextures.mt62_itemmode_parent_domain_wrong;

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
  public static ItemMT62 itemMT62;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemMT62 = (ItemMT62)(new ItemMT62().setUnlocalizedName("mt62_itemname"));
    GameRegistry.registerItem(itemMT62, "mt62_itemname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
