package com.systemerr.javacourse.adventuremap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String allLocationsString = """
                road,at the end of the road, W:hill, E:well house,S:valley,N:forest
                hill,on top of hill with a view in all directions,N:forest, E:road
                well house,inside a well house for a small spring,W:road,N:lake,S:stream
                valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
                forest,at the edge of a thick dark forest,S:road,E:lake
                lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
                stream,near a stream with a rocky bed,W:valley, N:well house
                """;

        Map<String, Location> locations = new HashMap<>();
        for (String locationString : allLocationsString.split("\n")) {
            List<String> parts = new ArrayList<>(List.of(locationString.split(",")));
            String name = parts.removeFirst().trim();
            String description = parts.removeFirst().trim();
            Map<String, String> nextPlaces = new HashMap<>();
            parts.forEach(nextPlaceString -> nextPlaces.put(nextPlaceString.trim().split(":")[0], nextPlaceString.trim().split(":")[1]));
            locations.put(name, new Location(description, nextPlaces));
        }

        Map<String, String> directionsMap = new HashMap<>(Map.of("N", "North", "S", "South", "E", "East", "W", "West"));
        Location currentLocation = locations.get("road");
        while (true) {
            String[] options = {""};
            currentLocation.nextPlaces().forEach((directionChar, name) -> options[0] += "    - A " + name + " to the " + directionsMap.get(directionChar) + " (" + directionChar + ")\n");
            System.out.printf("""

                    *** You're standing %s ***
                        From here, you can see:
                    %sSelect Your Compass Direction (Q to quit) >> 
                    """, currentLocation.description(), options[0]);
            Scanner scanner = new Scanner(System.in);
            String response = String.valueOf(scanner.nextLine().charAt(0)).toUpperCase();
            String nextLocationName = currentLocation.nextPlaces().getOrDefault(response, "Q");
            if (nextLocationName.equals("Q")) break;
            currentLocation = locations.get(nextLocationName);
        }
    }
}
