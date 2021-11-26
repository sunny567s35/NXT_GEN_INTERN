//unique elements
import java.util.Scanner;
public class unique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int freq = 1;
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] ar = new int[size];
        //intializing the array with elements
        for(int a=0;a<size;a++){ar[a] = sc.nextInt();}

        for(int i =0 ; i<size;i++){
            count =1;
            
            for(int j =i+1 ;j < size && ar[j] != 10000; j++ ){
                
                    if(ar[i] == ar[j]){
                        ar[j] = 10000;
                        freq++;

                    }
                
            }
            if( freq <2 && ar[i]!= 10000){
                System.out.println(ar[i]+" is unique !");
                freq =1 ;
            }
         else{freq =1;
        }
        
        }

    }
    
}
