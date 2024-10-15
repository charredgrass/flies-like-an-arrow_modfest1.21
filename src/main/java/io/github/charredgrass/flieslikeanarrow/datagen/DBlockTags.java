package io.github.charredgrass.flieslikeanarrow.datagen;

import io.github.charredgrass.flieslikeanarrow.FliesLikeAnArrow;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DBlockTags extends BlockTagsProvider {
    public DBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                      @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FliesLikeAnArrow.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }

}
