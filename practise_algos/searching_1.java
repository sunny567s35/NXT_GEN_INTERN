import java.util.Scanner;
public class searching_1 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        int j=0;
        System.out.println("Enter the size of the array : ");
        
        int size = i.nextInt();
        System.out.println("Enter the key to be searched : ");
        int key = i.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[size];
        int count = 0;
        boolean flag = false;
        for(j=0;j<size;j++){
             arr[j] = i.nextInt();
            
        }
        for(j=0;j<size;j++){
            
            if( arr[j] == key){
                System.out.println("Element found at "+j+" index in the array !");
                flag = true;
                break;
            }
            else{count++;}
            
        }if(count==size-1 && flag == false){System.out.println("Element not found in the array !");}
            
       
    }
    
}
