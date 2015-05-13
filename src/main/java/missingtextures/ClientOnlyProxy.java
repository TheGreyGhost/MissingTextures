package missingtextures;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ClientProxy is used to set up the mod and start it running on normal minecraft.  It contains all the code that should run on the
 *   client side only.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientOnlyProxy extends CommonProxy
{

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit()
  {
    super.preInit();

    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
    missingtextures.mt02_blockstates_filename_mismatch.StartupClientOnly.preInitClientOnly();
    missingtextures.mbe02_block_partial.StartupClientOnly.preInitClientOnly();
    missingtextures.mbe03_block_variants.StartupClientOnly.preInitClientOnly();
    missingtextures.mbe10_item_simple.StartupClientOnly.preInitClientOnly();
    missingtextures.mbe11_item_variants.StartupClientOnly.preInitClientOnly();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
    super.init();
    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
    missingtextures.mt02_blockstates_filename_mismatch.StartupClientOnly.initClientOnly();
    missingtextures.mbe03_block_variants.StartupClientOnly.initClientOnly();
    missingtextures.mbe10_item_simple.StartupClientOnly.initClientOnly();
    missingtextures.mbe11_item_variants.StartupClientOnly.initClientOnly();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    super.postInit();
    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
    missingtextures.mt02_blockstates_filename_mismatch.StartupClientOnly.postInitClientOnly();
    missingtextures.mbe03_block_variants.StartupClientOnly.postInitClientOnly();
    missingtextures.mbe10_item_simple.StartupClientOnly.postInitClientOnly();
    missingtextures.mbe11_item_variants.StartupClientOnly.postInitClientOnly();
  }

  @Override
  public boolean playerIsInCreativeMode(EntityPlayer player) {
    if (player instanceof EntityPlayerMP) {
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
      return entityPlayerMP.theItemInWorldManager.isCreative();
    } else if (player instanceof EntityPlayerSP) {
      return Minecraft.getMinecraft().playerController.isInCreativeMode();
    }
    return false;
  }
}
