package com.fis.lambda;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		CalculatorImpl myApp = new CalculatorImpl();
		System.out.println(myApp.add(10,20));
		
		//anonymous 
		Calculator c1 =new Calculator() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		//lamba type 1
		Calculator calc = (a,b)-> a+b;
		System.out.println(calc.add(50, 50));
		
		//lamba type 2
		Calculator calc1 = (a,b)-> {return a+b;};
		System.out.println(calc1.add(30, 30));
		
		//lamba type 3
		Calculator calc2 = (int a, int b)-> a+b;
		System.out.println(calc1.add(60,80));
	}

}
