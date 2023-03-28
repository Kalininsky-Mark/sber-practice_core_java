package ru.sber.String;

import static java.lang.Math.min;

public class pref {
    public pref() {
    }

    public static String prefix(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String str = "";
        int i;
        char a, b;
        boolean test = true;
        for (i = 0; (i < min(str2.length(), str1.length())) && test; i++) {
            a = str1.charAt(i);
            b = str2.charAt(i);
            if (a == b) {
                str += a;
            } else {
                test = false;
            }
        }
        return (str);
    }
}
