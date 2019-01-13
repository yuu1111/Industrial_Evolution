package yuu.industrial_evolution;

import cofh.core.gui.GuiHandler;
import cofh.core.util.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yuu.industrial_evolution.Proxy.Proxy;
import yuu.industrial_evolution.init.IEitems;

@Mod(
        modid = Industrial_evolution.MOD_ID,
        name = Industrial_evolution.MOD_NAME,
        version = Industrial_evolution.VERSION
)
public class Industrial_evolution {

    public static final String MOD_ID = "industrial_evolution";
    public static final String MOD_NAME = "Industrial_Evolution";
    public static final String VERSION = "1.0.0";

    // public static final Item copper_ingot = new Item1();


    @Mod.Instance(MOD_ID)
    public static Industrial_evolution INSTANCE;


    @SidedProxy(clientSide = "yuu.industrial_evolution.Proxy.ProxyClient", serverSide = "yuu.industrial_evolution.Proxy.Proxy")
    public static Proxy proxy;


    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        IEitems.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }


    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        //    event.getRegistry().register(copper_ingot);
    }


    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        //    ModelLoader.setCustomModelResourceLocation(copper_ingot, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "copper_ingot"), "inventory"));
    }
}

