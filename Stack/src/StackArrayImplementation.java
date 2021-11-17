public class StackArrayImplementation {
    int top;
    int capacity;
    int[] stack;

    StackArrayImplementation() {
        //means empty array of size 10
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }


        public static void main (String[]args){
            StackArrayImplementation st = new StackArrayImplementation();
            st.push(34);
            st.push(314);
            st.push(24);
            st.push(14);
            st.push(40);
            System.out.println(st.isEmpty());
            System.out.println(st.isFull());
            System.out.println(st.capacity);
            System.out.println(st.peek());
            System.out.println(st.pop());


        }
}

