
       // program to introduce Binary Tree
    public class BinaryTree{   //main class of the program
        Node root;   //root of the tree
        BinaryTree(int key){ //constructors of the class
           root = new Node(key);
     }

     BinaryTree(){
       root = null;
    }

 public static void main(String[] args){
     BinaryTree tree = new BinaryTree();
          tree.root = new Node(1);  //root created
          tree.root.left = new Node(2);  //right node
          tree.root.right = new Node(3); //left node
          tree.root.left.left = new Node(4);//next node
        }
    }
