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
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.preInitCommon();
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
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.initCommon();
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
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
//    missingtextures.mt01_everything_ok.StartupCommon.postInitCommon();
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
