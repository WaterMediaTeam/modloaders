//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.fabricmc.loader.api;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ModContainer {

    List<Path> getRootPaths();

    default Optional<Path> findPath(String file) {
        for(Path root : this.getRootPaths()) {
            Path path = root.resolve(file.replace("/", root.getFileSystem().getSeparator()));
            if (Files.exists(path, new LinkOption[0])) {
                return Optional.of(path);
            }
        }

        return Optional.empty();
    }

    Optional<ModContainer> getContainingMod();

    Collection<ModContainer> getContainedMods();

    /** @deprecated */
    @Deprecated
    default Path getRoot() {
        return this.getRootPath();
    }

    /** @deprecated */
    @Deprecated
    Path getRootPath();

    /** @deprecated */
    @Deprecated
    Path getPath(String var1);
}
