package com.crashbox.throwabletorchmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

/** Copyright 2015 Andrew O. Mellinger */
public class ThrowableTorchModClientProxy extends ThrowableTorchModCommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e)
    {
        super.init(e);

        // Add renderers.

        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
//        RenderingRegistry.registerEntityRenderingHandler(EntityThrowableTorch.class,
//                new RenderSnowball(ThrowableTorchMod.ITEM_THROWABLE_TORCH));

        RenderingRegistry.registerEntityRenderingHandler(EntityThrowableTorch.class,
                new RenderSnowball(renderManager, ThrowableTorchMod.ITEM_THROWABLE_TORCH, renderItem));
    }

    @Override
    public void postInit(FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
