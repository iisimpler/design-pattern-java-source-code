package Chapter_08_Bridge;

interface Implementor
{
	void operationImpl();
}

class ConcreteImplementor implements Implementor
{
	public void operationImpl()
	{
		//����ʵ��
	}
}

abstract class Abstraction
{
	protected Implementor impl;
	
	public void setImpl(Implementor impl)
	{
		this.impl=impl;
	}
	
	public abstract void operation();
}

class RefinedAbstraction extends Abstraction
{
	public void operation()
	{
		//����
		impl.operationImpl();
		//����
	}
}