package mod.alexndr.aesthetics.api.content;

import net.minecraft.block.DoorBlock;

import net.minecraft.block.AbstractBlock.Properties;

/**
 * This class only exists because some idiot made the constructor of DoorBlock *protected*.
 * @author Sinhika
 *
 */
@Deprecated
public class SimpleDoor extends DoorBlock
{

    public SimpleDoor(Properties builder)
    {
        super(builder);
    }

} // end-class
