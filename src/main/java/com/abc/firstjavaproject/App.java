package com.abc.firstjavaproject;

import com.abc.firstjavaproject.pojo.Cat;
import com.abc.firstjavaproject.pojo.Dog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int x = 10;
    	int y = 20;
    	
    /*	do {
    		System.out.println("Inside Do");
    	}while(false);
    	
    	do {
    		System.out.println("inside do, value of x is: "+x);
    		x++;
    	}while(x<=12);
    	
    	x = 10; */
    	
    	while(x<=12) {
    		if(x==11) {
    			x++;
    			continue;
    		}
    		System.out.println("inside while , value of x is: "+x);
    		x++;
    	}
    	
    	x = 10;
    	
    	for(;x<=12;) {
     		if(x==11) {
    			x++;
    			continue;
    		}
    		System.out.println("inside for, value of x is: "+x);
    		x++;
    	}
    	
//    	if(x==1) {
//    		System.out.println("value of x is 1");
//    	}
//    	else if(x==10) {
//    		System.out.println("value of x is 10");
//    	}
//    	else if (x==7) {
//    		System.out.println("value of x is 7");
//    	}
//    	else {
//    		System.out.println("I am in default case");
//    	}
//    	
//    	switch(x) {
//    		case 1:
//    			System.out.println("value of x is 1");
//    		break;	
//    		case 10:
//    		{
//    			System.out.println("value of x is 10");
//    		}
//    		break;
//    		case 7:
//    			System.out.println("value of x is 7");
//    		break;	
//    		default: 
//    			System.out.println("I am in default case");
//    		
//    	}
    	
    	/*int z = x+y;
    	int k = y/x;
    	boolean b1 = x==y;
    	boolean b2 = x>=10;
    	boolean b3 = b1 && b2;
    	boolean b4 = b1 || b2;
    	
    	for(int i=10;i<=15;i++) {
    		System.out.println("value of i is: "+i);
    		if(i==12) {
    			break;
    		}
    	}
    	
    	int[] arr = new int[3];
    	arr[0]=11;
    	arr[1]=12;
    	arr[2]=13;
    	
    	for(int i=0;i<arr.length; i++) {
    		System.out.println("value of arr at index "+i+" is: "+arr[i]);
    	}*/
    	
    	/*if(x!=y) {
    		System.out.println("Hello");
    	}
    	
    	if(x>=y) {
    		System.out.println("X is greater or equal to y");
    	}else {
    		System.out.println("Y is greater");
    	}
    	
    	if(b1) {
    		System.out.println("b1 is true");
    	}
    	
    	if(b3 || b4) {
    		System.out.println("either b3 or b4 is true");
    	} */
    	
    	
    	/* System.out.println(" z: "+ z+" k: "+k+" b1: " +b1+
    			" b2: "+b2+" b3: "+b3+" b4: "+b4);
    	
    	int val = x>=10?0:1;
    	
    	System.out.println("value is: "+ val);
    	
    	int[] arr = new int[3];
    	arr[0]=11;
    	arr[1]=12;
    	arr[2]=13;
    	System.out.println("value at index 2 is: " + arr[2]);
    	
    	Dog.height = 10;
    	
    	Dog myDog = new Dog();
    	myDog.setName("My Dog");
    	myDog.setColor("Red");
    	
    	
    	Dog yourDog = new Dog();
    	yourDog.setName("Your dog");
    	yourDog.setColor("Blue");
    	
    	System.out.println("Height : "+ Dog.height);
    	System.out.println("Height : "+ myDog.height);
    	System.out.println("Height : "+ yourDog.height);
    	
    	yourDog.eat();
    	
    	yourDog.makeSound();
    	
    	Cat myCat = new Cat();
    	myCat.makeSound();
    	
    	System.out.println("My dog name is: "+ myDog.getName());
    	
        System.out.println( "Hello World!" ); */
    }
}

