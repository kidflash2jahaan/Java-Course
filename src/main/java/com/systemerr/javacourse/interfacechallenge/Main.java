package com.systemerr.javacourse.interfacechallenge;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Sydney Town Hall (GOVERNMENT)", "RED STAR");
        UtilityLine utilityLine = new UtilityLine("College St (FIBER_OPTIC)", "GREEN DOTTED");

        building.toJSON(new String[]{"name", "usage"}, new String[]{"Sydney Town Hall", "GOVERNMENT"});
        Mappable.toJSON(utilityLine, new String[]{"name", "utility"}, new String[]{"College St", "FIBER_OPTIC"});
    }
}
