package io.github.charredgrass.flieslikeanarrow.datagen;

import io.github.charredgrass.flieslikeanarrow.FliesLikeAnArrow;
import io.github.charredgrass.flieslikeanarrow.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class DLanguageProvider extends LanguageProvider {
    public DLanguageProvider(PackOutput output, String locale) {
        super(output, FliesLikeAnArrow.MODID, locale);
    }

    @Override
    protected void addTranslations() {
//        add(Registration.STONE_AGE_ARROW.get(), "Stone Age Arrow");

    }
}
