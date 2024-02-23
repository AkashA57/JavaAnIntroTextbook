package chat.eleven;

public class Demo {

	public static void main(String[] args) {
		System.out.println("The output is:");
        bar(123456);
        System.out.println();
}
public static void bar(int number)
{
if (number > 0)
{
int d = number % 10;
boolean even = (number / 10) % 2 == 0;
bar(number / 10);
if (even)
System.out.print(d / 2 + 4);
else
System.out.print(d / 2 + 3);
}
} }