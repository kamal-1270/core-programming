public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 0.621371;
        
        // Compute volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert volume to cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);
        
        // Output results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3 + ".");
    }
}