package com.company.book2.lesson10_12.lesson10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task10 {
  private static final String PATH =
      "E:\\java\\tutorials\\homework\\HomeworksIT\\src\\com\\company\\book2\\lesson7_9\\lesson7\\Task7.xml";

  public static void main(String[] args) {

    File xmlFile = new File(PATH);
    try {
      Document xmlDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile);
      xmlDoc.getDocumentElement().normalize();
      NodeList nodeList = xmlDoc.getElementsByTagName("point");
      for (int i = 0; i < nodeList.getLength(); i++) {
        System.out.println(getPoint(nodeList.item(i)));
      }
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static String getTagValue(String tag, Element element) {
    NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
    Node node = nodeList.item(0);
    return node.getNodeValue();
  }

  private static Point getPoint(Node node) {
    Point point = new Point();
    if (node.getNodeType() == Node.ELEMENT_NODE) {
      Element element = (Element) node;
      point.unit = (getTagValue("unit", element));
      point.x = Integer.parseInt(getTagValue("x", element));
      point.y = Integer.parseInt(getTagValue("y", element));
    }

    return point;
  }

  public static class Point {
    private int x;
    private int y;
    private String unit;

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public String getUnit() {
      return unit;
    }

    public void setX(int x) {
      this.x = x;
    }

    public void setY(int y) {
      this.y = y;
    }

    public void setUnit(String unit) {
      this.unit = unit;
    }

    @Override
    public String toString() {
      return x + unit + ", " + y + unit;
    }
  }
}
