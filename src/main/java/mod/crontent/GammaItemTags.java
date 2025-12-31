package mod.crontent;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class GammaItemTags {

    private GammaItemTags() { /*left empty on purpose*/ }

    public static final TagKey<Item> PILLAGER_DROP_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", "pillager_drop_music_discs"));
    public static final TagKey<Item> ZOMBIE_VILLAGER_DROP_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", "zombie_villager_drop_music_discs"));
    public static final TagKey<Item> VILLAGE_CHEST_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", "village_chest_music_discs"));
    public static final TagKey<Item> RARE_VILLAGE_CHEST_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", "rare_village_chest_music_discs"));
    public static final TagKey<Item> LOOT_CHEST_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("volume-gamma", "loot_chest_music_discs"));

    public static void initialize(){

    }
}
