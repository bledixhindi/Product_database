package ums;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DumpToFile {
    public void dumpToFile(List<Product> product, String filename) throws IOException {
        File file = new File(filename);
        FileWriter writer = new FileWriter(file);

        for (Product prod : product) {
            writer.write(prod.toString() + "\n");
        }

        writer.close();
    }
}

