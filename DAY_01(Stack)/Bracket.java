class bracketStack {
    private char arr[];
    int i = -1;

    public bracketStack() {
        arr = new char[10];

    }

    public boolean isFull() {
        return arr.length - 1 == i;

    }

    public boolean isEmpty() {
        return i == -1;
    }

    public bracketStack(int s) {
        arr = new char[s];
    }

    public void push(char n) {
        if (isFull()) {
            System.out.println("Already Full\n");
            return;
        }
        i++;
        arr[i] = n;

    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return '\0';
        } else {
            char ans = arr[i];
            i--;
            return ans;

        }
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Already empty\n");
            return '\0';
        }

        return arr[i];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Already empty\n");

        }
        for (int j = 0; j <= i; j++) {

            System.out.println(arr[j]);

        }

    }

}

public class Bracket {
    public static void main(String[] args) {
        bracketStack st = new bracketStack(25);
        String str = "{4*5[2+8]/(6*7))}{}";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);

            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println("Invalid Expression");
                    return;
                }
                if ((ch == '}' && st.peek() == '{') || (ch == ')' && st.peek() == '(')
    
                    || (ch == ']' && st.peek() == '['))
                    st.pop();
                else {
                    System.out.println("Invalid Expression");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("Valid Expression");

        } else {
            System.out.println("Invalid Expression");

        }
    }
}
