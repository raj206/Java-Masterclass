package com.company;

import java.util.*;

public class Main {
//    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
//
//        // Maps - Intro
//        Map<String, String> langs = new HashMap<>();
//
//        langs.put("English", "Worldwide");
//        langs.put("Hebrew", "Mostly Israel");
//        langs.put("Spanish", "Famous");
//
//        System.out.println(langs);
//
//        if(langs.containsKey("English")){
//            System.out.println("This key already has a value of: " + langs.get("English"));
//        } else {
//            langs.put("English", "Most famous.");
//        }
//
//        langs.remove("Spanish");
//
//        System.out.println(langs.containsValue("Worldwide"));
//        System.out.println(langs.get("English"));
//
//        System.out.println(langs);
//
//        // Maps - Adventure Game
//        Scanner scanner = new Scanner(System.in);
//
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
//        locations.put(2, new Location(2, "You are at the top of a hill"));
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
//        locations.put(4, new Location(4, "You are in a valley beside a stream"));
//        locations.put(5, new Location(5, "You are in the forest"));
//
//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("E", 3);
//        locations.get(1).addExit("S", 4);
//        locations.get(1).addExit("N", 5);
//
//        locations.get(2).addExit("N", 5);
//
//        locations.get(3).addExit("W", 1);
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//
//        Map<String, String> vocabulary = new HashMap<>();
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");
//
//
//        int loc = 1;
//        while(true) {
//            System.out.println(locations.get(loc).getDescription());
//            if(loc == 0) {
//                break;
//            }
//
//            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.print("Available exits are ");
//            for(String exit: exits.keySet()) {
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//
//            String direction = scanner.nextLine().toUpperCase();
//            if(direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for(String word: words) {
//                    if(vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//
//            if(exits.containsKey(direction)) {
//                loc = exits.get(direction);
//
//            } else {
//                System.out.println("You cannot go in that direction");
//            }
//        }

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }


    }


}
