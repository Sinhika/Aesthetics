package mod.alexndr.aesthetics.api.content;

import net.minecraft.block.PaneBlock;

/**
 * This class only exists because some idiot made the constructor of PaneBlock *protected*.
 * @author Sinhika
 *
 */public class SimpleBars extends PaneBlock
{

    public SimpleBars(Properties builder)
    {
        super(builder);
    }

} // end class
