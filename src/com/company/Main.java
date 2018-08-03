package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameObjectsCreator objectsCreator = new GameObjectsCreator();
        List<GameObjects> goldCoins = new ArrayList<>();
        List<GameObjects> silverCoins = new ArrayList<>();

        goldCoins.add(objectsCreator.create(GameObjectItems.GOLD_COIN));
        goldCoins.add(objectsCreator.create(GameObjectItems.GOLD_COIN));

        silverCoins.add(objectsCreator.create(GameObjectItems.SILVER_COIN));
        silverCoins.add(objectsCreator.create(GameObjectItems.SILVER_COIN));
        silverCoins.add(objectsCreator.create(GameObjectItems.SILVER_COIN));


    }
}
