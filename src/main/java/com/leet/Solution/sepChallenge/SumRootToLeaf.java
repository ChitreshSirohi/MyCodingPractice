package com.leet.Solution.sepChallenge;

import com.leet.Solution.aprilChallenge.TreeNode;

public class SumRootToLeaf {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        if(root.left == null && root.right == null){
            return root.val;
        }
        printPostorder(root, "");
        return sum;
    }

    void printPostorder(TreeNode node, String nos) {
        if(node != null) {
            if (node.left == null && node.right == null) {
                int a = Integer.parseInt(nos + node.val, 2);
                sum = sum + a;
                return;
            }
            //String st = nos;
            // first recur on left subtree
                printPostorder(node.left, nos + node.val);


            printPostorder(node.right, nos + node.val);
        }



  /*      else {
           sum = sum + Integer.parseInt(nos.length()==1 && sum != 0?"0":nos, 2);
        }*/
        // then recur on right subtree
        //sum = sum+ printPostorder(node.right, nos + "" + (node.right != null? node.right.val:""));


    }
}
