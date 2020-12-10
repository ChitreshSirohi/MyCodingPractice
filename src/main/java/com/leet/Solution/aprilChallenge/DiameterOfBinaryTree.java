package com.leet.Solution.aprilChallenge;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(final TreeNode root) {
        if(root == null){
            return 0;
        }
        final int leftTreeHeight = height(root.left);
        final int rightTreeHeight = height(root.right);

        final int leftDiameter = diameterOfBinaryTree(root.left);
        final int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(leftTreeHeight + rightTreeHeight, Math.max(leftDiameter, rightDiameter));
    }

    public int height(final TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        return (1 + Math.max(height(treeNode.left), height(treeNode.right)));
    }

}
