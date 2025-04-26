import java.util.*;

public class MaximumWorkingEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");

        int N = sc.nextInt(); // Number of employees

        int[] B = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter employye " + (i + 1) + " Entry time:");
            B[i] = sc.nextInt(); // Start time
            System.out.println("Enter employye " + (i + 1) + " Leaving time:");
            D[i] = sc.nextInt(); // Duration
        }

        sc.close();
        printMaxWorkingEmployees(B, D);
    }

    private static void printMaxWorkingEmployees(int[] b, int[] d) {
        // Create a list of events (start and end times)
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            events.add(new int[]{b[i], 1}); // Start of work
            events.add(new int[]{b[i] + d[i], -1}); // End of work
        }

        // Sort events by time, breaking ties by type (-1 before 1)
        events.sort((e1, e2) -> e1[0] == e2[0] ? Integer.compare(e1[1], e2[1]) : Integer.compare(e1[0], e2[0]));

        int maxEmployees = 0;
        int currentEmployees = 0;
        int maxHour = Integer.MAX_VALUE;

        // Traverse the events to calculate the maximum overlap
        for (int[] event : events) {
            currentEmployees += event[1]; // Add 1 for start, subtract 1 for end
            if (currentEmployees > maxEmployees) {
                maxEmployees = currentEmployees;
                maxHour = event[0];
            } else if (currentEmployees == maxEmployees) {
                maxHour = Math.min(maxHour, event[0]);
            }
        }

        System.out.println("Hour: " + maxHour + ", Employees: " + maxEmployees);
    }
}