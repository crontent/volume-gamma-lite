package mod.crontent;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.EntityTypePredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class GammaEventListeners {

    public static void initialize() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            HolderGetter<EntityType<?>> registryEntryLookup = registries.lookupOrThrow(Registries.ENTITY_TYPE);

            if (source.isBuiltin()) {
                if (ResourceLocation.withDefaultNamespace("entities/pillager").equals(key.location())) {
                    LootPool.Builder pool = LootPool.lootPool()
                            .with(TagEntry.expandTag(GammaItemTags.PILLAGER_DROP_MUSIC_DISCS).build())
                            .conditionally(
                                    LootItemEntityPropertyCondition.hasProperties(
                                            LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().entityType(EntityTypePredicate.of(EntityType.WITCH))
                                    ).build()
                            );
                    tableBuilder.pool(pool.build());
                }
                if (ResourceLocation.withDefaultNamespace( "entities/zombie_villager").equals(key.location())) {
                    System.out.println("Inserting to Zombei villager");
                    LootPool.Builder pool = LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1.0F))
                            .with(TagEntry.expandTag(GammaItemTags.ZOMBIE_VILLAGER_DROP_MUSIC_DISCS).build())
                            .conditionally(LootItemRandomChanceCondition.randomChance(.33f).build())
                            .conditionally(
                                    LootItemEntityPropertyCondition.hasProperties(
                                            LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().entityType(EntityTypePredicate.of(EntityType.IRON_GOLEM))
                                    ).build()
                            );
                    tableBuilder.pool(pool.build());
                }
                if (ResourceLocation.withDefaultNamespace("chests/simple_dungeon").equals(key.location())) {
//                    tableBuilder.modifyPools(builder -> {
//                        LootPool pool = builder.build();
//                        for (LootPoolEntry entry : pool.entries) {
//                            System.out.println(((ItemEntryAccessor) entry).getItem().getIdAsString());
//                            System.out.println(((ItemEntryAccessor) entry).getItem().isIn(ConventionalItemTags.MUSIC_DISCS));
//                            if (entry instanceof ItemEntryAccessor itemEntry && itemEntry.getItem().isIn(ConventionalItemTags.MUSIC_DISCS)){
//                                System.out.println("We are inserting");
//                                builder.with(TagEntry.expandBuilder(GammaItemTags.ZOMBIE_VILLAGER_DROP_MUSIC_DISCS));
//                                break;
//                            }
//                        }
//                    });
                    LootPool.Builder pool = LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1.0F))
                            .with(TagEntry.expandTag(GammaItemTags.LOOT_CHEST_MUSIC_DISCS).build())
                            .conditionally(LootItemRandomChanceCondition.randomChance(.02f).build());
                    tableBuilder.pool(pool.build());
                }
                
                if (key.location().getPath().contains("chests/village/village_")) {
                    //TODO: Does this actually work?
                    LootPool.Builder pool = LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1.0F))
                            .with(TagEntry.expandTag(GammaItemTags.VILLAGE_CHEST_MUSIC_DISCS).setWeight(10).build())
                            .with(TagEntry.expandTag(GammaItemTags.RARE_VILLAGE_CHEST_MUSIC_DISCS).setWeight(1).build())
                            .conditionally(LootItemRandomChanceCondition.randomChance(.01f).build());
                    tableBuilder.pool(pool.build());
                }
            }

        });

    }
}
