package missingtextures.mt54_register_mesher_in_preinit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

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
public class StartupClientOnly
{
  public static void preInitClientOnly()
  {
    // required in order for the renderer to know how to render your item.  Likely to change in the near future.
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt54_itemname", "inventory");
    final int DEFAULT_ITEM_SUBTYPE = 0;
//    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.itemMT54, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    System.out.println("mt54_register_mesher_in_preinit causes an NPE");
  }

  public static void initClientOnly()
  {
  }

public static void postInitClientOnly()
  {
  }
}
