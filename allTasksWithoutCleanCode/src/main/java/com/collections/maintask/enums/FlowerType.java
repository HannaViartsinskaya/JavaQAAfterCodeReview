package com.collections.maintask.enums;

public enum FlowerType {
    ROSE ("Роза"), LILY("Лилия"), GERBERA("Гербера"),
    TULIPAN("Тюльпан"), SUNFLOWER("Подсолнух");

    private String flowerName;

    FlowerType(String flowerName){
        this.flowerName=flowerName;
    }

    public String getFlowerName() {
        return flowerName;
    }
}
