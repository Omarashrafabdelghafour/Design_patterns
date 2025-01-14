import java.util.HashMap;
import java.util.Map;

// Flyweight Factory - Ensures each BookType is created once
    public class BookTypeFactory {
        private static final Map<String, BookType> bookTypeCache = new HashMap<>();

        public static BookType getBookType(String type, String distributor, String otherData) {
            String key = type + "-" + distributor + "-" + otherData;
            if (!bookTypeCache.containsKey(key)) {
                bookTypeCache.put(key, new BookType(type, distributor, otherData));
                System.out.println("Created new BookType: " + key);
            } else {
                System.out.println("Reusing existing BookType: " + key);
            }
            return bookTypeCache.get(key);
        }
    }



