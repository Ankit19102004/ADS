class BST {
    private BTNode root;

    public BST() {
        root = null;
    }

    public void insert(int d) {
        root = insert_rec(root, d);
    }

    private BTNode insert_rec(BTNode root, int d) {
        if (root == null)
            root = new BTNode(d);
        else if (d < root.getData())
            ptr.setLeft(insert_BST(ptr.getLeft(), d));

        else if (d > root.getData())
            ptr.setRight(insert_BST(ptr.getRight(), d));

        else
            System.out.println("\n Duplicate data...");

        return root;
    }

    public void del(int d) {
        root = del_node(root, d);
    }

    public BTNode del_node(BTNode root, int d) {
        BTNode succ, deleteable;
        if (root == null) {
            System.out.println("\nNot Found....");
            return null;
        }
        if (d < root.getData())
            root.setLeft(del_node(root.getLeft(), d));
        else if (d > root.getData())
            root.setRight(del_node(root.getRight(), d));
        else {

            if (root.getLeft() != null && root.getRight() != null) {
                succ = root.getRight();
                while (succ.getLeft() != null) {
                    succ = succ.getLeft();
                }
                root.setData(succ.getData());
                root.setRight(del_node(root.getRight(), succ.getData()));
            } 
            else {
                deleteable = root;
                if (root.getRight() != null)
                    root = root.getRight();
                else if (root.getLeft() != null)
                    root = root.getLeft();
                else {
                    root = null;
                }
                deleteable = null;
                
            }
        }
        return root;
    }
    public BTNode search_tree

    public void preOrder(BTNode root) {
        if (root == null)
            return;
        System.out.println(" " + root.getData());
        if (root.getLeft() != null)
            preOrder(root.getLeft());
        if (root.getRight() != null)
            preOrder(root.getRight());
    }
}

public class UserBST {

}
