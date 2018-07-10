import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//2진 탐색 트
public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Node tree = null;

        while(sc.hasNextLine()){
            int k = Integer.valueOf(sc.nextLine());
            tree = insert(tree, k);
        }
        postOrder(tree);
    }

    static class Node{

        Node left,right;

        int data;

        Node(int data){
            this.data=data;
            left=right=null;
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
    //전위
    public static void preOrder(Node root) {

        if (root == null)

            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    //중위
    public static void inOrder(Node root) {

        if (root == null)

            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    //후위
   public static void postOrder(Node root) {

        if (root == null)

            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

}







