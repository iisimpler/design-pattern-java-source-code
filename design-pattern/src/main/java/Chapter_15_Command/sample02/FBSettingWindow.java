package Chapter_15_Command.sample02;

import java.util.ArrayList;

//功能键设置窗口类
public class FBSettingWindow {
    private String title; //窗口标题  
    //定义一个ArrayList来存储所有功能键  
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
    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton fb : functionButtons) {
            System.out.println(fb.getName());
        }
        System.out.println("------------------------------");
    }
}