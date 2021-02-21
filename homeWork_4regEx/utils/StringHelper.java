package utils;

import exceptions.NullStringException;

public class StringHelper {


    public static String fromArrayToString(char[] array, String arrayToString) throws NullStringException {
        String tempString;
        if (array == null && array.length == 0) {
            throw new NullPointerException("array is null");
        }
        arrayToString = String.valueOf(array);


        if (arrayToString.trim().isEmpty()) {
            throw new NullStringException("string is null");
        } else {
            arrayToString = arrayToString.toUpperCase().trim();
            tempString = arrayToString.toLowerCase().trim();
        }

        arrayToString = arrayToString.concat(" ").concat(tempString);


        int temp = arrayToString.length() / 2;
        if (arrayToString.length() % 2 == 0) {
            arrayToString = arrayToString.substring(0, temp - 1) + arrayToString.substring(temp + 1);

        } else {
            arrayToString = arrayToString.substring(0, temp) + arrayToString.substring(temp + 1);

        }
        return arrayToString;

    }
}
