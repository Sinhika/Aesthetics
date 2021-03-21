package mod.alexndr.aesthetics.api.content;

import net.minecraft.block.PaneBlock;

import net.minecraft.block.AbstractBlock.Properties;

/**
 * This class only exists because some idiot made the constructor of PaneBlock *protected*.
 * @author Sinhika
 *
 */
@Deprecated
public class SimpleBars extends PaneBlock
{

    public SimpleBars(Properties builder)
    {
        super(builder);
    }

} // end class
