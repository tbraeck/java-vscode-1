public class Animated {
    // ASCII art characters 128, display 95
    public static void main(String[] args) {
        try {
            while (true) {
                // Clear the console
                for (int i = 0; i < 50; i++) System.out.println();

                // First frame
                System.out.println("          :LOL:ROFL:ROFL ");
                System.out.println("            A            ");
                System.out.println("        /-------         ");
                System.out.println(" LOL====      [] \\      ");
                System.out.println("  L     \\         \\       ");
                System.out.println("         \\_______|       ");
                System.out.println("           I     I         ");
                System.out.println("        -------------      ");
                System.out.println("                         ");
                System.out.println("  Tate's ROFLCOPTER        ");

                // Sleep for a short period
                Thread.sleep(100);

                // Clear the console
                for (int i = 0; i < 50; i++) System.out.println();

                // Second frame
                System.out.println(" ROFL:ROFL:LOL:       ");
                System.out.println("            A            ");
                System.out.println("  L     /-------         ");
                System.out.println(" LOL====      [] \\      ");
                System.out.println("       \\         \\       ");
                System.out.println("         \\_______|       ");
                System.out.println("           I     I         ");
                System.out.println("        -------------      ");
                System.out.println("                         ");
                System.out.println("  Tate's ROFLCOPTER       ");

                // Sleep for a short period
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
