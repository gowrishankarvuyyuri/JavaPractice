package basicprograms;

class Aa { }
class Bb extends Aa { }
class Cc extends Aa { }
class Dd extends Bb { }

public class TypeCasting_UserDefined {

	public static void main(String[] args) {
		
		//rule 1: conversion should be valid
		// the type ‘d’ and ‘C’ must have some relationship
		
			//valid as per Rule1
			/*
			A a = new B();
			C c = (C) a;
			*/
			
			//not valid as per Rule 1
			/*
			B b = new B();
			C c = (C) b;
			*/
		
		//rule 2: assignment should be valid
		//'C' must be either same or child of 'A'
		
			//valid as per Rule 2, Rule 1 
			/*
			A a = new B();
			C c = (C) a;
			A aa = (A) a;
			D d = (D) c;
			*/
		
			//not valid as per Rule2
			/*
			A a = new B();
			C c = (B) a;
			*/
		
		//rule 3 : underlying object of 'd' must be same or child of 'C'
			
			//valid as per Rule1, Rule2 and Rule3
			/*
			A a = new B();
			B b = (B) a;
			*/
			/*
			A a = new D();
			B b = (B) a;
			*/
	}

}
