package missingtextures.mt52_missing_modelbakery;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;
import java.util.List;

/**
 * User: The Grey Ghost
 * Date: 30/12/2014
 *
 */
public class ItemMT52 extends Item
{
  public ItemMT52() {
    this.setMaxDamage(0);
    this.setHasSubtypes(true);
    this.setMaxStackSize(1);
    this.setCreativeTab(CreativeTabs.tabMisc);   // items will appear on the Miscellaneous creative tab
  }

  @Override
  public int getMetadata(int damage) {
    return damage;
  }

  // add a subitem for each item we want to appear in the creative tab
  //  in this case - a full bottle of each colour
  @SideOnly(Side.CLIENT)
  public void getSubItems(Item itemIn, CreativeTabs tab, List subItems)
  {
    ItemStack subItemStack = new ItemStack(itemIn, 1, 1);
    subItems.add(subItemStack);
    subItemStack = new ItemStack(itemIn, 1, 2);
    subItems.add(subItemStack);
  }

  @Override
  // Make a unique name for each contents type (lime, orange, etc) so we can name them individually
  //  The fullness information is added separately in getItemStackDisplayName()
  public String getUnlocalizedName(ItemStack stack)
  {
    int metadata = stack.getMetadata();
    return super.getUnlocalizedName() + "." + metadata;
  }
}