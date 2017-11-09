package Chapter_24_Visitor.sample01;

public interface Product
{
	void accept(Visitor visitor);
}