package thirtyDaysOfCode.day23;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (nodeQueue.peek() != null){
            Node node = nodeQueue.remove();
            System.out.print(node.data);
            if(node.left != null){
                nodeQueue.add(node.left);
            }
            if(node.right != null){
                nodeQueue.add(node.right);
            }
            if (nodeQueue.peek() != null){
                System.out.print(" ");
            }
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}