package com.company.book2.lesson10_12.lesson11;

import com.company.book2.lesson10_12.lesson10.Task10;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task11 {

  public static void main(String[] args) {
    List<Task10.Point> pointList = getPionts(PATH);

    for (Task10.Point point : pointList) {
      System.out.println(point);
    }
  }

  private static final String PATH =
      "E:\\java\\tutorials\\homework\\HomeworksIT\\src\\com\\company\\book2\\lesson7_9\\lesson7\\Task7.xml";

  public static ArrayList<Task10.Point> getPionts(String Path) {
    int indexOfArray = -1;
    boolean isX = false;
    boolean isY = false;
    boolean isUnit = false;
    ArrayList<Task10.Point> points = new ArrayList<>();

    try {
      XMLStreamReader xmlReader =
          XMLInputFactory.newFactory().createXMLStreamReader(new FileInputStream(Path));
      while (xmlReader.hasNext()) {
        int res = xmlReader.next();
        if (res == xmlReader.START_ELEMENT) {
          if ("point".equals(xmlReader.getLocalName())) {
            points.add(new Task10.Point());
            indexOfArray++;
          } else if ("x".equals(xmlReader.getLocalName())) {
            isX = true;
          } else if ("y".equals(xmlReader.getLocalName())) {
            isY = true;
          } else if ("unit".equals(xmlReader.getLocalName())) {
            isUnit = true;
          }
        } else if (res == xmlReader.CHARACTERS) {
          if (isX) {
            points.get(indexOfArray).setX(Integer.parseInt(xmlReader.getText()));
            isX = false;
          } else if (isY) {
            points.get(indexOfArray).setY(Integer.parseInt(xmlReader.getText()));
            isY = false;
          } else if (isUnit) {
            points.get(indexOfArray).setUnit(xmlReader.getText());
            isUnit = false;
          }
        }
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      e.printStackTrace();
    }
    return points;
  }
}
