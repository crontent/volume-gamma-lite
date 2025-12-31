package mod.crontent;


import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

public class GammaSounds {
    private GammaSounds() { /*left empty on purpose*/ }

    //MUSIC DISCS
    public static final SoundEvent MUSIC_WUOP = register("music_disc.wuop");
    public static final SoundEvent MUSIC_FLY = register("music_disc.fly");
    public static final SoundEvent MUSIC_HARVEST = register("music_disc.harvest");
    public static final SoundEvent MUSIC_MELANC = register("music_disc.melanc");
    public static final SoundEvent MUSIC_LOOFAH = register("music_disc.loofah");
    public static final SoundEvent MUSIC_KENA = register("music_disc.kena");
    public static final SoundEvent MUSIC_BLUUPY = register("music_disc.bluupy");

    //JUKEBOX KEYS
    public static final ResourceKey<JukeboxSong> WUOP =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.wuop"));
    public static final ResourceKey<JukeboxSong> FLY =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.fly"));
    public static final ResourceKey<JukeboxSong> HARVEST =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.harvest"));
    public static final ResourceKey<JukeboxSong> MELANC =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.melanc"));
    public static final ResourceKey<JukeboxSong> LOOFAH =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.loofah"));
    public static final ResourceKey<JukeboxSong> KENA =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.kena"));
    public static final ResourceKey<JukeboxSong> BLUUPY =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("volume-gamma","music_disc.bluupy"));



    public static void initialize(){

    }

    private static SoundEvent register(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath("volume-gamma", name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

}
