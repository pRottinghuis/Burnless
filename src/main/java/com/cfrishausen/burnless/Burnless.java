package com.cfrishausen.burnless;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Burnless.ID)
public class Burnless {

    public static final String ID = "burnless";

    public Burnless() {
        IEventBus mod = FMLJavaModLoadingContext.get().getModEventBus();

        mod.addGenericListener(Item.class, EventPriority.LOWEST, this::onItemRegistry);
    }

    public void onItemRegistry(RegistryEvent.Register<Item> event) {

        Items.BEDROCK.isFireResistant = true;
        Items.DIAMOND_ORE.isFireResistant = true;
        Items.DEEPSLATE_DIAMOND_ORE.isFireResistant = true;
        Items.EMERALD_ORE.isFireResistant = true;
        Items.DEEPSLATE_EMERALD_ORE.isFireResistant = true;
        Items.DIAMOND_BLOCK.isFireResistant = false;
        Items.ANCIENT_DEBRIS.isFireResistant = false;
        Items.OBSIDIAN.isFireResistant = true;
        Items.EMERALD_BLOCK.isFireResistant = true;
        Items.CRYING_OBSIDIAN.isFireResistant = true;

        Items.DIAMOND.isFireResistant = true;
        Items.EMERALD.isFireResistant = true;
        Items.NETHERITE_INGOT.isFireResistant = true;
        Items.NETHERITE_SCRAP.isFireResistant = true;
        Items.BLAZE_ROD.isFireResistant = true;
        Items.DIAMOND_HORSE_ARMOR.isFireResistant = true;

        Items.DIAMOND_SHOVEL.isFireResistant = true;
        Items.DIAMOND_PICKAXE.isFireResistant = true;
        Items.DIAMOND_AXE.isFireResistant = true;
        Items.DIAMOND_HOE.isFireResistant = true;
        Items.DIAMOND_SWORD.isFireResistant = true;

        Items.NETHERITE_SHOVEL.isFireResistant = true;
        Items.NETHERITE_PICKAXE.isFireResistant = true;
        Items.NETHERITE_AXE.isFireResistant = true;
        Items.NETHERITE_HOE.isFireResistant = true;
        Items.NETHERITE_SWORD.isFireResistant = true;

        Items.DIAMOND_HELMET.isFireResistant = true;
        Items.DIAMOND_CHESTPLATE.isFireResistant = true;
        Items.DIAMOND_LEGGINGS.isFireResistant = true;
        Items.DIAMOND_BOOTS.isFireResistant = true;

        Items.NETHERITE_HELMET.isFireResistant = true;
        Items.NETHERITE_CHESTPLATE.isFireResistant = true;
        Items.NETHERITE_LEGGINGS.isFireResistant = true;
        Items.NETHERITE_BOOTS.isFireResistant = true;

        Items.BLAZE_POWDER.isFireResistant = true;
        Items.MAGMA_CREAM.isFireResistant = true;


    }

}
