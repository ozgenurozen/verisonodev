







// ÖZGE NUR ÖZEN 02195076046




import java.util.Scanner;

class Node
{
    int data;
    Node left, right;
 
    Node(int data) {
        this.data = data;
    }
}
 
class Main
{
    
    private static int size(Node root)
    {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
 
    
    private static boolean isHeap(Node root, int i, int n)
    {
        // base case
        if (root == null) {
            return true;
        }
 
        
        if (i >= n) {
            return false;
        }
 
        
        if ((root.left != null && root.left.data <= root.data) ||
                    (root.right != null && root.right.data <= root.data)) {
            return false;
        }
 

        return isHeap(root.left, 2*i + 1, n) &&
            isHeap(root.right, 2*i + 2, n);
    }
 
    
    public static boolean isHeap(Node root)
    {
        int i = 0;
        return isHeap(root, i, size(root));
    }
 
    public static void main(String[] args)
    {
        
        
        int i, s = 0;
        int dizi[] = new int[10];

        Scanner sc = new Scanner(System.in);
 
        System.out.print("10 tane sayı girin :");
 
        for (i = 0; i < dizi.length; i++) {
            dizi[i] = sc.nextInt();
        }
 
        
        for (int sayi:dizi) {
            System.out.print(sayi+" ");
        }
        int x1 = dizi[0];
        int x2 = dizi[1];
        int x3 = dizi[2];
        int x4 = dizi[3];
        int x5 = dizi[4];
        int x6 = dizi[5];
        int x7 = dizi[6];
                
        Node root = new Node(x1);
        root.left = new Node(x2);
        root.right = new Node(x3);
        root.left.left = new Node(x4);
        root.left.right = new Node(x5);
        root.right.left = new Node(x6);
        root.right.right = new Node(x7);
 
        if (isHeap(root)) {
            System.out.print("++ min heap ++");
        }
        else {
            System.out.print(" -- min heap degil -- ");
        }
    }
}
