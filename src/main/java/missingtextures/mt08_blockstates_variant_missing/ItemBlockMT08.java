package missingtextures.mt08_blockstates_variant_missing;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * User: The Grey Ghost
 */
public class ItemBlockMT08 extends ItemBlock
{
  // you must use Block in the constructor, not BlockVariants, otherwise you won't be able to register the block properly.
  //   i.e. using GameRegistry.registerBlock(block, ItemBlockVariants.class, name)
  public ItemBlockMT08(Block block)
  {
    super(block);
    this.setMaxDamage(0);
    this.setHasSubtypes(true);
  }

  @Override
  public int getMetadata(int metadata)
  {
    return metadata;
  }
}
