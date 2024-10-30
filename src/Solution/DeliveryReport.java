package Solution;

// Importing necessary packages
import java.util.Arrays;

public class DeliveryReport
{
    // Main method to execute the program
    public static void main(String[] args)
    {
        // Declaration of a two-dimensional array to store deliveries data
        int[][] deliveries = {
            {128, 135, 139},   // Deliveries for 2018
            {155, 129, 175},   // Deliveries for 2019
            {129, 130, 185}    // Deliveries for 2020
        };

        // Display the report table headers
        System.out.println("************************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("************************************************************");
        System.out.println("\t \t\tJAN\t\tFEB\t\tMAR");
        
        // Loop through each row (representing each year) and display deliveries
        for (int i = 0; i < deliveries.length; i++)
        {
            int year = 2018 + i;  // Determine the year based on the row index
            System.out.print("DELIVERIES " + year + "\t \t");

            // Print each month’s deliveries
            for (int j = 0; j < deliveries[i].length; j++)
            {
                System.out.print(deliveries[i][j] + "\t\t");
            }
            System.out.println();  // Newline for each year
        }
        
        // Calculate and display total, maximum, and minimum deliveries
        int totalDeliveries = calculateTotal(deliveries);
        int maxDelivery = findMax(deliveries);
        int minDelivery = findMin(deliveries);
        
        System.out.println("************************************************************");
        System.out.println("DELIVERIES STATISTICS");
        System.out.println("************************************************************");
        System.out.println("Total Deliveries:\t" + totalDeliveries);
        System.out.println("Maximum Deliveries:\t" + maxDelivery);
        System.out.println("Minimum Deliveries:\t" + minDelivery);
        System.out.println("************************************************************");
        System.out.println();
    }

    /**
     * Method to calculate the total deliveries in the 2D array
     * @param deliveries - 2D array of deliveries data
     * @return total - Total deliveries across all months and years
     */
    public static int calculateTotal(int[][] deliveries)
    {
        int total = 0;
        for (int[] year : deliveries)
        {
            for (int month : year)
            {
                total += month;  // Summing up all deliveries
            }
        }
        return total;
    }

    /**
     * Method to find the maximum deliveries in the 2D array
     * @param deliveries - 2D array of deliveries data
     * @return max - The maximum delivery value found
     */
    public static int findMax(int[][] deliveries)
    {
        int max = deliveries[0][0];  // Initialize max with the first element
        for (int[] year : deliveries)
        {
            for (int month : year)
            {
                if (month > max)
                {
                    max = month;  // Update max if a larger value is found
                }
            }
        }
        return max;
    }

    /**
     * Method to find the minimum deliveries in the 2D array
     * @param deliveries - 2D array of deliveries data
     * @return min - The minimum delivery value found
     */
    public static int findMin(int[][] deliveries)
    {
        int min = deliveries[0][0];  // Initialize min with the first element
        for (int[] year : deliveries)
        {
            for (int month : year)
            {
                if (month < min)
                {
                    min = month;  // Update min if a smaller value is found
                }
            }
        }
        return min;
    }
}
