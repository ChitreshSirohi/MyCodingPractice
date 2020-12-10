package com.leet.Solution.util;

import com.leet.Solution.aprilChallenge.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertArrayToBinaryTree {
    public TreeNode getBinaryTree(final int[] arr){
        final List<Integer> collect = IntStream.of(arr).boxed().collect(Collectors.toList());
        return insertLevelOrder(collect,new TreeNode(),0);
    }
    public TreeNode getBinaryTree(final Integer[] arr){
        return insertLevelOrder(Arrays.asList(arr),new TreeNode(),0);
    }

    private TreeNode insertLevelOrder(final List<Integer> arr, TreeNode root, final int i){
        if(i < arr.size() && arr.get(i) != null){

            root = new TreeNode(arr.get(i));
            //Left child
            root.setLeft(insertLevelOrder(arr,root.getLeft(),2*i+1));
            //right child
            root.setRight(insertLevelOrder(arr,root.getRight(),2*i+2));
        }
        return root;
    }

    public int[] getArrayFromBinaryTree(final TreeNode root){
        final ArrayList<TreeNode> nodes = new ArrayList<>();
        insertToNodesToList(root, nodes);
        final int[] nodeArr = new int[nodes.size()];
        IntStream.range(0,nodes.size()).forEach(index -> nodeArr[index]=nodes.get(index).getVal());
        return nodeArr;
    }

    private TreeNode insertToNodesToList(TreeNode root, ArrayList<TreeNode> list){

        if(root != null){
            list.add(root);
        }
        int level=1;
        while(root != null){
            list.add(2*level+1,root.getLeft());
            list.add(2*level+1,root.getRight());

        }
        return root;
    }
    public void printPostorder(TreeNode node,StringBuffer sbuff)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.getLeft(),sbuff);

        // then recur on right subtree
        printPostorder(node.getRight(),sbuff);

        // now deal with the node
        System.out.print(node.getVal() + " ");
        sbuff.append(node.getVal()).append(" ");

    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(final TreeNode root)
    {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getVal() + " ");
            inOrder(root.getRight());
        }
    }
}
