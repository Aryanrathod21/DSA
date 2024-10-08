import java.util.*;

public class BinaryTreeOrderTravel {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
       
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree
        (int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");        
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" "); 
    }

    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            
        }
    }
    public static int countNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode + rightNode + 1;        
    }

    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNode = sumOfNodes(root.left);
        int rightNode = sumOfNodes(root.right);
        return leftNode + rightNode + root.data;        
    }

    public static int heightOfTree(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;       
    }

    //O(n^2)
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);
        int height = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(height, Math.max(leftdia, rightdia));

    }

    //O(n)
    static class TreeInfo{
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        
        if (root == null) {
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht,right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;


    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter2(root).diam);
    }
}
