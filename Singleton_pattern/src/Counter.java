public class Counter
{

    private static Counter instance;

    // Step 2: Private variable to hold the count value
    private int count;

    // Step 3: Private constructor to prevent instantiation from other classes
    private Counter() {
        count = 0;
    }

    // Step 4: Public static method to provide a global point of access
    public static  Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    // Method to increment the counter
    public void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }


}
