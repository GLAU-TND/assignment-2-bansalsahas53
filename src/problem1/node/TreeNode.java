/*
 *  Created by IntelliJ IDEA.
 *  User: Sahas
 *  Date: 28-Mar-20
 *  Time: 1:10 AM
 */
package problem1.node;

public class TreeNode {
    private int key;

    private TreeNode left, right;



    public TreeNode(int item) {

        key = item;

        left = right = null;

    }



    public int getKey() {

        return key;

    }



    public void setKey(int key) {

        this.key = key;

    }



    public TreeNode getLeft() {

        return left;

    }



    public void setLeft(TreeNode left) {

        this.left = left;

    }



    public TreeNode getRight() {

        return right;

    }



    public void setRight(TreeNode right) {

        this.right = right;

    }
}
