package Chapter_16_Interpreter.sample01;

public class MulNode extends SymbolNode
{
	public MulNode(Node left,Node right)
	{
		super(left,right);
	}
	
	public int interpret()
	{
		return super.left.interpret() * super.right.interpret();
	}
}