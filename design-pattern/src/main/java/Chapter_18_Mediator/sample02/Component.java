package Chapter_18_Mediator.sample02;

//��������ࣺ����ͬ����
abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //ת������  
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}  