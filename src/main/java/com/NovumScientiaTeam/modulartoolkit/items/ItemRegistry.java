package com.NovumScientiaTeam.modulartoolkit.items;

import com.NovumScientiaTeam.modulartoolkit.items.misc.ModularShield;
import com.NovumScientiaTeam.modulartoolkit.items.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {
    public static final List<Item> TOOLS = new ArrayList<>();

    public static Item AXE;
    public static Item HOE;
    public static Item PAXEL;
    public static Item PICKAXE;
    public static Item SHOVEL;
    public static Item SWORD;
    public static Item WRENCH;
    public static Item SHIELD;
    public static Item BROADAXE;
    public static Item EXCAVATOR;
    public static Item HAMMER;

    public static void registry(RegistryEvent.Register<Item> e) {
        AXE = register(new ModularAxe(), e);
        HOE = register(new ModularHoe(), e);
        PAXEL = register(new ModularPaxel(), e);
        PICKAXE = register(new ModularPickaxe(), e);
        SHOVEL = register(new ModularShovel(), e);
        SWORD = register(new ModularSword(), e);
        WRENCH = register(new ModularWrench(), e);
        SHIELD = register(new ModularShield(), e);
        BROADAXE = register(new ModularBroadaxe(), e);
        EXCAVATOR = register(new ModularExcavator(), e);
        HAMMER = register(new ModularHammer(), e);
    }

    private static Item register(Item i, RegistryEvent.Register<Item> e) {
        e.getRegistry().register(i);
        TOOLS.add(i);
        return i;
    }
}