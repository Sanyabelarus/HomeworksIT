package com.company.book2.lesson10_12.lesson12;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

public class Task12 {
  public static final String PATHtoXSLT =
      "E:\\java\\tutorials\\homework\\HomeworksIT\\src\\com\\company\\book2\\lesson10_12\\lesson12\\task12.xsl";
  public static final String PATHtoXML =
      "E:\\java\\tutorials\\homework\\HomeworksIT\\src\\com\\company\\book2\\lesson7_9\\lesson7\\Task7.xml";

  public static void main(String[] args) {
    File HTMLresult = new File("List.html");
    try {
      HTMLresult.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      Transformer transformer =
          TransformerFactory.newInstance().newTransformer(new StreamSource(new File(PATHtoXSLT)));
      transformer.transform(new StreamSource(new File(PATHtoXML)), new StreamResult(HTMLresult));
    } catch (TransformerConfigurationException e) {
      e.printStackTrace();
    } catch (TransformerException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(HTMLresult.getCanonicalPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
