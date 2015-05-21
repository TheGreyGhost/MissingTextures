package missingtextures.mt52_missing_modelbakery;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
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
//    need to add the variants to the bakery so it knows what models are available for rendering the different subtypes
    ModelBakery.addVariantName(StartupCommon.itemMT52,  "missingtextures:mt52_itemmodel_1"
//            , "missingtextures:mt52_itemmodel_2"
    );
  }

 public static void initClientOnly()
  {
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt52_itemmodel_1", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.itemMT52, 1, itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt52_itemmodel_2", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.itemMT52, 2, itemModelResourceLocation);
  }

  public static void postInitClientOnly()
  {
  }
}
