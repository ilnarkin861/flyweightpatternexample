package com.company;

import java.util.HashMap;
import java.util.Map;

public class GameObjectsCreator {

    public static final Map<GameObjectItems, GameObjects> gameObjects = new HashMap<>();

    public GameObjects create(GameObjectItems objectItem){

        GameObjects gameObject = gameObjects.get(objectItem);

        if (gameObject == null){

            switch (objectItem){
                case COIN:
                    gameObject = new GoldCoin(GameObjectItems.COIN);
                    break;
                case KEY:
                    gameObject = new GoldCoin(GameObjectItems.KEY);
                    break;
                case SECRET_BOX:
                    gameObject = new GoldCoin(GameObjectItems.SECRET_BOX);
                    break;
            }

            gameObjects.put(objectItem, gameObject);
        }

        return gameObject;

    }


}
