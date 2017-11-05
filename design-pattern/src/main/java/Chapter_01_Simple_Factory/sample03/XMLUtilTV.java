package Chapter_01_Simple_Factory.sample03;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilTV {
    //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
    public static String getBrandName() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            String confPath = XMLUtilTV.class.getResource("").getPath() + "/configTV.xml";
            Document doc = builder.parse(new File(confPath));

            //获取包含品牌名称的文本节点
            NodeList nl = doc.getElementsByTagName("brandName");
            Node classNode = nl.item(0).getFirstChild();
            return classNode.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
