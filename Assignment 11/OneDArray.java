class OneDArray {
    int[] arr;

    public OneDArray(int size) {
        arr = new int[size];
    }

    public void display() {
        System.out.println("The 1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

