package io.github.charredgrass.flieslikeanarrow.datagen;

import io.github.charredgrass.flieslikeanarrow.FliesLikeAnArrow;
import io.github.charredgrass.flieslikeanarrow.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DItemModels extends ItemModelProvider {
    public DItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FliesLikeAnArrow.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        withExistingParent(Registration.STONE_AGE_ARROW.getId().getPath(), modLoc("item/stone_age_arrow"));
        basicItem(Registration.STONE_AGE_ARROW.get());
    }
}
