package Chapter_19_Memoto.sample03;

import java.util.ArrayList;

class MementoCaretaker {
    //����һ���������洢�������¼  
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {  
        return (ChessmanMemento)mementolist.get(i);  
    }  

    public void setMemento(ChessmanMemento memento) {  
        mementolist.add(memento);  
    }  
}