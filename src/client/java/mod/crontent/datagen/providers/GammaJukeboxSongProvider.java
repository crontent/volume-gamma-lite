package mod.crontent.datagen.providers;

import mod.crontent.GammaSounds;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

import java.util.concurrent.CompletableFuture;

public class GammaJukeboxSongProvider extends FabricDynamicRegistryProvider {
    public GammaJukeboxSongProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return "Jukebox Songs";
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        register(entries, GammaSounds.WUOP, GammaSounds.MUSIC_WUOP, 194, 1);
        register(entries, GammaSounds.FLY, GammaSounds.MUSIC_FLY, 173, 1);
        register(entries, GammaSounds.HARVEST, GammaSounds.MUSIC_HARVEST, 165, 1);
        register(entries, GammaSounds.MELANC, GammaSounds.MUSIC_MELANC, 229, 1);
        register(entries, GammaSounds.LOOFAH, GammaSounds.MUSIC_LOOFAH, 81, 1);
        register(entries, GammaSounds.KENA, GammaSounds.MUSIC_KENA, 142, 1);
        register(entries, GammaSounds.BLUUPY, GammaSounds.MUSIC_BLUUPY, 196, 1);
    }

    private void register(
            Entries entries,
            ResourceKey<JukeboxSong> key,
            SoundEvent soundEvent, int lengthInSeconds, int comparatorOutput) {
        System.out.println("this is " + key.location());
        entries.add(key, new JukeboxSong(Holder.direct(soundEvent), Component.translatable(Util.makeDescriptionId("jukebox_song", key.location())), lengthInSeconds, comparatorOutput));
    }

}
