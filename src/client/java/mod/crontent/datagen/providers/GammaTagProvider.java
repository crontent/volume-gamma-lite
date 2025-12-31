package mod.crontent.datagen.providers;

import mod.crontent.GammaItemTags;
import mod.crontent.GammaRecordItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GammaTagProvider extends FabricTagProvider.ItemTagProvider {

    public GammaTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_FLY)
                .add(GammaRecordItems.MUSIC_DISC_BLUUPY);

        getOrCreateTagBuilder(GammaItemTags.PILLAGER_DROP_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_HARVEST);

        getOrCreateTagBuilder(GammaItemTags.ZOMBIE_VILLAGER_DROP_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_LOOFAH);

        getOrCreateTagBuilder(GammaItemTags.LOOT_CHEST_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_WUOP)
                .add(GammaRecordItems.MUSIC_DISC_FLY)
                .add(GammaRecordItems.MUSIC_DISC_BLUUPY);

        getOrCreateTagBuilder(GammaItemTags.VILLAGE_CHEST_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_MELANC)
                .add(GammaRecordItems.MUSIC_DISC_LOOFAH)
                .add(GammaRecordItems.MUSIC_DISC_KENA);


        getOrCreateTagBuilder(GammaItemTags.RARE_VILLAGE_CHEST_MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_HARVEST);



        getOrCreateTagBuilder(ConventionalItemTags.MUSIC_DISCS)
                .add(GammaRecordItems.MUSIC_DISC_WUOP)
                .add(GammaRecordItems.MUSIC_DISC_FLY)
                .add(GammaRecordItems.MUSIC_DISC_HARVEST)
                .add(GammaRecordItems.MUSIC_DISC_MELANC)
                .add(GammaRecordItems.MUSIC_DISC_LOOFAH)
                .add(GammaRecordItems.MUSIC_DISC_KENA)
                .add(GammaRecordItems.MUSIC_DISC_BLUUPY);
    }

}