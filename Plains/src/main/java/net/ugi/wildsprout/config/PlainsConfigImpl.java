package net.ugi.wildsprout.config;

import net.ugi.wildsprout.WildSproutPlains;
import net.ugi.wildsprout_core.api.PlainsConfigProvider;

public class PlainsConfigImpl implements PlainsConfigProvider {

    public boolean PlainsEnabled() {
        return WildSproutPlains.CONFIG.PlainsEnabled;
    }
    public boolean sunFlowerPlainsEnabled() {
        return WildSproutPlains.CONFIG.SunFlowerPlainsEnabled;
    }
    public boolean SnowyPlainsEnabled() {
        return WildSproutPlains.CONFIG.SnowyPlainsEnabled;
    }
    public boolean SnowOnIceEnabled() {
        return WildSproutPlains.CONFIG.SnowOnIceEnabled;
    }
    public boolean LayeredSnowEnabled() {
        return WildSproutPlains.CONFIG.LayeredSnowEnabled;
    }
}
