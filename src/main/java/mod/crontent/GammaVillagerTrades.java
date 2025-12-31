package mod.crontent;


import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;

public class GammaVillagerTrades {

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3,
                factories -> {
                    factories.add((entity, random) -> new MerchantOffer(
                            new ItemCost(Items.EMERALD, 12),
                            new ItemStack(GammaRecordItems.MUSIC_DISC_KENA, 1),
                            1, 25, 0.2f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2,
                factories -> {
                    factories.add((entity, random) -> new MerchantOffer(
                            new ItemCost(Items.EMERALD, 8),
                            new ItemStack(GammaRecordItems.MUSIC_DISC_MELANC, 1),
                            1, 25, 0.2f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(1,
                (items) -> items.add((entity, randomSource) -> (new MerchantOffer(
                        new ItemCost(Items.EMERALD, 18),
                        new ItemStack(GammaRecordItems.MUSIC_DISC_KENA, 1),
                        1, 1, 0.2f))
        ));
        TradeOfferHelper.registerWanderingTraderOffers(1,
                (items) -> items.add((entity, randomSource) -> (new MerchantOffer(
                        new ItemCost(Items.EMERALD, 12),
                        new ItemStack(GammaRecordItems.MUSIC_DISC_MELANC, 1),
                        1, 1, 0.2f))
        ));
    }
}
