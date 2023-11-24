/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mashalbutt
 */
class addition
{
    
    public static int add(int a,int b)
    {
        return a+b;
    }
     public static double add(double a,double b)
    {
        return a+b;
    }
      public static String add(String a,String b)
    {
     try
     {
         int n=Integer.parseInt(a);
         int m=Integer.parseInt(b);
         int r=m+n;
         String s=Integer.toString(r);
         return s;
        // return String.valueOf(n+m);
     }
      catch(NumberFormatException nfe)
              
              {
                 return "invalid string";
              }
    }
       public static int add(int [] a)
       {
           int sum=0;
           for(int n:a)
           {
               sum=sum+n;
           }
           return sum;
       }
      public static String add(String[] a)
    {
        try
        {
        int sum=0;
        for(String s:a)
        {
            int l=Integer.parseInt(s);
            sum=sum+l;
        }
        return String.valueOf(sum);
    }
        catch(NumberFormatException nfe)
                {
                     return "invalid string";
                }
}
}
class subtraction
{
    
    public static int subtract(int a,int b)
    {
        return a-b;
    }
     public static double subtract(double a,double b)
    {
        return a-b;
    }
      public static String subtract(String a,String b)
    {
     try
     {
         int n=Integer.parseInt(a);
         int m=Integer.parseInt(b);
         return String.valueOf(n-m);
     }
      catch(NumberFormatException nfe)
              
              {
                 return "invalid string";
              }
    }
       
   
}
class multiplication
{
    
    public static int multiplicatio(int a,int b)
    {
        return a*b;
    }
     public static double multiplicatio(double a,double b)
    {
        return a*b;
    }
      public static String multiplicatio(String a,String b)
    {
     try
     {
         int n=Integer.parseInt(a);
         int m=Integer.parseInt(b);
         return String.valueOf(n*m);
     }
      catch(NumberFormatException nfe)
              
              {
                 return "invalid string";
              }
    }
       public static int multiplicatio(int [] a)
       {
           int sum=1;
           for(int n:a)
           {
               sum=sum*n;
           }
           return sum;
       }
      public static String multiplicatio(String[] a)
    {
        try
        {
        int sum=1;
        for(String s:a)
        {
            int l=Integer.parseInt(s);
            sum=sum*l;
        }
        return String.valueOf(sum);
    }
        catch(NumberFormatException nfe)
                {
                     return "invalid string";
                }
}
}
class division
{
    
    public static int divide(int a,int b)
    {
        if(b==0)
        {
            System.out.println("dividing by 0 not possible");
            return 0;
        }
        return a/b;
    }
     public static double divide(double a,double b)
    {
        
        if(b==0)
        {
            System.out.println("dividing by 0 not possible");
            return 0;
        }
        return a/b;
    }
      public static String divide(String a,String b)
    {
          if(Integer.parseInt(b)==0)
        {
            System.out.println("dividing by 0 not possible");
            
        }
          else 
     try
     {
       
         int n=Integer.parseInt(a);
         int m=Integer.parseInt(b);
         return String.valueOf(n/m);
     }
      catch(NumberFormatException nfe)
              
              {
                 return "invalid string";
              }
        return String.valueOf(0);
    }   
}
public class Test {

    public static void main(String[] args) 
    { 
//        subtraction subtractObj = new subtraction(); 
//        multiplication multiplyObj = new multiplication(); 
//        division divideObj = new division(); 
//
//        System.out.println("the addition of integers is: " + addition.add(1, 2));
//        System.out.println("the addition of floats is: " + addition.add(1.0, 2.4));
//        System.out.println("the addition of strings is: " + addition.add("2", "4"));
//        int[] arr = {1, 2, 3};
//        System.out.println("the addition of int array  is: " + addition.add(arr));
//        String[] str = {"1", "2", "3"};
//        System.out.println("the addition of string array is: " + addition.add(str));
//
//        System.out.println("the subtraction of integers is: " + subtraction.subtract(1, 2));
//        System.out.println("the subtraction of floats is: " + subtractObj.subtract(1.0, 2.4));
//        System.out.println("the subtraction of strings is: " + subtractObj.subtract("2", "4"));
//
//        System.out.println("the multiplication of integers is: " + multiplyObj.multiplicatio(1, 2));
//        System.out.println("the multiplication of floats is: " + multiplyObj.multiplicatio(1.0, 2.4));
//        System.out.println("the multiplication of strings is: " + multiplyObj.multiplicatio("2", "4"));
//        System.out.println("the multiplication of int array  is: " + multiplyObj.multiplicatio(arr));
//        System.out.println("the multiplication of string array is: " + multiplyObj.multiplicatio(str));
//
//        System.out.println("the division of integers is: " + divideObj.divide(1, 2));
//        System.out.println("the division of floats is: " + divideObj.divide(1.0, 2.4));
//        System.out.println("the division of strings is: " + divideObj.divide("2", "4"));
    }
}





