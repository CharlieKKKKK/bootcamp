package com.vtxlab.bootcamp;

/**
 * Hello world!
 *
 */
public class App 
{
    private String base;

    public String concat(String s){
        if(this.base == null)
          throw new IllegalAccessException();
        return this.base.concat(s);
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
