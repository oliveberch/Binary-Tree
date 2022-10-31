class Tree {
    public static void main(String[] args) {
        ArrayImp obj = new ArrayImp();
        obj.Root("A");
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Left("F", 2);
        obj.print_Tree();
    }
}

class ArrayImp {
    static int root = 0;
    static String[] str = new String[10];

    public void Root(String key) {
        str[0] = key;
    }

    public void set_Left(String key, int root) {
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.printf(
                    "Can't set child at %d, no parent found\n",
                    t);
        } else {
            str[t] = key;
        }
    }

    public void set_Right(String key, int root) {
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.printf(
                    "Can't set child at %d, no parent found\n",
                    t);
        } else {
            str[t] = key;
        }
    }

    public void print_Tree() {
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}
