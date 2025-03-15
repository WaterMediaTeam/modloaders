package net.fabricmc.loader.api;

import net.fabricmc.api.EnvType;

import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


public interface FabricLoader {
    static FabricLoader getInstance() {
        throw new RuntimeException("Stub!");
    }

    <T> List<T> getEntrypoints(String var1, Class<T> var2);

    <T> void invokeEntrypoints(String var1, Class<T> var2, Consumer<? super T> var3);

    Optional<ModContainer> getModContainer(String var1);

    Collection<ModContainer> getAllMods();

    boolean isModLoaded(String var1);

    boolean isDevelopmentEnvironment();

    EnvType getEnvironmentType();

    /** @deprecated */
    @Deprecated
    Object getGameInstance();

    Path getGameDir();

    /** @deprecated */
    @Deprecated
    File getGameDirectory();

    Path getConfigDir();

    /** @deprecated */
    @Deprecated
    File getConfigDirectory();

    String[] getLaunchArguments(boolean var1);
}