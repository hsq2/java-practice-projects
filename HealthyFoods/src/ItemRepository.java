import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ItemRepository {

    private static Map<String, Item> readFromFile(String path) throws IOException {
        Map<String, Item> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int limit = 3;

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(":", limit);
            if (parts.length != limit) {
                continue;
            }
            String key = parts[0];
            double value = Double.parseDouble(parts[1]);
            boolean isHealthy = Boolean.parseBoolean(parts[2]);
            Item item = new Item(key, value, isHealthy);
            map.put(key, item);
        }
        return map;
    }

    private final String path;

    private final Map<String, Item> map;

    public ItemRepository(String path) {
        this.path = path;
        try {
            this.map = readFromFile(path);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error reading from file " + path);
        }
        System.out.println(map.values());
    }

    public Optional<Item> getItem(String name) {
        return Optional.ofNullable(map.getOrDefault(name, null));
    }

    public boolean exists(String name) {
        return map.containsKey(name);
    }

}
