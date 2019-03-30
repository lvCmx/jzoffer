package 第六章_面试中的各项能力;

import common.Node;

/**
 * 平衡二叉树：
 * 左子树与右子树的深度相差不超过1.
 */
public class 判断二叉树是否为平衡二叉树 {
    /**
     * 基本后序遍历的思路
     * 在后序遍历的过程中，我们就已经遍历了它的左右子树，只要在遍历每个节点的时候记录它的深度，就可以一边遍历一边判断每个结点是不是平衡的。
     */
    int isBalanced2(Node root) {
        if (root == null) {
            return 0;
        }
        int left = isBalanced2(root.lnode);
        int right = isBalanced2(root.rnode);
        if (left != -1 && right != -1) {
            return 1 + (left > right ? left : right);
        }
        return -1;
    }


    /**
     * 这种方式存在重复递归的过程
     *
     * @param root
     * @return
     */
    boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int left = treeDepth(root.lnode);
        int right = treeDepth(root.rnode);
        if (Math.abs(left - right) != 1) {
            return false;
        }
        return isBalanced(root.lnode) && isBalanced(root.rnode);
    }

    int treeDepth(Node tree) {
        if (tree == null) {
            return 0;
        }
        int left = treeDepth(tree.lnode);
        int right = treeDepth(tree.rnode);
        return (left > right) ? (left + 1) : (right + 1);
    }
}
