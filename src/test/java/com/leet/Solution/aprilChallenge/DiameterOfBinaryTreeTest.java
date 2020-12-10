package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class DiameterOfBinaryTreeTest {

    @Test
    public void diameterOfBinaryTree() {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertThat(tree.diameterOfBinaryTree(root)).isEqualTo(3);
    }

    @Test
    public void height() {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertThat(tree.height(root)).isEqualTo(3);
    }
}