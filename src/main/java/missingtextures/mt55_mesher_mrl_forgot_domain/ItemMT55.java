package missingtextures.mt55_mesher_mrl_forgot_domain;

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
public class ItemMT55 extends Item
{
  public ItemMT55()
  {
    final int MAXIMUM_NUMBER_OF_FROGS = 6;
    this.setMaxStackSize(MAXIMUM_NUMBER_OF_FROGS);
    this.setCreativeTab(CreativeTabs.tabMisc);   // the item will appear on the Miscellaneous tab in creative
  }
}
