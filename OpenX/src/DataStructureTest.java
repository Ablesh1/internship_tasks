import org.junit.Test;
import static org.junit.Assert.*;

public class DataStructureTest {

    @Test
    public void testCountLeafNode1() {
        // Create data structure from exercise
        Node root = new Node(0, false);
        root.left= new Node(3,false);
        root.right = new Node(7, false);
        root.left.left = new Node(2, false);
        root.left.right = new Node(5, false);
        root.right.left = new Node(1, false);
        root.right.right = new Node(0, false);
        root.right.right.left = new Node(2,false);
        root.right.right.right = new Node(8,false);
        root.right.right.right.right = new Node(5, false);

        // Test countLeafNode method
        int leafNodesNumber = DataStructure.countLeafNode(root);
        assertEquals(5, leafNodesNumber);
    }

    @Test
    public void testCountLeafNode2() {
        // Create a root with 7 leaf nodes
        Node root = new Node(0, false);

        // Left side with 3 leaf nodes
        root.left = new Node(1, false);
        root.left.left = new Node(2, false);
        root.left.right = new Node(3, false);
        root.left.right.left = new Node(4, false);
        root.left.right.right = new Node(5, false);

        // Right side with 4 leaf nodes
        root.right = new Node(6, false);
        root.right.left = new Node(7, false);
        root.right.right = new Node(8, false);
        root.right.left.left = new Node(9, false);
        root.right.left.right = new Node(10, false);
        root.right.left.left.left = new Node(11, false);
        root.right.left.left.right = new Node(12, false);
        root.right.left.left.right.right = new Node(13, false);

        // Test countLeafNode method
        int leafNodesNumber = DataStructure.countLeafNode(root);
        assertEquals(7, leafNodesNumber);
    }

    @Test
    public void testFindTheLongest1() {
        // Create data structure from exercise
        Node root = new Node(0, false);
        root.left= new Node(3,false);
        root.right = new Node(7, false);
        root.left.left = new Node(2, false);
        root.left.right = new Node(5, false);
        root.right.left = new Node(1, false);
        root.right.right = new Node(0, false);
        root.right.right.left = new Node(2,false);
        root.right.right.right = new Node(8,false);
        root.right.right.right.right = new Node(5, false);

        // Test findMaxEdges method
        int longestPath = DataStructure.findTheLongest(root, 10);
        assertEquals(4, longestPath);
    }

    @Test
    public void testFindTheLongest2() {
        // Create a root with 5 paths
        Node root = new Node(1, false);

        // Left side with 2 paths
        root.left = new Node(2, false);
        root.left.left = new Node(3,false);
        root.left.left.left = new Node(4,false);
        root.left.left.right = new Node(5, false);
        root.left.left.right.right = new Node(6, false);

        // Right side with 3 paths
        root.right = new Node(7, false);
        root.right.left = new Node(8, false);
        root.right.right = new Node(9, false);
        root.right.right.right = new Node(10, false);
        root.right.right.right.left = new Node(11, false);
        root.right.right.right.left.left = new Node(12, false);
        root.right.right.right.right = new Node(13, false);

        // Test findMaxEdges method
        int longestPath = DataStructure.findTheLongest(root, 13);
        assertEquals(5, longestPath);
    }

    @Test
    public void TestCompareData1() {
        // Create data structure from exercise
        Node root1 = new Node(0, false);
        root1.left= new Node(3,false);
        root1.right = new Node(7, false);
        root1.left.left = new Node(2, false);
        root1.left.right = new Node(5, false);
        root1.right.left = new Node(1, false);
        root1.right.right = new Node(0, false);
        root1.right.right.left = new Node(2,false);
        root1.right.right.right = new Node(8,false);
        root1.right.right.right.right = new Node(5, false);

        // Create the second data structure equivalent to the first one
        Node root2 = new Node(0, false);
        root2.left= new Node(3,false);
        root2.right = new Node(7, false);
        root2.left.left = new Node(2, false);
        root2.left.right = new Node(5, false);
        root2.right.left = new Node(1, false);
        root2.right.right = new Node(0, false);
        root2.right.right.left = new Node(2,false);
        root2.right.right.right = new Node(8,false);
        root2.right.right.right.right = new Node(5, false);

        // Test countLeafNode method
        boolean isSame = DataStructure.compareData(root1, root2);
        assertTrue(isSame);
    }

    @Test
    public void TestCompareData2() {
        // Create another data structure
        Node root1 = new Node(0, false);
        root1.left= new Node(1,false);
        root1.left.left = new Node(2, false);
        root1.left.right = new Node(3, false);
        root1.left.left.right = new Node(4, false);
        root1.left.left.left = new Node(5, false);
        root1.left.left.left.left = new Node(6, false);
        root1.right = new Node(7, false);
        root1.right.left = new Node(8, false);
        root1.right.right = new Node(9, false);
        root1.right.right.left = new Node(10,false);
        root1.right.right.right = new Node(11,false);
        root1.right.right.right.left = new Node(12, false);

        // Create the second data structure equivalent to the first one
        Node root2 = new Node(0, false);
        root2.left= new Node(1,false);
        root2.left.left = new Node(2, false);
        root2.left.right = new Node(3, false);
        root2.left.left.right = new Node(4, false);
        root2.left.left.left = new Node(5, false);
        root2.left.left.left.left = new Node(6, false);
        root2.right = new Node(7, false);
        root2.right.left = new Node(8, false);
        root2.right.right = new Node(9, false);
        root2.right.right.left = new Node(10,false);
        root2.right.right.right = new Node(11,false);
        root2.right.right.right.left = new Node(12, false);

        // Test countLeafNode method
        boolean isSame = DataStructure.compareData(root1, root2);
        assertTrue(isSame);
    }
}