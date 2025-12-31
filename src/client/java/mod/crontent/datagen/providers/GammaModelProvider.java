package mod.crontent.datagen.providers;

import mod.crontent.GammaRecordItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class GammaModelProvider extends FabricModelProvider {
    public GammaModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_WUOP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_FLY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_HARVEST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_MELANC, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_LOOFAH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_KENA, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(GammaRecordItems.MUSIC_DISC_BLUUPY, ModelTemplates.FLAT_ITEM);
    }
}
