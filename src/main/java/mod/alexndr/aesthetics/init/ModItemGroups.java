package mod.alexndr.aesthetics.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import mod.alexndr.aesthetics.Aesthetics;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class ModItemGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = 
            new ModItemGroup(Aesthetics.MODID, () -> new ItemStack(ModBlocks.iron_bricks.get()));
    
    public static final class ModItemGroup extends ItemGroup
    {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return iconSupplier.get();
        }
    } // end ModTabGroup()
} // end class
