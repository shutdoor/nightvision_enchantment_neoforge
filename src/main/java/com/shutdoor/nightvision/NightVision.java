package com.shutdoor.nightvision;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NightVision.MODID)
public class NightVision
{
    public static final String MODID = "nightvision";

    public NightVision()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EnchantmentReg.ENCHANTMENT.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
