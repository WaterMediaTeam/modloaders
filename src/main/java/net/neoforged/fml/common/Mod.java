package net.neoforged.fml.common;

import net.neoforged.api.distmarker.Dist;

public @interface Mod {
    /**
     * The unique mod identifier for this mod.
     * <b>Required to be lowercased in the english locale for compatibility. Will be truncated to 64 characters long.</b>
     * <p>
     * This will be used to identify your mod for third parties (other mods), it will be used to identify your mod for registries such as block and item registries.
     * By default, you will have a resource domain that matches the modid. All these uses require that constraints are imposed on the format of the modid.
     */
    String value();

    /**
     * {@return the side to load this mod entrypoint on}
     */
    Dist[] dist() default { Dist.CLIENT, Dist.DEDICATED_SERVER };
}
