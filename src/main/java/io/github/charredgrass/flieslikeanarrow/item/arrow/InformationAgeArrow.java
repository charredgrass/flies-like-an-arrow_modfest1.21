package io.github.charredgrass.flieslikeanarrow.item.arrow;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class InformationAgeArrow extends ArrowItem {
    public InformationAgeArrow(Item.Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents,
                                TooltipFlag tooltipFlag) {
        tooltipComponents.add(
                Component.translatable("tooltip.flieslikeanarrow.information_age_arrow.tooltip")
                        .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
