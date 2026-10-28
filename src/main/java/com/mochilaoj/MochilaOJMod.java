package com.mochilaoj;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MochilaOJMod implements ModInitializer {
    public static final String MOD_ID = "mochilaoj";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("¡Mochila OJ cargada!");
    }
}
