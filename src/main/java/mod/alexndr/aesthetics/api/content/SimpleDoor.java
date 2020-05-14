package mod.alexndr.aesthetics.api.content;

import net.minecraft.block.DoorBlock;

/**
 * This class only exists because some idiot made the constructor of DoorBlock *protected*.
 * @author Sinhika
 *
 */
public class SimpleDoor extends DoorBlock
{

    public SimpleDoor(Properties builder)
    {
        super(builder);
    }

} // end-class
