package missingtextures.mt08_blockstates_variant_missing;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 10/05/2015
 */
public class StartupClientOnly
{
  public static void preInitClientOnly()
  {
    Item itemBlockSimple = GameRegistry.findItem("missingtextures", "mt08_blockname");
    ModelBakery.addVariantName(itemBlockSimple, "missingtextures:mt08_blockname_false",
                                                "missingtextures:mt08_blockname_true");
  }

  public static void initClientOnly()
  {
    Item itemBlockSimple = GameRegistry.findItem("missingtextures", "mt08_blockname");

    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt08_blockname_false", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, 0, itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt08_blockname_true", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, 1, itemModelResourceLocation);
  }

  public static void postInitClientOnly()
  {
  }
}
