package net.neoforged.api.distmarker;

public enum Dist {
    CLIENT,
    DEDICATED_SERVER;

    public boolean isDedicatedServer() {
        throw new UnsupportedOperationException("Stub!");
    }

    public boolean isClient() {
        throw new UnsupportedOperationException("Stub!");
    }
}
