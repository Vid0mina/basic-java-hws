package ru.ushakova.java.basic.hws.enumerated;

public enum Terrain {

    DENSE_FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private String displayName;

    Terrain(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}