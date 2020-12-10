package com.leet.Solution.aprilChallenge;

public class TreeNode {
    public int getVal() {
        return this.val;
    }

    public void setVal(final int val) {
        this.val = val;
    }

    public int val;

    public TreeNode getLeft() {
        return this.left;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public TreeNode left;
    public  TreeNode right;
      public TreeNode(final int x) {
          this.val = x; }
    public TreeNode() {}
    TreeNode(final int val, final TreeNode left, final TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
}
