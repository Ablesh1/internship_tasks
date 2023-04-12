public class DataStructure {

    Node node;

    public DataStructure() {
        this.node = null;
    }

    public static int countLeafNode(Node node) {
        // There is nothing following the leaf node
        if(node == null) {
            return 0;
        }
        // This is the leaf node
        if (node.right == null && node.left == null) {
            return 1;
        }
        else {
            return countLeafNode(node.left) + countLeafNode(node.right);
        }
    }

    public static int countEdges(Node node, Integer addToCount) {
        int count = addToCount;
        // Count path to left child that hasn't been checked yet
        if(node.left != null && !node.left.getChecked()) {
            count += 1;
            return countEdges(node.left, count);
        }
        // Count path to right child that hasn't been checked yet
        else if(node.right != null && !node.right.getChecked()) {
            count += 1;
            return countEdges(node.right, count);
        }
        // End of the currently checked path
        // Mark this node as checked
        else if (!node.getChecked()){
            node.setChecked(true);
            return count;
        }
        else {
            return 0;
        }
    }

    public static int findTheLongest(Node node, Integer nodeNumber) {
        int maxEdges = 0;
        for(int i = 0; i < nodeNumber; i++) {
            int tempMax = countEdges(node, 0);
            if (maxEdges < tempMax) {
                maxEdges = tempMax;
            }
        }
        return maxEdges;
    }

    public static boolean compareData(Node node1, Node node2){
        // Check if nodes are both leaves
        if (node1 == null && node2 == null) {
            return true;
        }
        else if (node1 == null || node2 == null) {
            return false;
        }
        // Check if node values are the same
        else if (!node1.getValue().equals(node2.getValue())) {
            return false;
        }
        // Call the method on each child, both left and right
        else {
            return compareData(node1.left, node2.left) && compareData(node1.right, node2.right);
        }
    }

    public static void main(String[] args) {

        // Create the first data structure
        DataStructure tree = new DataStructure();

        // Create root of the tree
        tree.node = new Node(5, false);

        // Create child nodes of the root
        tree.node.left= new Node(3,false);
        tree.node.right = new Node(7, false);

        // create child nodes of left child
        tree.node.left.left = new Node(2, false);
        tree.node.left.right = new Node(5, false);

        // create child nodes of right child
        tree.node.right.left = new Node(1, false);
        tree.node.right.right = new Node(0, false);

        // etc.
        tree.node.right.right.left = new Node(2,false);
        tree.node.right.right.right = new Node(8,false);

        // etc.
        tree.node.right.right.right.right = new Node(5, false);

        // Create the second data structure equivalent to the first one
        DataStructure tree1 = new DataStructure();

        tree1.node = new Node(5, false);
        tree1.node.left= new Node(3,false);
        tree1.node.right = new Node(7, false);
        tree1.node.left.left = new Node(2, false);
        tree1.node.left.right = new Node(5, false);
        tree1.node.right.left = new Node(1, false);
        tree1.node.right.right = new Node(0, false);
        tree1.node.right.right.left = new Node(2,false);
        tree1.node.right.right.right = new Node(8,false);
        tree1.node.right.right.right.right = new Node(5, false);

        // Execute methods for features 1-3
        int leafNodesNumber = countLeafNode(tree.node);
        int longestPath = findTheLongest(tree.node, 10);
        boolean isSame = compareData(tree.node, tree1.node);

        System.out.println("\nNumber of leaves in the data structure:\t" + leafNodesNumber);
        System.out.println("Number of edges in the longest path:\t" + longestPath);
        System.out.println("Check if both data structures are same:\t" + isSame);
    }
}


