// checking whether a given array has duplicates 
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;
public class duplicate_1{
    public static void main(String[] args){
        boolean flag = true;
        
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int size = i.nextInt();
        
        System.out.println("Enter the array elements : ");
        
        //declaring the  array
        int[] a = new int[size];
        // initializig the array
        for(int j =0 ; j<size ; j++){
            a[j] = i.nextInt();
            }
        //checking for duplicates
        for(int k= 0 ;k<size-1;k++){
            for(int g =k+1;g<size;g++){
                if(a[k] == a[g]){
                    flag = false;
                    break;

                }
            }
        }
        if(flag == false){System.out.println("Found duplicates in the array !");}
        else{System.out.println("No duplicates found !!");}
    }
}