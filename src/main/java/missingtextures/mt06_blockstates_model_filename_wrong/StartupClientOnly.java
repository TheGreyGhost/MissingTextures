package missingtextures.mt06_blockstates_model_filename_wrong;

import net.minecraft.client.Minecraft;
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
  }

  public static void initClientOnly()
  {
    Item itemBlockSimple = GameRegistry.findItem("missingtextures", "mt06_blockname");
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("missingtextures:mt06_blockname", "inventory");
    final int DEFAULT_ITEM_SUBTYPE = 0;
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
  }

  public static void postInitClientOnly()
  {
  }
}
