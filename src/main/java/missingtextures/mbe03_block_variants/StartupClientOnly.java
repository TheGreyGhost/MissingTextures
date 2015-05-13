package missingtextures.mbe03_block_variants;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
public class StartupClientOnly
{
  public static void preInitClientOnly()
  {
    Item itemBlockVariants = GameRegistry.findItem("missingtextures", "mbe03_block_variants");

    // need to add the variants to the bakery so it knows what models are available for rendering the different subtypes
    ModelBakery.addVariantName(itemBlockVariants, "missingtextures:mbe03_block_variants_blue",
            "missingtextures:mbe03_block_variants_green",
            "missingtextures:mbe03_block_variants_red",
            "missingtextures:mbe03_block_variants_yellow");
  }

  public static void initClientOnly()
  {
    // This is currently necessary in order to make your block render properly when it is an item (i.e. in the inventory
    //   or in your hand or thrown on the ground).
    // Minecraft knows to look for the item model based on the GameRegistry.registerBlock.  However the registration of
    //  the model for each item is normally done by RenderItem.registerItems(), and this is not currently aware
    //   of any extra items you have created.  Hence you have to do it manually.  This will probably change in future.
    // It must be done in the init phase, not preinit, and must be done on client only.
    Item itemBlockVariants = GameRegistry.findItem("missingtextures", "mbe03_block_variants");
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("missingtextures:mbe03_block_variants_blue", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, BlockVariants.EnumColour.BLUE.getMetadata(), itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("missingtextures:mbe03_block_variants_green", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, BlockVariants.EnumColour.GREEN.getMetadata(), itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("missingtextures:mbe03_block_variants_red", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, BlockVariants.EnumColour.RED.getMetadata(), itemModelResourceLocation);

    itemModelResourceLocation = new ModelResourceLocation("missingtextures:mbe03_block_variants_yellow", "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, BlockVariants.EnumColour.YELLOW.getMetadata(), itemModelResourceLocation);
  }

  public static void postInitClientOnly()
  {
  }
}
