class BTreeUsingArray {
    int tree[];

    BTreeUsingArray() {
        tree = new int[9];

        for (int i = 0; i < tree.length; i++) {
            tree[i] = -1;

        }
    }
    public void insertRoot(int d){
        if(tree[0]!=-1)
            tree[0]=d;
        return ;

    }
    public void insertLeft(int d,int par){
        if(tree[par]==1){
            System.out.println();
        }
    }

    
}


public class UserBinaryTree {

}
