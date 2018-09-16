package fenzhi;
 
public class fenzhi {
 
    // 直接算法 得到最大值和最小值
    public static void main(String[] args) {
        int[] A = { -18, -16, 9, -5, 7, -40, 0, 35 };
        System.out.println(getMaxValue(A));
        System.out.println(getMinValue(A));
        System.out.println(getMax(A, 0, A.length - 1));
 
    }
 
    // 直接算法求最大值
    public static int getMaxValue(int[] array) {
        int Max = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1]) {
                Max = array[i + 1];
            }
            if (array[i] < array[i + 1]) {
                Max = array[i + 1];
            }
            if (array[i] > array[i + 1]) {
                Max = array[i];
                array[i] = array[i + 1];
                array[i + 1] = Max;
 
            }
        }
        return Max;
    }
 
    // 直接算法求最小值
    public static int getMinValue(int[] array) {
 
        int Min = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1]) {
                Min = array[i + 1];
            } else if (array[i] < array[i + 1]) {
                Min = array[i];
                array[i] = array[i + 1];
                array[i + 1] = Min;
            } else if (array[i] > array[i + 1]) {
                Min = array[i + 1];
            }
        }
        return Min;
    }
 
    // 用分治法求最大最小值
    public static int getMax(int[] array, int i, int j) {
        int Max1 = 0;
        int Max2 = 0;
        if (i == j) {
            return Max1 = Max2 = array[j];
        } else if (i == (j - 1)) {
            Max1 = array[i];
            Max2 = array[j];
            return Max1 > Max2 ? Max1 : Max2;
        } else {
            int mid = (i + j) / 2;
            Max1 = getMax(array, i, mid);
            Max2 = getMax(array, mid, j);
            return Max1 > Max2 ? Max1 : Max2;
        }
    }
}