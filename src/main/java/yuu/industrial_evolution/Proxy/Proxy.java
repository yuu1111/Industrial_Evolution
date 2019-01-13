package yuu.industrial_evolution.Proxy;

import cofh.core.proxy.EventHandler;
import cofh.core.render.IModelRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Proxy {

    /* INIT */
    public void preInit(FMLPreInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(EventHandler.INSTANCE);

        registerEntities();
    }

    public void initialize(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    /* REGISTRATION */
    public void registerEntities() {

    }

    /* HELPERS */
    public boolean addIModelRegister(IModelRegister modelRegister) {

        return false;
    }

}