package Chapter_15_Command.sample02;

import java.util.ArrayList;

//���ܼ����ô�����
public class FBSettingWindow {
    private String title; //���ڱ���  
    //����һ��ArrayList���洢���й��ܼ�  
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {  
        this.title = title;  
    }  

    public void setTitle(String title) {  
        this.title = title;  
    }  

    public String getTitle() {  
        return this.title;  
    }  

    public void addFunctionButton(FunctionButton fb) {  
        functionButtons.add(fb);  
    }  

    public void removeFunctionButton(FunctionButton fb) {  
        functionButtons.remove(fb);  
    }
    //��ʾ���ڼ����ܼ�
    public void display() {
        System.out.println("��ʾ���ڣ�" + this.title);
        System.out.println("��ʾ���ܼ���");
        for (FunctionButton fb : functionButtons) {
            System.out.println(fb.getName());
        }
        System.out.println("------------------------------");
    }
}