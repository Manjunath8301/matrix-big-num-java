import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Complete the code here
        System.out.println("enter size");
        int n=scan.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
         
        System.out.println("enter element");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter element");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j]=scan.nextInt();
            }
            System.out.println();
        }
            System.out.println("sum element");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=b[i][j]+a[i][j];
            }
        }
            for(int i=0;i<a.length;i++)
        {	 	  	 	     	  	    	   	     	   	 	
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
            
        }
        
       
   }
}