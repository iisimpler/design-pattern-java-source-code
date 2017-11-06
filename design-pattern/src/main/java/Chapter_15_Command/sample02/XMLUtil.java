package Chapter_15_Command.sample02;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ�����󣬿���ͨ�������Ĳ�ͬ���ز�ͬ�����ڵ�����Ӧ��ʵ��  
    public static Object getBean(int i) {  
        try {  
            //�����ĵ�����  
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            String confPath = XMLUtil.class.getResource("").getPath() + "/config.xml";
            Document doc = builder.parse(new File(confPath));

            //��ȡ�����������ı��ڵ�  
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = null;
            if (0 == i) {  
                classNode = nl.item(0).getFirstChild();  
            }  
            else {  
                classNode = nl.item(1).getFirstChild();  
            }   

            String cName = classNode.getNodeValue();  

            //ͨ����������ʵ�����󲢽��䷵��  
            Class c = Class.forName(cName);  
            Object obj = c.newInstance();  
            return obj;  
        }     
        catch(Exception e){  
            e.printStackTrace();  
            return null;  
        }  
    }  
}