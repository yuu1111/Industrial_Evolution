package yuu.industrial_evolution.Proxy;

import cofh.core.proxy.EventHandlerClient;
import cofh.core.render.IModelRegister;
import cofh.core.render.entity.RenderEntityAsIcon;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

public class ProxyClient extends Proxy {

    /* INIT */
    @Override
    public void preInit(FMLPreInitializationEvent event) {

        super.preInit(event);

        MinecraftForge.EVENT_BUS.register(EventHandlerClient.INSTANCE);

        for (IModelRegister register : modelList) {
            register.registerModels();
        }
        registerRenderInformation();
    }

    @Override
    public void initialize(FMLInitializationEvent event) {

        super.initialize(event);

   //     Minecraft.getMinecraft().getItemColors().registerItemColorHandler(TFItems.itemDye::colorMultiplier, TFItems.itemDye);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

        super.postInit(event);
    }

    /* REGISTRATION */
    public void registerRenderInformation() {

    }

    /* HELPERS */
    public boolean addIModelRegister(IModelRegister modelRegister) {

        return modelList.add(modelRegister);
    }

    private static ArrayList<IModelRegister> modelList = new ArrayList<>();
}
