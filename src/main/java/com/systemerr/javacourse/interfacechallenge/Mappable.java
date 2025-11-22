package com.systemerr.javacourse.interfacechallenge;

public interface Mappable {
    public static final String JSON_PROPERTY = "\"properties\": {\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\"%s}\n";

    public default void toJSON(String[] keys, String[] values) {
        if (keys.length != values.length) {
            System.err.println("Invalid Input");
            return;
        }

        String details = "";
        for (int i = 0; i < keys.length; i++) {
            details += String.format(", \"%s\": \"%s\"", keys[i], values[i]);;
        }
        System.out.printf(JSON_PROPERTY, getGeometryType(), getLabel(), getIconType(), details);
    }

    public static void toJSON(Mappable mappable, String[] keys, String[] values) {
        mappable.toJSON(keys, values);
    }

    public String getLabel();

    public String getGeometryType();

    public String getIconType();
}
