package com.basics.inheritance;

public class InheritanceVariable
{

    public static void main( String[] args )
    {
        ParentVariable p = new ParentVariable();
        System.out.println( p.var );
        p.print();
        System.out.println( "---------------" );

        ChildVariable c = new ChildVariable();
        System.out.println( c.var );
        c.print();
        System.out.println( "---------------" );

        ParentVariable pc = new ChildVariable(); //(OR p = c)
        System.out.println( pc.var );
        pc.print();
        System.out.println( "---------------" );
    }
}

class ParentVariable
{
    public int var = 10;

    public ParentVariable getObject()
    {
        return new ParentVariable();
    }

    public void print()
    {
        int var = 20;

        System.out.println( "I am Parent 1:" + var );
        System.out.println( "I am Parent 2:" + this.var );
    }
}

class ChildVariable extends ParentVariable
{
    public int var = 30;

    public ChildVariable getObject()
    {
        return new ChildVariable();
    }

    public void print()
    {
        int var = 40;

        System.out.println( "I am Child 1:" + var );
        System.out.println( "I am Child 2:" + this.var );
        System.out.println( "I am Child 3:" + super.var );
    }
}