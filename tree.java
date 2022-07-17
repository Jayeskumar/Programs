import java.util.ArrayList;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }


}
class Solution{
    public TreeNode buildTree(int[] preorder,int[] inorder){

        if(preorder.length==0||inorder.length==0)
        return null;
        TreeNode root=new TreeNode(preorder[0]);
        int i=0;
        while(inorder[i]!=preorder[0]){
            i++;
        }
        int[] leftpreorder=Arrays.copyOfRange(preorder,1,i+1);
        int[] leftinorder=Arrays.copyOfRange(inorder,0,i);
        int[] rightpreorder=Arrays.copyOfRange(preorder,i+1,preorder.length);
        int[] rightinorder=Arrays.copyOfRange(inorder,i+1,inorder.length);
        //left tree
        root.left=buildTree(leftpreorder,leftinorder);


        //right tree
    root.right=buildTree(rightpreorder,rightinorder);
    return root;

    }
    public static void main(String[] args){
        Solution s=new Solution();
        int[] preorder={1,2,4,5,3,6,7};
        int[] inorder={4,2,5,1,6,3,7};
        TreeNode root=s.buildTree(preorder,inorder);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);
    }
}
