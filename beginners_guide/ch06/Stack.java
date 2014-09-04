class Stack {
    private char q[];
    private int putloc, getloc;

    Stack(int size) {
        q = new char[size];
        getloc = size - 1;
    }

    Stack(Stack ob) {
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i=0; i < getloc; i++)
            q[i] = ob.q[i];
    }

    Stack(char a[]) {
        getloc = a.length - 1;
        q = new char[a.length];
    }

    void push(char value) {
        if(getloc == q.length) {
            System.out.println("Stack is stuffed!");
            return;
        }
        q[getloc++] = value;
    }

    char pop(char value) {
        if(getloc < 0) {
            System.out.println("Stack is empty!");
            return (char) 0;
        }
        return q[getloc--];

    }
}
