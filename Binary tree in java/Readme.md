    Binary tree:
  A binary tree is a recursive data structure where each node can
  have 2 childrens at most.
  A common type of binary tree is a binary search tree ,
  in which every node has a value that is greater than or equal to
  the node values in the left sub-tree, and less than or equal to
  right sub-tree.

First, we have to find the place where we want to add a new node in order to keep the tree sorted.
 We’ll follow these rules starting from the root node:

  1) if the new node’s value is lower than the current node’s, we go to the left child
  2) if the new node’s value is greater than the current node’s, we go to the right child
  3) when the current node is null, we’ve reached a leaf node and we can insert the new node in that position

     First, we’ll create a recursive method to do the insertion:

           private Node addRecursive(Node current, int value) {
              if (current == null) {
              return new Node(value);
           }

             if (value < current.value) {
             current.left = addRecursive(current.left, value);
             } else if (value > current.value) {
             current.right = addRecursive(current.right, value);
          } else {
                // value already exists
            return current;
         }

          Now the public method that starts the recursion from the root node:
              public void add(int value) {
         root = addRecursive(root, value);
            }

     Finding an Element
         we have created a recursive method that transverse a tree
         now we will be searching for the value by comparing it to the value in
         the current node, then continue in the left or right child depending on that.


          private boolean containsNodeRecursive(Node current, int value) {
                if (current == null) {
                return false;
              }
               if (value == current.value) {
               return true;
            }
          return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
        }
        public boolean containsNode(int value) {
  return containsNodeRecursive(root, value);
   }
