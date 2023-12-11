package com.josephmfaulkner.solitare95.utility;

import java.util.UUID;

public class MiscUtil {
    public static String makeUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
