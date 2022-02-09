package fr.cloud.tinychest.screenhandlers;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ScreenHandlers {

    public static ScreenHandlerType<TinyChestScreenHandler> TINY_CHEST_SCREEN_HANDLER;

    public static void initialize() {
        TINY_CHEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier("tinychest:tinychest_sh"), TinyChestScreenHandler::new);
    }
}
