import java.util.*;
public class ArrayOP
{
    int arr[],size;

    ArrayOP(int size) //Parameterized constructor to initialize the array to 0
    {
        this.size=size;
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=0;
        }
    }

    public void inputElements() //method to input elements in the array
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    public void display() //method to display elements in the array
    {
        System.out.println("Array elements:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }

    public int calcSum()  //method to calculate sum of all array elements
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public double calcAvg()  //method to calculate avg of all array elements
    {
        int sum=calcSum();
        return (double) sum/size;
    }

    public void swapMinMax()  //method to swap min and max elements in the array
    {
        int min=0,max=0;
        for(int i=1;i<size;i++)
        {
            if(arr[i]<arr[min])
                min=i;
            if(arr[i]>arr[max])
                max=i;
        }
        int temp=arr[min];
        arr[min]=arr[max];
        arr[max]=temp;
    }

    public void occurences() //Display occurences of all unique eleemnts
    {
        int elem[]=arr.clone();
        Arrays.sort(elem);
        int current=elem[0];
        int count=1;

        System.out.println("Elements:Occurences");
        for(int i=1;i<size;i++)
        {
            if(elem[i]==current)
                count++;
            else
            {
                System.out.println(current+":"+count);
                current=elem[i];
                count=1;
            }
        }
        System.out.println(current+":"+count);

    }

    public int findGreatestThreeDigitNo() //generate three digits numbers from existing array and find the greatest among them
    {
        int max=0,k=0;
        //int test[]=new int[3];
        for(int i=0;i<=size;i=i+3)  //forming 3-digit numbers by taking three arr elements from left to right
        {
            int num = getSingleDigitSum(arr[i]) * 100
                    + getSingleDigitSum((i + 1 < arr.length) ? arr[i + 1] : 0) * 10  //checking if index is out of bounds, if yes then pass 0 to the calling function
                    + getSingleDigitSum((i + 2 < arr.length) ? arr[i + 2] : 0);
            //test[k++]=num;
            if(num>max && num<1000)
            {
                max=num;
            }
        }
        //for(int i=0;i<3;i++)
            //System.out.println(test[i]);
        return max;
    }

    public int getSingleDigitSum(int num) //function that returns a single digit from a multi digit no by repeatedly adding it.
    {
        while(num>=10)
        {
            int sum=0;
            while(num!=0)
            {
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }


    public static void main(String args[])
    {
        ArrayOP obj=new ArrayOP(7); //THALA FOR A REASON
        obj.inputElements();
        obj.display();
        System.out.println("Sum of elements in the array:"+obj.calcSum());
        System.out.println("Average of elements in the array:"+obj.calcAvg());

        obj.swapMinMax();
        System.out.println("Array after swapping the min and max element:");
        obj.display();
        obj.occurences();
        System.out.println("Greatest number:"+obj.findGreatestThreeDigitNo());
    }
}