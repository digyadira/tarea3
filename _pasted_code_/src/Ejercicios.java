
public class Ejercicios
{
	//devuelve la suma de x y y
	// Asta aqui no tube problemas con la suma estuvo super facil..
	static int sumar(int x, int y)
	{
		return x+y;
	}
	
	//devuelve la resta de x y y
	// Con la resta igual no tube problemas super facil...
	static int restar(int x, int y)
	{
		return x-y;
	}
	//devuelve la multiplicacion de x y y
	// con la multiplicacion igual facil...
	static int multiplicar(int x, int y)
	{
		return x*y;
	}
	
	//devuelve el residuo de x y y
	//ya con la divicion tube un error con el signo porqwue yo ponia una pleca y no era haci era con el signo del porcentaje ...
	static int residuo(int x, int y)
	{
		return x%y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	// aqui solo tenia que dividirlo entre dos e igualar pero solo ponia un signo igual y me tiraba error pero mi companero me ayudo en clase..
	static boolean esPar(int x)
	{
		
		return x % 2 == 0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	//me paso lo mismo que el anterior
	static boolean esMultiploDe3(int x)
	{
		return x%3==0;
	}
	
	//devuelve el numero mayor (x o y)
	// me costo un poco pero lo hice..
	static int getMayor(int x,int y)
	{
		if(x>y)
		return x ;
		else
			return y;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	//igual que le anterior
	static boolean esMayorDeEdad(int edad)
	{
		
		return edad>=18;
	}
	
	//devuelve true si x, y y z son pares
	// estaba ssuper facil..
	static boolean sonPares(int x, int y, int z)
	{
		return x%2==0  & y%2==0 & z%2==0;
	}
	
	//devuelve el numero mayor entre x, y y z
	// con el if me complique un poco pero lo hice..
	static int getMayorDe3(int x, int y, int z)
	{
		if(x>y & x>z)
		return x;
		if(y>x & y>z)
			return y;
		else
			return z;
		
	}
	
	public static void main(String[] args)
	{
		
	}
}
