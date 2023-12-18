import java.util.*;

class BerthCountException extends Exception {
    public BerthCountException(String str) {
        super(str);
    }
}

class BerthTypeException extends Exception {
    public BerthTypeException(String str) {
        super(str);
    }
}

class UnavailableException extends Exception {
    public UnavailableException(String str) {
        super(str);
    }
}

class Week7_5 {
    public static void main(String args[]) {
        int s1 = 70, s2 = 70, b;
        int b1 = 70, b2 = 70;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.AC 2.Sleeper 3.exit");
            int n = sc.nextInt();

            try {
                switch (n) {
                    case 1:
                        System.out.println("Enter num of berths required: ");
                        b = sc.nextInt();
                        if (b > 6)
                            throw new BerthCountException("Entered above 6");
                        else {
                            allotRandomSeats(b, "AC", b1, b2);
                        }
                        break;

                    case 2:
                        System.out.println("Enter num of berths required: ");
                        b = sc.nextInt();
                        if (b > 6)
                            throw new BerthCountException("Entered above 6");
                        else {
                            allotRandomSeats(b, "Sleeper", s1, s2);
                        }
                        if ((b1 < 70 || b2 < 70) && (s1 < 70 || s2 < 70))
                            throw new BerthTypeException("Booking from both");
                        break;

                    case 4:
                        System.out.println("Remaining AC berths are: " + (b1 + b2));
                        System.out.println("Remaining Sleeper berths are: " + (s1 + s2));
                        System.exit(0);
                }

            } catch (UnavailableException u) {
                System.out.println(u);
            } catch (BerthTypeException v) {
                System.out.println(v);
            } catch (BerthCountException w) {
                System.out.println(w);
            }
        }
    }

    private static void allotRandomSeats(int requiredBerths, String berthType, int availableBerth1, int availableBerth2)
            throws UnavailableException {
        if (requiredBerths > availableBerth1 + availableBerth2) {
            throw new UnavailableException("Not enough " + berthType + " berths available");
        }

        Random rand = new Random();
        System.out.println("Allotted " + requiredBerths + " " + berthType + " berths: ");

        while (requiredBerths > 0) {
            int randomSeat = rand.nextInt(2) + 1; // Randomly select berth 1 or berth 2
            if (randomSeat == 1 && availableBerth1 > 0) {
                System.out.print(" " + berthType + "-Berth1");
                availableBerth1--;
                requiredBerths--;
            } else if (randomSeat == 2 && availableBerth2 > 0) {
                System.out.print(" " + berthType + "-Berth2");
                availableBerth2--;
                requiredBerths--;
            }
        }
        System.out.println();
    }
}
