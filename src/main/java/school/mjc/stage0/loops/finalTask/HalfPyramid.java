package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {

            int spaces = cathetusLength - i;

            int stars = i;


            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);  // Example usage
    }
}