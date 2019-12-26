package com.gill;

// We cannot extend Captain class.The constructor is private in this case.
//class B extends Captain{}// error
public class Main {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2)
        {
            System.out.println("captain1 and captain2 are same instance.");
        }
    }
}
