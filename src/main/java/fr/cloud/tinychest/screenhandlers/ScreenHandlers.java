package fr.cloud.tinychest.screenhandlers;

import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ScreenHandlers {

    public static ScreenHandlerType<TinyChestScreenHandler> TINY_CHEST_SCREEN_HANDLER;

    public static void initialize() {
        TINY_CHEST_SCREEN_HANDLER = Registry.register(Registry.SCREEN_HANDLER, new Identifier("tinychest:tinychest_sh"), new ScreenHandlerType<>(TinyChestScreenHandler::new));
    }
}
