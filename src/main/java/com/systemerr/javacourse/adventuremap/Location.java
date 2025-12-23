package com.systemerr.javacourse.adventuremap;

import java.util.Map;

public record Location(String description, Map<String, String> nextPlaces) {

}
