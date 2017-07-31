package org.sunnyslls.CodeArena;

import java.util.*;

class MirrorBinary {

    private static Node root;

    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t = 0; t < T; t++){
            root = null;
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = scanner.nextInt();
            }
            for(int i = 0; i < N; i++){
                createNode(arr[i]);
            }
            printFinalTree();
            System.out.println();
        }
    }

    private static void createNode(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left != null){
                queue.offer(temp.left);
            }else{
                temp.left = node;
                break;
            }if(temp.right != null){
                queue.offer(temp.right);
            }else{
                temp.right = node;
                break;
            }
        }
    }

    private static void printFinalTree(){
        if(root == null){
            return;
        }

        System.out.println(root);
        printRightTree(root.right);
        printLeftTree(root.left);
    }

    private static void printRightTree(Node node){
        if(node == null){
            return;
        }
        if(node.value > 0){
            System.out.println(node.value);
        }
        printRightTree(node.right);
    }

    private static void printLeftTree(Node node){
        if(node == null){
            return;
        }
        if(node.value > 0){
            System.out.println(node);
        }
        printLeftTree(node.left);
    }

    static class Node{
        int value;
        Node right;
        Node left;

        Node(int value){
            this.value = value;
        }

        public String toString(){
            return value+"";
        }
    }
}

