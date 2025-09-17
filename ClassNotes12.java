//Author Jerald Huang
//Date 2025-09-17

public class ClassNotes12 {
    public static void main(String[] args) { 
        int i = 0; //keeps going till the while is false 
        while (i < 5) { 
        System.out.println(i); 
        i++; 
        }
//----------------------------------------------------------------------------------------------------
        for (int j = 0; j < 5; j++) //keeps going aka you know how many loops you want 
        {  
        System.out.println(j); 
        }   
//----------------------------------------------------------------------------------------------------
        int o = 0; 
        do 
        { 
        System.out.println(o); //runs at least once even though while is false 
        o++; 
        }
        while (o < 5); 
//----------------------------------------------------------------------------------------------------
        int sum = 0, j;
        for (j = 3; j <= 79; j++)
        {
        sum = sum + j;
        }          
        System.out.println(sum); //3157 
//----------------------------------------------------------------------------------------------------
    }
}
