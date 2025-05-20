// i. Interface for Stack Operations
interface Stack {
    void push(int element);
    int pop();
    boolean isEmpty();
    int size();
}
// ii. Fixed-Length Stack Implementation
class FixedLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public FixedLengthStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow (Fixed): Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow (Fixed)");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
// iii. Dynamic-Length Stack Implementation
class DynamicStack implements Stack {
    private int[] stackArray;
    private int top;

    public DynamicStack() {
        stackArray = new int[2]; // initial capacity
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top == stackArray.length - 1) {
            resize();
        }
        stackArray[++top] = element;
    }

    private void resize() {
        int newCapacity = stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow (Dynamic)");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
// iv. Class to demonstrate Runtime Binding using Interface Reference
public class st_int {
    public static void performStackOperations(Stack stack) {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Size: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Using FixedLengthStack:");
        Stack fixed = new FixedLengthStack(2);
        performStackOperations(fixed);

        System.out.println("Using DynamicStack:");
        Stack dynamic = new DynamicStack();
        performStackOperations(dynamic);
    }
}

