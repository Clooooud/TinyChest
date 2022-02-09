package fr.cloud.tinychest;

import fr.cloud.tinychest.gui.TinyChestScreen;
import fr.cloud.tinychest.screenhandlers.ScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class TinyChestClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ScreenHandlers.TINY_CHEST_SCREEN_HANDLER, TinyChestScreen::new);
    }
}
