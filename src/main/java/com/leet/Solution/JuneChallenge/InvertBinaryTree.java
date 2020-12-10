package com.leet.Solution.JuneChallenge;

import com.leet.Solution.aprilChallenge.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root)
        {
            printPostorder(root);
            return root;
        }

    public void printPostorder(TreeNode node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.getLeft());

        // then recur on right subtree
        printPostorder(node.getRight());

        // now deal with the node
        TreeNode temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);
    }
}
