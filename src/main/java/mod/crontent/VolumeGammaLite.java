package mod.crontent;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VolumeGammaLite implements ModInitializer {
	public static final String MOD_ID = "volume-gamma-lite";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public void onInitialize() {
		GammaSounds.initialize();
		GammaRecordItems.initialize();
		GammaItemTags.initialize();
		GammaVillagerTrades.registerCustomTrades();
		GammaEventListeners.initialize();
	}
}