import java.util.*;
public class TwoDArray {
    int[][] arr;
    int n;
    TwoDArray(int n)
    {
        this.n=n;
        arr=new int[2][n];
    }

    public void inputElements() //method to input elements in the 2D-array
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the 2D array:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void display() //method to display elements in the 2D-array
    {
        System.out.println("Array elements:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Split the array into two different arrays and store them in the array available in two different objects of class OneDArray
    public void splitIntoOneDArray(OneDArray obj1, OneDArray obj2) {
        for (int j = 0; j < arr[0].length; j++) {
            obj1.arr[j] = arr[0][j];
            obj2.arr[j] = arr[1][j];
        }
    }

    // Add the arrays (m X n matrices) of two objects of TwoDArray class
    public static TwoDArray addArrays(TwoDArray obj1, TwoDArray obj2) {
        int[][] resultarr = new int[2][obj1.arr[0].length];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < obj1.arr[0].length; j++) {
                resultarr[i][j] = obj1.arr[i][j] + obj2.arr[i][j];
            }
        }
        TwoDArray result = new TwoDArray(obj1.arr[0].length);
        result.arr = resultarr;
        return result;
    }

    // Multiply the arrays (m X n matrices) of two objects of TwoDArray class
    public static TwoDArray multiplyArrays(TwoDArray obj1, TwoDArray obj2) {
        int[][] resultarr = new int[2][obj1.arr[0].length];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < obj1.arr[0].length; j++) {
                for (int k = 0; k < obj1.arr.length; k++) {
                    resultarr[i][j] += obj1.arr[i][k] * obj2.arr[k][j];
                }
            }
        }
        TwoDArray result = new TwoDArray(obj1.arr[0].length);
        result.arr = resultarr;
        return result;
    }
}

