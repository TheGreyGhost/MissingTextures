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
    missingtextures.mt51_mesher_not_registered.StartupClientOnly.preInitClientOnly();
    missingtextures.mt52_missing_modelbakery.StartupClientOnly.preInitClientOnly();
    missingtextures.mt53_item_registered_in_init.StartupClientOnly.preInitClientOnly();
    missingtextures.mt54_register_mesher_in_preinit.StartupClientOnly.preInitClientOnly();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupClientOnly.preInitClientOnly();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt57_mesher_forgot_inventory.StartupClientOnly.preInitClientOnly();
    missingtextures.mt58_mesher_model_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt59_mesher_metadata_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupClientOnly.preInitClientOnly();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupClientOnly.preInitClientOnly();
    missingtextures.mt64_itemmodel_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt65_itemblock_parent_model_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt66_item_builtin_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt67_texture_layer0_missing.StartupClientOnly.preInitClientOnly();
    missingtextures.mt68_texture_filename_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt69_texture_domain_wrong.StartupClientOnly.preInitClientOnly();
    missingtextures.mt70_texture_domain_missing.StartupClientOnly.preInitClientOnly();
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
    missingtextures.mt51_mesher_not_registered.StartupClientOnly.initClientOnly();
    missingtextures.mt52_missing_modelbakery.StartupClientOnly.initClientOnly();
    missingtextures.mt53_item_registered_in_init.StartupClientOnly.initClientOnly();
    missingtextures.mt54_register_mesher_in_preinit.StartupClientOnly.initClientOnly();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupClientOnly.initClientOnly();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt57_mesher_forgot_inventory.StartupClientOnly.initClientOnly();
    missingtextures.mt58_mesher_model_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt59_mesher_metadata_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupClientOnly.initClientOnly();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupClientOnly.initClientOnly();
    missingtextures.mt64_itemmodel_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt65_itemblock_parent_model_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt66_item_builtin_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt67_texture_layer0_missing.StartupClientOnly.initClientOnly();
    missingtextures.mt68_texture_filename_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt69_texture_domain_wrong.StartupClientOnly.initClientOnly();
    missingtextures.mt70_texture_domain_missing.StartupClientOnly.initClientOnly();

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
    missingtextures.mt51_mesher_not_registered.StartupClientOnly.postInitClientOnly();
    missingtextures.mt52_missing_modelbakery.StartupClientOnly.postInitClientOnly();
    missingtextures.mt53_item_registered_in_init.StartupClientOnly.postInitClientOnly();
    missingtextures.mt54_register_mesher_in_preinit.StartupClientOnly.postInitClientOnly();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupClientOnly.postInitClientOnly();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt57_mesher_forgot_inventory.StartupClientOnly.postInitClientOnly();
    missingtextures.mt58_mesher_model_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt59_mesher_metadata_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupClientOnly.postInitClientOnly();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupClientOnly.postInitClientOnly();
    missingtextures.mt64_itemmodel_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt65_itemblock_parent_model_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt66_item_builtin_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt67_texture_layer0_missing.StartupClientOnly.postInitClientOnly();
    missingtextures.mt68_texture_filename_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt69_texture_domain_wrong.StartupClientOnly.postInitClientOnly();
    missingtextures.mt70_texture_domain_missing.StartupClientOnly.postInitClientOnly();

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
