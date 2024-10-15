package io.github.charredgrass.flieslikeanarrow;

import io.github.charredgrass.flieslikeanarrow.item.arrow.IndustrialAgeArrow;
import io.github.charredgrass.flieslikeanarrow.item.arrow.InformationAgeArrow;
import io.github.charredgrass.flieslikeanarrow.item.arrow.IronAgeArrow;
import io.github.charredgrass.flieslikeanarrow.item.arrow.StoneAgeArrow;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Registration {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FliesLikeAnArrow.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FliesLikeAnArrow.MODID);

//    public static final DeferredItem<Item> STONE_AGE_ARROW = ITEMS.registerSimpleItem("stone_age_arrow");
    public static final DeferredItem<Item> STONE_AGE_ARROW = ITEMS.register("stone_age_arrow",
        () -> new StoneAgeArrow(new Item.Properties()));
    public static final DeferredItem<Item> IRON_AGE_ARROW = ITEMS.register("iron_age_arrow",
            () -> new IronAgeArrow(new Item.Properties()));
    public static final DeferredItem<Item> INDUSTRIAL_AGE_ARROW = ITEMS.register("industrial_age_arrow",
            () -> new IndustrialAgeArrow(new Item.Properties()));
    public static final DeferredItem<Item> INFORMATION_AGE_ARROW = ITEMS.register("information_age_arrow",
            () -> new InformationAgeArrow(new Item.Properties()));

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FliesLikeAnArrow.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.flieslikeanarrow")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> STONE_AGE_ARROW.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(STONE_AGE_ARROW.get()); //For your own tabs, this method is preferred over the event
                output.accept(IRON_AGE_ARROW.get());
                output.accept(INDUSTRIAL_AGE_ARROW.get());
                output.accept(INFORMATION_AGE_ARROW.get());
            }).build());

    public static void init(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        //register block entities here if ever added

        CREATIVE_MODE_TABS.register(modEventBus);
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
//            event.accept(STONE_AGE_ARROW);

        }

    }
}
