public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class CreateBT {
        static int indx = -1;

        public static Node CreateBT(int nodes[]) {
            indx++;
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node nd = new Node(nodes[indx]);
            nd.left = CreateBT(nodes);
            nd.right = CreateBT(nodes);
            return nd;
        }
        
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CreateBT bt = new CreateBT();
        Node root=bt.CreateBT(nodes);
        System.out.println(root.data);
        BinaryTrees b=new BinaryTrees();
        b.preorder(root);
        System.out.println();
        b.inorder(root);
        System.out.println();
        b.postorder(root);
        
    }
}
