public class HelloWorld // base de code de la semaine derniere
{
	static String employeeName = "Atangana";
	//Je déclare une variabe class/static de type String qui a pour valeur : Atangana
	
	static int ageUser = 32; 
	// Je déclare une variable static de type int qui a pour valeur : 32
	public static void main(String[] args)
	{
		char team = 'B';
		/*Je déclare une variable locale de type char avec pour valeur : B
		Contairement aux variable de static/class, la variable local char s'execute
		dans une méthode
		*/

		System.out.println("Employee : " + employeeName);
		System.out.println("Age : " + ageUser + " years");
		System.out.println("Team work : " + team);
		
	}
}
