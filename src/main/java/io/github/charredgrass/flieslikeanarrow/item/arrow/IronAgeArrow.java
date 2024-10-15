package io.github.charredgrass.flieslikeanarrow.item.arrow;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.*;

import java.util.List;

public class IronAgeArrow extends ArrowItem {
    public IronAgeArrow(Item.Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents,
                                TooltipFlag tooltipFlag) {
        tooltipComponents.add(
                Component.translatable("tooltip.flieslikeanarrow.iron_age_arrow.tooltip")
                        .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
