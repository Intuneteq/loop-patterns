package patterns;

/**
 *
 * @author tobio
 */
public class Patterns {

    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j >= i && j <= count + i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            count = count + 2;
            System.out.println("");
        }
    }

    /**
     * print the value of j in two dimension result should look like a table
     *
     * 1, 2, 3, 4, 5
     *
     * 1, 2, 3, 4, 5
     *
     * 1, 2, 3, 4, 5
     *
     * 1, 2, 3, 4, 5
     *
     * 1, 2, 3, 4, 5
     */
    public static void patternOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * print the value of i in two dimension result should look like a table
     *
     * 1, 1, 1, 1, 1
     *
     * 2, 2, 2, 2, 2
     *
     * 3, 3, 3, 3, 3
     *
     * 4, 4, 4, 4, 4
     *
     * 5, 5, 5, 5, 5
     */
    public static void patternTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Print numbers in two dimension such that the result is;
     *
     * 2, 3, 4, 5, 6
     *
     * 3, 4, 5, 6, 7
     *
     * 4, 5, 6, 7, 8
     *
     * 5, 6, 7, 8, 9
     *
     * 6, 7, 8, 9, 10
     */
    public static void patternThree() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Print a counter in two dimension of 5
     *
     * 1, 2, 3, 4, 5
     *
     * 6, 7, 8, 9, 10
     *
     * 11, 12, 13, 14, 15
     *
     * 16, 17, 18, 19, 20
     *
     * 21, 22, 23, 24, 25
     */
    public static void patternFour() {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Print a counter in two dimension of 5
     *
     * 01, 02, 03, 04, 05
     *
     * 06, 07, 08, 09, 10
     *
     * 11, 12, 13, 14, 15
     *
     * 16, 17, 18, 19, 20
     *
     * 21, 22, 23, 24, 25
     */
    public static void patternFive() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }

    /**
     * print the value of j in two dimension result should look like a table
     *
     * 1
     *
     * 1, 2
     *
     * 1, 2, 3
     *
     * 1, 2, 3, 4
     *
     * 1, 2, 3, 4, 5
     */
    public static void patternSix() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * print the value of j in two dimension result should look like a table
     *
     * 1
     *
     * 2, 3
     *
     * 4, 5, 6
     *
     * 7, 8, 9, 10
     *
     * 11, 12, 13, 14, 15
     */
    public static void patternSeven() {
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println("");
        }
    }

    /**
     * print the value of j in two dimension result should look like a table
     *
     * 1, 2, 3, 4, 5
     *
     * 1, 2, 3, 4
     *
     * 1, 2, 3
     *
     * 1, 2
     *
     * 1
     */
    public static void patternEight() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    /**
     *
     *
     * * * * * *
     *
     *   * * * *
     *
     *     * * *
     *
     *       * *
     *
     *         *
     */
    public static void patternNine() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

}
