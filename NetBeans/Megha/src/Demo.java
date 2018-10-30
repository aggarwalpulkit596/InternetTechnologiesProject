/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
 class Demo {
    static void test(int a){
        try{
            if(a>10)
                throw new ArithmeticException("Demo");
            System.out.println("Exit");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            throw e;
        }
        finally{
            System.out.println("in test a="+a);
        }
    }
    public static void main(String args[]){
        try{
            test(10);
            test(20);
        }catch(Exception e){
            System.out.println("Caught");
        }
    }
}
