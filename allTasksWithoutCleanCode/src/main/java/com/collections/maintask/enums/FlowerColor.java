package com.collections.maintask.enums;

public enum FlowerColor {
    RED("Красный"), BLUE("Голубой"), YELLOW("Желтый"), WHITE("Белый"),
    GREEN("Зеленый"), PINK("Розовый");
    private String nameColor;

    FlowerColor(String nameColor) {
        this.nameColor=nameColor;
    }

    public String getNameColor() {
        return nameColor;
    }

}
