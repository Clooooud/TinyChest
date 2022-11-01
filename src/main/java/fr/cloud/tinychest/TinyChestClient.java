package fr.cloud.tinychest;

import fr.cloud.tinychest.gui.TinyChestScreen;
import fr.cloud.tinychest.screenhandlers.ScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class TinyChestClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ScreenHandlers.TINY_CHEST_SCREEN_HANDLER, TinyChestScreen::new);
    }
}
