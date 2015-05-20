package missingtextures;

import net.minecraft.entity.player.EntityPlayer;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit()
  {

    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
    missingtextures.mt02_blockstates_filename_mismatch.StartupCommon.preInitCommon();
    missingtextures.mt03_blockstates_wrong_domain.StartupCommon.preInitCommon();
    missingtextures.mt04_blockstates_forgot_domain.StartupCommon.preInitCommon();
    missingtextures.mt05_blockstates_variant_mismatch.StartupCommon.preInitCommon();
    missingtextures.mt06_blockstates_model_filename_wrong.StartupCommon.preInitCommon();

    missingtextures.mt07_blockstates_normal_missing.StartupCommon.preInitCommon();
    missingtextures.mt08_blockstates_variant_missing.StartupCommon.preInitCommon();
    missingtextures.mt09_block_registered_in_init.StartupCommon.preInitCommon();
    missingtextures.mt10_blockstates_file_bad_json.StartupCommon.preInitCommon();
    missingtextures.mt11_blockmodel_wrong_parent.StartupCommon.preInitCommon();
    missingtextures.mt12_blockmodel_forgot_block.StartupCommon.preInitCommon();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupCommon.preInitCommon();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupCommon.preInitCommon();
    missingtextures.mt15_blockmodel_bad_json.StartupCommon.preInitCommon();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupCommon.preInitCommon();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupCommon.preInitCommon();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupCommon.preInitCommon();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupCommon.preInitCommon();
    missingtextures.mt20_texture_malformed.StartupCommon.preInitCommon();
    missingtextures.mt51_mesher_not_registered.StartupCommon.preInitCommon();
    missingtextures.mt52_missing_modelbakery.StartupCommon.preInitCommon();
    missingtextures.mt53_item_registered_in_init.StartupCommon.preInitCommon();
    missingtextures.mt54_register_mesher_in_preinit.StartupCommon.preInitCommon();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupCommon.preInitCommon();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupCommon.preInitCommon();
    missingtextures.mt57_mesher_forgot_inventory.StartupCommon.preInitCommon();
    missingtextures.mt58_mesher_model_filename_wrong.StartupCommon.preInitCommon();
    missingtextures.mt59_mesher_metadata_wrong.StartupCommon.preInitCommon();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupCommon.preInitCommon();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupCommon.preInitCommon();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupCommon.preInitCommon();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupCommon.preInitCommon();
    missingtextures.mt64_itemmodel_filename_wrong.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();

  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
    missingtextures.mt02_blockstates_filename_mismatch.StartupCommon.initCommon();
    missingtextures.mt03_blockstates_wrong_domain.StartupCommon.initCommon();
    missingtextures.mt04_blockstates_forgot_domain.StartupCommon.initCommon();
    missingtextures.mt05_blockstates_variant_mismatch.StartupCommon.initCommon();
    missingtextures.mt06_blockstates_model_filename_wrong.StartupCommon.initCommon();

    missingtextures.mt07_blockstates_normal_missing.StartupCommon.initCommon();
    missingtextures.mt08_blockstates_variant_missing.StartupCommon.initCommon();
    missingtextures.mt09_block_registered_in_init.StartupCommon.initCommon();
    missingtextures.mt10_blockstates_file_bad_json.StartupCommon.initCommon();
    missingtextures.mt11_blockmodel_wrong_parent.StartupCommon.initCommon();
    missingtextures.mt12_blockmodel_forgot_block.StartupCommon.initCommon();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupCommon.initCommon();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupCommon.initCommon();
    missingtextures.mt15_blockmodel_bad_json.StartupCommon.initCommon();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupCommon.initCommon();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupCommon.initCommon();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupCommon.initCommon();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupCommon.initCommon();
    missingtextures.mt20_texture_malformed.StartupCommon.initCommon();
    missingtextures.mt51_mesher_not_registered.StartupCommon.initCommon();
    missingtextures.mt52_missing_modelbakery.StartupCommon.initCommon();
    missingtextures.mt53_item_registered_in_init.StartupCommon.initCommon();
    missingtextures.mt54_register_mesher_in_preinit.StartupCommon.initCommon();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupCommon.initCommon();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupCommon.initCommon();
    missingtextures.mt57_mesher_forgot_inventory.StartupCommon.initCommon();
    missingtextures.mt58_mesher_model_filename_wrong.StartupCommon.initCommon();
    missingtextures.mt59_mesher_metadata_wrong.StartupCommon.initCommon();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupCommon.initCommon();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupCommon.initCommon();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupCommon.initCommon();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupCommon.initCommon();
    missingtextures.mt64_itemmodel_filename_wrong.StartupCommon.initCommon();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
    missingtextures.mt02_blockstates_filename_mismatch.StartupCommon.postInitCommon();
    missingtextures.mt03_blockstates_wrong_domain.StartupCommon.postInitCommon();
    missingtextures.mt04_blockstates_forgot_domain.StartupCommon.postInitCommon();
    missingtextures.mt05_blockstates_variant_mismatch.StartupCommon.postInitCommon();
    missingtextures.mt06_blockstates_model_filename_wrong.StartupCommon.postInitCommon();

    missingtextures.mt07_blockstates_normal_missing.StartupCommon.postInitCommon();
    missingtextures.mt08_blockstates_variant_missing.StartupCommon.postInitCommon();
    missingtextures.mt09_block_registered_in_init.StartupCommon.postInitCommon();
    missingtextures.mt10_blockstates_file_bad_json.StartupCommon.postInitCommon();
    missingtextures.mt11_blockmodel_wrong_parent.StartupCommon.postInitCommon();
    missingtextures.mt12_blockmodel_forgot_block.StartupCommon.postInitCommon();
    missingtextures.mt13_blockmodel_missing_texture_tag.StartupCommon.postInitCommon();
    missingtextures.mt14_blockmodel_missing_parent_tag.StartupCommon.postInitCommon();
    missingtextures.mt15_blockmodel_bad_json.StartupCommon.postInitCommon();
    missingtextures.mt16_blockmodel_texture_forgotten.StartupCommon.postInitCommon();
    missingtextures.mt17_blockmodel_texture_filename_wrong.StartupCommon.postInitCommon();
    missingtextures.mt18_blockmodel_texture_domain_wrong.StartupCommon.postInitCommon();
    missingtextures.mt19_blockmodel_texture_domain_forgotten.StartupCommon.postInitCommon();
    missingtextures.mt20_texture_malformed.StartupCommon.postInitCommon();
    missingtextures.mt51_mesher_not_registered.StartupCommon.postInitCommon();
    missingtextures.mt52_missing_modelbakery.StartupCommon.postInitCommon();
    missingtextures.mt53_item_registered_in_init.StartupCommon.postInitCommon();
    missingtextures.mt54_register_mesher_in_preinit.StartupCommon.postInitCommon();
    missingtextures.mt55_mesher_mrl_forgot_domain.StartupCommon.postInitCommon();
    missingtextures.mt56_mesher_mrl_domain_wrong.StartupCommon.postInitCommon();
    missingtextures.mt57_mesher_forgot_inventory.StartupCommon.postInitCommon();
    missingtextures.mt58_mesher_model_filename_wrong.StartupCommon.postInitCommon();
    missingtextures.mt59_mesher_metadata_wrong.StartupCommon.postInitCommon();
    missingtextures.mt60_itemmodel_missing_parent_tag.StartupCommon.postInitCommon();
    missingtextures.mt61_itemmodel_parent_filename_wrong.StartupCommon.postInitCommon();
    missingtextures.mt62_itemmode_parent_domain_wrong.StartupCommon.postInitCommon();
    missingtextures.mt63_itemmodel_parent_domain_missing.StartupCommon.postInitCommon();
    missingtextures.mt64_itemmodel_filename_wrong.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();

  }

  // helper to determine whether the given player is in creative mode
  //  not necessary for most examples
  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

}
