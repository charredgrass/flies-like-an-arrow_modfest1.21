package io.github.charredgrass.flieslikeanarrow;

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

    public static final DeferredItem<Item> STONE_AGE_ARROW = ITEMS.registerSimpleItem("stone_age_arrow");
    public static final DeferredItem<Item> IRON_AGE_ARROW = ITEMS.registerSimpleItem("iron_age_arrow");
    public static final DeferredItem<Item> INDUSTRIAL_AGE_ARROW = ITEMS.registerSimpleItem("industrial_age_arrow");
    public static final DeferredItem<Item> INFORMATION_AGE_ARROW = ITEMS.registerSimpleItem("information_age_arrow");

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FliesLikeAnArrow.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.flieslikeanarrow")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> STONE_AGE_ARROW.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(STONE_AGE_ARROW.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
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
