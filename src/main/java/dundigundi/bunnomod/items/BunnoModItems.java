package dundigundi.bunnomod.items;


import dundigundi.bunnomod.BunnoMod;
import dundigundi.bunnomod.BunnoModConfig;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemFoodStackable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;


public class BunnoModItems {
	public static final String MOD_ID = BunnoMod.MOD_ID;
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private int nextItemID(String itemName) {
		return BunnoModConfig.cfg.getInt("Item IDs." + itemName);
	}

	//Coal
	public static Item brownCoal;
	//Food
	public static Item cheeseSlice;

	public void initializeItems() {

		brownCoal = ItemHelper.createItem(MOD_ID, new Item(nextItemID("brownCoal")), "brownCoal", "brownCoal.png");
		cheeseSlice = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("cheeseSlice",nextItemID("cheeseSlice"), 1, false, 4), "cheeseSlice", "cheeseSlice.png");
	}
}
