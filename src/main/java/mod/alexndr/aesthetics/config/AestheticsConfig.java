package mod.alexndr.aesthetics.config;

import java.util.HashMap;
import java.util.Map;

import mod.alexndr.simplecorelib.config.ISimpleConfig;

public class AestheticsConfig implements ISimpleConfig
{
    private static Map<String, Boolean> flags = new HashMap<>();
    public static AestheticsConfig INSTANCE = new AestheticsConfig();
    
    @Override
    public void clear()
    {
        flags.clear();
    }

    @Override
    public boolean getFlag(String n)
    {
        Boolean obj = flags.get(n);
        return obj != null && obj;
    }

    @Override
    public void putFlag(String n, boolean val)
    {
        flags.put(n, val);
    }

} // end class
