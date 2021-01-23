public class LesOperateurs {

	/*
	*Lab 1* Write a java programme to show case different operator
	*/

	public static void main(String[] args){
	
	int x = 100;
	int y = 15;
	int z = 200;
	int result = 0;
	
	// 1- les opérateur arithmétiques

	System.out.println("x + y: " + (x + y) );
	System.out.println("x - y: " + (x - y) );
	System.out.println("x * y: " + (x * y) );
	System.out.println("x / y: " + (x / y) );
	System.out.println("x % y: " + (x % y) );
	
	// 2- les opérateurs d'assignement =, +=, -=, *=, /=, %=
	
	y = x;
	System.out.println("= Résultat: "+y);

	x += y;
	System.out.println("+= Résultat: "+y);

	x -= y;
	System.out.println("-= Résultat: "+y);

	x *= y;
	System.out.println("*= Résultat: "+y);

	x /= y;
	System.out.println("/= Résultat: "+y);

	x %= y;
	System.out.println("%= Résultat: "+y);


	// 3- Opérateurs d'auto-incrémentation et d'auto-décrémentation

	x++;
	y--;
	System.out.println("a++ est: "+x);
	System.out.println("b-- est: "+y);
	
	
	// 4- Opérateurs de logique
	
	/*
	boolean b1 = true;
	boolean b1 = false;

	System.out.println("b1 && b1: " + (b1&&b2));
	System.out.println("b1 || b1: " + (b1||b2));
	System.out.println("!(b1 && b1): " + !(b1&&b2));
	*/
	
	// 5- Les opérateurs de comparaison (relationel) ==, !=, >, <, >=, <=
	
	/*
	*Lab 2* : write a method in Java that take three numbers (int) 
	and print the greatest number
	*/
	
	if(x >= y && x >= z)
	System.out.println(x);
	
	else if(y >= z && y >= x) 
	System.out.println(y);
	
	else //(z >= x && z >= y) 
	System.out.println(z);

	
	//6 - Les opérateurs de Bit
	
	/*
	result = x & y;
	System.out.prinln("x & y: "+result);
	
	result = x | y;
	System.out.println("x | y: "+result);

	result = x ^ y;
	System.out.println("x ^ y: "+result);

	result = ~x;
	System.out.println("~x: "+result);

	result = x << 2;
	System.out.println("x << 2: "+result); result = x;
	System.out.println("x >> 2: "+result);
	*/

	//7- Oprérateurs ternaire
	
	/*

	int x, y;
	x = 25;

	y = (x ==10) ? 100: 200;
	system.out.println("y: "+y);

	y = (x== 25) ? 100: 200;
	ystem.out.println( "y: "+y);
	*/

	}


}