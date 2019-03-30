package 第六章_面试中的各项能力;


import common.Node;

public class 二叉树的深度 {
    int treeDepth(Node tree) {
        if (tree == null) {
            return 0;
        }
        int left = treeDepth(tree.lnode);
        int right = treeDepth(tree.rnode);
        return (left > right) ? (left + 1) : (right + 1);
    }
}
