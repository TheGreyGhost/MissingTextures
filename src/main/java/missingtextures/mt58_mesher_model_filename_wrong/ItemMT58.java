package missingtextures.mt58_mesher_model_filename_wrong;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * User: The Grey Ghost
 * Date: 30/12/2014
 *
 * ItemSimple is an ordinary two-dimensional item
 * For background information on items see here http://greyminecraftcoder.blogspot.com/2013/12/items.html
 *   and here http://greyminecraftcoder.blogspot.com.au/2014/12/item-rendering-18.html
 */
public class ItemMT58 extends Item
{
  public ItemMT58()
  {
    final int MAXIMUM_NUMBER_OF_FROGS = 6;
    this.setMaxStackSize(MAXIMUM_NUMBER_OF_FROGS);
    this.setCreativeTab(CreativeTabs.tabMisc);   // the item will appear on the Miscellaneous tab in creative
  }
}
