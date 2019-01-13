package yuu.industrial_evolution.Item;

import cofh.core.item.ItemMulti;
import cofh.core.util.core.IInitializer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yuu.industrial_evolution.Industrial_evolution;

import static yuu.industrial_evolution.Industrial_evolution.MOD_ID;
import static yuu.industrial_evolution.Industrial_evolution.MOD_NAME;

public class ItemIngot extends ItemMulti implements IInitializer {

    public ItemIngot() {

        super(MOD_ID);
        setUnlocalizedName("ingot");
        //   setCreativeTab(ThermalFoundation.tabItems);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    @Override
    public boolean preInit() {
        ForgeRegistries.ITEMS.register(setRegistryName("ingot"));
        Industrial_evolution.proxy.addIModelRegister(this);
        copper_ingot = addOreDictItem(0, "ingotCopper");
        return true;
    }

    @Override
    public boolean initialize() {
        return true;
    }

    public static ItemStack copper_ingot;
}
