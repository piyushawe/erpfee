package utilities;

import java.io.File;

public class GetterMethods {
    public String getPackage(String pack) {
        String[] packs = pack.split("\\.");
        return packs[1];
    }

    public File getFilePath(String page, String pack) {
        return new File("configuration\\" + pack + "\\" + page + ".properties");
    }

    public File getFilePath(String page) {
        return new File("configuration\\" + page + ".properties");
    }
}