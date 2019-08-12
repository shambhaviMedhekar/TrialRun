package Test;

public class MainSingletonClassImplementation   
{  
    public static void main (String args[])  
    {  
        Singleton first = Singleton.getInstance();  
        System.out.println("First instance integer value:"+first.i);  
        first.i=first.i+90;  
        Singleton second = Singleton.getInstance();  
        System.out.println("Second instance integer value:"+second.i);  
    }  
} 