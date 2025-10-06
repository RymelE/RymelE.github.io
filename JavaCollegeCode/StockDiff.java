public class StockDiff {
    public static void main(String[] args) {
        double[] prices = {100, 102, 101, 105, 98};
        double sum = 0;

        // Calculate mean
        for (double p : prices) {
            sum += p;
        }
        double mean = sum / prices.length;

        // Calculate sum of squared differences
        double squaredDiffs = 0;
        for (double p : prices) {
            squaredDiffs += (p - mean) * (p - mean);
        }

        // Standard deviation
        double stdDev = Math.sqrt(squaredDiffs / prices.length);

        System.out.println("Standard deviation of stock prices: " + stdDev);
    }
}