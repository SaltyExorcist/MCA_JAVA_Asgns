class MyStack implements StackOperations {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push element " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        } else {
            int topElement = stackArray[top];
            System.out.println("Top element: " + topElement);
            return topElement;
        }
    }
}