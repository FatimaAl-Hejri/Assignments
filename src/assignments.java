public class assignments {

    public static void shiftRightInsert(int[] a, int index, int value) {
            if (index < 0 || index >= a.length) {
                System.out.println("Enter correctly");
                return;
            }

            for (int i = a.length - 1; i > index; i--) {
                a[i] = a[i - 1];
            }

            a[index] = value;
        }
    }

