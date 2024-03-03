/* Rule 08. Visibility and Atomicity (VNA)
VNA00-J. Ensure visibility when accessing shared primitive variables
  
Non-compliant code: */

public class SharedCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

/* Corrected Code */

public class SharedCounter {
    private volatile int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}


