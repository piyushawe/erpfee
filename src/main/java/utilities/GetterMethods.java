package utilities;

import java.io.File;

public class GetterMethods {
    public String getPackage(String pack) {
        String[] packs = pack.split("\\.");
        return packs[0];
    }

    public File getFilePath(String page, String pack) {
        return new File("configuration\\" + pack + "\\" + page + ".properties");
    }
}
