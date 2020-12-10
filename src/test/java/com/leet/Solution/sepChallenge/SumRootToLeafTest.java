package com.leet.Solution.sepChallenge;

import com.leet.Solution.aprilChallenge.TreeNode;
import com.leet.Solution.util.ConvertArrayToBinaryTree;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SumRootToLeafTest {

    @Test
    public void sumRootToLeaf() {
        SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();
        ConvertArrayToBinaryTree convertArrayToBinaryTree = new ConvertArrayToBinaryTree();
         TreeNode root = convertArrayToBinaryTree.getBinaryTree(new int[]{1, 0, 1, 0, 1, 0, 1});
        assertThat(sumRootToLeaf.sumRootToLeaf(root)).isEqualTo(22);
        root = convertArrayToBinaryTree.getBinaryTree(new int[]{1, 1});
        assertThat(sumRootToLeaf.sumRootToLeaf(root)).isEqualTo(3);
        root = convertArrayToBinaryTree.getBinaryTree(new int[]{1});
        assertThat(sumRootToLeaf.sumRootToLeaf(root)).isEqualTo(1);
        root = convertArrayToBinaryTree.getBinaryTree(new Integer[]{1,null,0});
        assertThat(sumRootToLeaf.sumRootToLeaf(root)).isEqualTo(2);
        root = convertArrayToBinaryTree.getBinaryTree(new Integer[]{0,1,0,0,null,0,0,null,null,null,1,null,null,null,1});
        assertThat(sumRootToLeaf.sumRootToLeaf(root)).isEqualTo(5);
    }
}