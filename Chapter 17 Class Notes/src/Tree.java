import java.util.ArrayList;
import java.util.List;

/**
    A tree in which each node has an arbitrary number of children.
*/
public class Tree
{
    private Node root;

    static class Node
    {
        public Object data;
        public List<Node> children;
        

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int total = 1;
            for(Node child: this.children){
                total += child.size();

            }
            return total;
        }
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        this.root = new Node();
        this.root.data = rootData;
        this.root.children = new ArrayList<>();

    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        this.root.children.add(subtree.root);

    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size() 
    {
        return this.root.size();
    }

    // Additional methods will be added in later sections.

    /*
     * A visitor whose visit method is called for each visted node during a tree traversal
     * 
     */
    public interface Visitor{
        /*
         * the visit method is called for each visited node
         * @param data: The data of the node being visited
         */
            void visit(Object data);

    
        }
        /*
         * Traverse this tree in preorder
         * @param v: The visitor to be invoked on each node
         * 
         */
        public void preorder(Visitor v){
            Tree.preorder(this.root, v);

        }
        /*
         * Traverse the tree with a given root in preorder
         * @param n: The root of the tree to traverse.
         * @param v: the vistitor to be invoked on each node.
         */
        private static void preorder(Node n, Visitor v){
            //basecase or reach the end then return 
            if(n == null){
                return;
            }
            v.visit(n.data);
            for(Node child: n.children){
                Tree.preorder(child,v);
                
            }
        }

    public void postorder(Visitor V){
        Tree.preorder(this.root,V);
    } 
    private static void postorder(Node n, Visitor v){
        if(n.children.size() == 0){
            System.out.println(n.data);
            return;
        }
        v.visit(n.data);
    
        for(Node child:n.children){
        Tree.preorder(child,v);
        }
        System.out.println(n.data);
        return;
    }
    public void depthFirst(){
        depthFirst(root);
    }
    public void depthFirst(Node current){
        System.out.println(current.data);
        if(current.children.size()==0){
            return;
        }

            for(Node child: current.children){
                depthFirst(child);
            }
        }
        }

