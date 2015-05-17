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
    missingtextures.mt03_blockstates_wrong_domain.StartupClientOnly.preInitClientOnly();
    missingtextures.mt04_blockstates_forgot_domain.StartupClientOnly.preInitClientOnly();
    missingtextures.mt05_blockstates_variant_mismatch.StartupClientOnly.preInitClientOnly();
    missingtextures.mt06_blockstates_model_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt07_blockstates_normal_missing.StartupClientOnly.preInitClientOnly();
    missingtextures.mt08_blockstates_variant_missing.StartupClientOnly.preInitClientOnly();
    missingtextures.mt09_block_registered_in_init.StartupClientOnly.preInitClientOnly();
    missingtextures.mt10_blockstates_file_bad_json.StartupClientOnly.preInitClientOnly();
    missingtextures.mt11_blockmodel_wrong_parent.StartupClientOnly.preInitClientOnly();
    missingtextures.mt12_blockmodel_forgot_block.StartupClientOnly.preInitClientOnly();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupClientOnly.preInitClientOnly();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupClientOnly.preInitClientOnly();
    missingtextures.mt15_blockmodel_bad_json.StartupClientOnly.preInitClientOnly();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupClientOnly.preInitClientOnly();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupClientOnly.preInitClientOnly();
    missingtextures.mt20_texture_malformed.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.preInitClientOnly();

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
    missingtextures.mt03_blockstates_wrong_domain.StartupClientOnly.initClientOnly();
    missingtextures.mt04_blockstates_forgot_domain.StartupClientOnly.initClientOnly();
    missingtextures.mt05_blockstates_variant_mismatch.StartupClientOnly.initClientOnly();

    missingtextures.mt06_blockstates_model_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt07_blockstates_normal_missing.StartupClientOnly.initClientOnly();
    missingtextures.mt08_blockstates_variant_missing.StartupClientOnly.initClientOnly();
    missingtextures.mt09_block_registered_in_init.StartupClientOnly.initClientOnly();
    missingtextures.mt10_blockstates_file_bad_json.StartupClientOnly.initClientOnly();
    missingtextures.mt11_blockmodel_wrong_parent.StartupClientOnly.initClientOnly();
    missingtextures.mt12_blockmodel_forgot_block.StartupClientOnly.initClientOnly();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupClientOnly.initClientOnly();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupClientOnly.initClientOnly();
    missingtextures.mt15_blockmodel_bad_json.StartupClientOnly.initClientOnly();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupClientOnly.initClientOnly();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupClientOnly.initClientOnly();
    missingtextures.mt20_texture_malformed.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.initClientOnly();


  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    super.postInit();
    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
    missingtextures.mt02_blockstates_filename_mismatch.StartupClientOnly.postInitClientOnly();
    missingtextures.mt03_blockstates_wrong_domain.StartupClientOnly.postInitClientOnly();
    missingtextures.mt04_blockstates_forgot_domain.StartupClientOnly.postInitClientOnly();
    missingtextures.mt05_blockstates_variant_mismatch.StartupClientOnly.postInitClientOnly();
    missingtextures.mt06_blockstates_model_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt07_blockstates_normal_missing.StartupClientOnly.postInitClientOnly();
    missingtextures.mt08_blockstates_variant_missing.StartupClientOnly.postInitClientOnly();
    missingtextures.mt09_block_registered_in_init.StartupClientOnly.postInitClientOnly();
    missingtextures.mt10_blockstates_file_bad_json.StartupClientOnly.postInitClientOnly();
    missingtextures.mt11_blockmodel_wrong_parent.StartupClientOnly.postInitClientOnly();
    missingtextures.mt12_blockmodel_forgot_block.StartupClientOnly.postInitClientOnly();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupClientOnly.postInitClientOnly();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupClientOnly.postInitClientOnly();
    missingtextures.mt15_blockmodel_bad_json.StartupClientOnly.postInitClientOnly();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupClientOnly.postInitClientOnly();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupClientOnly.postInitClientOnly();
    missingtextures.mt20_texture_malformed.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();
//    missingtextures.mt01_everything_ok.StartupClientOnly.postInitClientOnly();

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
