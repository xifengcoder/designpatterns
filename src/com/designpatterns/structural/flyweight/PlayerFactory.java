package com.designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * Created by Han on 2020/2/7
 */
public class PlayerFactory {

    private static HashMap<String, Player> hashMap = new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;

        if (hashMap.containsKey(type)) {

            p = hashMap.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist("Terrorist");
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist("CounterTerrorist");
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            hashMap.put(type, p);
        }

        return p;
    }


}
