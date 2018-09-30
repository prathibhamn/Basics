package com.basics;

import java.util.concurrent.atomic.AtomicInteger;

public class SwapIntegersMisc
{

    public static void main(String[] args)
    {
        Integer a = 10;
        Integer b = 20;
        
        swap( new AtomicInteger( a ),new AtomicInteger( b ));

       // a = getItself(b, b = a);
        System.out.println( a.equals( 20 ) );
        
        System.out.println( b.equals( 10 ) );
    }
    
    public static int getItself(Integer itself, Integer dummy)
    {
        return itself;
    }
    
    public static void swap(AtomicInteger a, AtomicInteger b){
        int  temp= b.get() ;
       b.set(a.get());
       a.set( temp );
        // look mom, no tmp variables needed
       // a.set(b.getAndSet(a.get()));
    }
}


abstract class abc {
    
    public abc()
    {
        
    }
}


interface bcd
{
    public bcd()
    {
        
    }

}
