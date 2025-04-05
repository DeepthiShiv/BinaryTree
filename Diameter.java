import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
     
     public static int height(Node root){
         if(root==null) return 0;
         int lh= height(root.left);
         int rh= height(root.right);
         return Math.max(lh, rh)+1;
     }
     //O(n^2) 
     public static int diameter(Node root){
         if(root==null) return 0;
         int leftDia= diameter(root.left);
         int leftH= height(root.left);
         int rightDia= diameter(root.right);
         int rightH= height(root.right);
         int selfDia= leftH+ rightH+1;
         return Math.max(selfDia, Math.max(leftDia,rightDia));
     }
     public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.left.right.right= new Node(6);
        root.left.right.right.right= new Node(7);
        root.right= new Node(3);
        System.out.print(diameter(root));
    
     }
    
    
}
