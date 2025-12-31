package mod.crontent;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.Rarity;

public class GammaRecordItems {


    private GammaRecordItems() { /*left empty on purpose*/ }

    public static final Item MUSIC_DISC_WUOP =
            registerRecord("music_disc_wuop", new Item.Properties().rarity(Rarity.RARE), GammaSounds.WUOP);
    public static final Item MUSIC_DISC_FLY =
            registerRecord("music_disc_fly", new Item.Properties().rarity(Rarity.RARE), GammaSounds.FLY);
    public static final Item MUSIC_DISC_HARVEST =
            registerRecord("music_disc_harvest", new Item.Properties().rarity(Rarity.RARE), GammaSounds.HARVEST);
    public static final Item MUSIC_DISC_MELANC =
            registerRecord("music_disc_melanc", new Item.Properties().rarity(Rarity.RARE), GammaSounds.MELANC);
    public static final Item MUSIC_DISC_LOOFAH =
            registerRecord("music_disc_loofah", new Item.Properties().rarity(Rarity.RARE), GammaSounds.LOOFAH);
    public static final Item MUSIC_DISC_KENA =
            registerRecord("music_disc_kena", new Item.Properties().rarity(Rarity.RARE), GammaSounds.KENA);
    public static final Item MUSIC_DISC_BLUUPY =
            registerRecord("music_disc_bluupy", new Item.Properties().rarity(Rarity.RARE), GammaSounds.BLUUPY);

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_WUOP));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_FLY));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_HARVEST));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_MELANC));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_LOOFAH));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_KENA));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((ig) -> ig.accept(MUSIC_DISC_BLUUPY));
    }

    public static Item registerRecord(String id, Item.Properties settings, ResourceKey<JukeboxSong> jukeboxKey){
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", id),
                new Item(settings
                        .jukeboxPlayable(jukeboxKey)
                        .stacksTo(1)));
    }
}
