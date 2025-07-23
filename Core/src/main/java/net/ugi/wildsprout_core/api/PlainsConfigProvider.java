package net.ugi.wildsprout_core.api;

public interface PlainsConfigProvider {
    boolean PlainsEnabled();
    boolean sunFlowerPlainsEnabled();
    boolean SnowyPlainsEnabled();

    boolean SnowOnIceEnabled();
    boolean LayeredSnowEnabled();
}
