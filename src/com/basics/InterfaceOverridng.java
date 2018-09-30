package com.basics;

public class InterfaceOverridng
{
    
   
    
    public static void main( String[] args )
    {
        B bObj = new B();
        bObj.m1();
        AB ab = (AB) new A();
        C c = new  C();
        A a =c;
        c.m2();
        a.m2();
         ( (AB) a ).m1();
        
         c.m1();
        //a.m1();
       
    }
}

interface AB
{
 int i=9;
    default int m1()
    {
        System.out.println( "from ab" );
        return 0;
    }

    void m2();
}

interface BA
{

    default int m1()
    {
        System.out.println( "from ba" );
        return 0;
    }
    
    void m2();

}

class A
{

    int m3()
    {
        System.out.println( "from m2" );
        return 2;
    }
    
   public void m2 ()
    {
        
    }

}

class C extends A implements AB {
 int i =20;
   
    
}
class B implements AB ,BA
{
    
    int i =20;

    @Override
    public int m1()
    {
       System.out.println( i );
       return 2;
    }
    
    
    public int m11()
    {
        // TODO Auto-generated method stub
        return BA.super.m1();
    }

    @Override
    public void m2()
    {
        // TODO Auto-generated method stub
        
    }
   
  
  

}