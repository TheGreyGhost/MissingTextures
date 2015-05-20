package missingtextures.mt61_itemmodel_parent_filename_wrong;

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
  public static ItemMT61 itemMT61;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    itemMT61 = (ItemMT61)(new ItemMT61().setUnlocalizedName("mt61_itemname"));
    GameRegistry.registerItem(itemMT61, "mt61_itemname");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
