package com.leet.Solution.JuneChallenge;

import com.leet.Solution.aprilChallenge.TreeNode;
import com.leet.Solution.util.ConvertArrayToBinaryTree;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        final ConvertArrayToBinaryTree convertArrayToBinaryTree = new ConvertArrayToBinaryTree();
        TreeNode binaryTree = convertArrayToBinaryTree.getBinaryTree(new int[]{4, 2, 7, 1, 3, 6, 9});
        //final int[] arrayFromBinaryTree = convertArrayToBinaryTree.getArrayFromBinaryTree(binaryTree);
        StringBuffer stringBuffer = new StringBuffer();
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        binaryTree = invertBinaryTree.invertTree(binaryTree);
        convertArrayToBinaryTree.printPostorder(binaryTree,stringBuffer);
        assertThat(stringBuffer.toString()).isEqualTo("9 6 7 3 1 2 4 ");
        //System.out.println(arrayFromBinaryTree);
    }
}