class Simple2
{
	int x;
	int getx()
	{
		return x;
	}
}
class Simple3 extends Simple2
{
	int y;
	int getx()
	{
		return y;
	}
}
public static void main(String[] args)
 {
	Simple2 s2= new Simple2();
	Simple3 s3= new Simple3();
	s2.x=5;
	s3.y=6;
	system.out.println(" "+s2.get());
	system.out.println(" "+s3.get());
}