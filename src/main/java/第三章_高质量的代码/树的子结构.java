package 第三章_高质量的代码;

import common.Node;

/**
 * 判断B是不是A的子树
 */
public class 树的子结构 {

    public boolean hasSubTree(Node root1,Node root2){
        if(root1==null || root2==null){
            return false;
        }
        boolean result=false;
        if(root1.data==root2.data){
            result=doesTree1HaveTree2(root1,root2);
        }
        if(!result){
            result=hasSubTree(root1.lnode,root2);
        }
        if(!result){
            result=hasSubTree(root1.rnode,root2);
        }
        return result;
    }

    private boolean doesTree1HaveTree2(Node root1, Node root2) {
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.data!=root2.data){
            return false;
        }
        return doesTree1HaveTree2(root1.lnode,root2.lnode) && doesTree1HaveTree2(root1.rnode,root2.rnode);
    }
}
