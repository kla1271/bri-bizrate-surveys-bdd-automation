package com.insights.qa.HtmlParser;

import org.apache.log4j.Logger;

import javax.lang.model.util.Elements;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomHtmlParser {
    private static final Logger LOG = Logger.getLogger(jSoupHtmlParser.class);
    public Document doc;
    public String inputUrl;

    public DomHtmlParser (String keywordToParse)
    {
        this.inputUrl = keywordToParse;
        try
        {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputUrl);
            doc.getDocumentElement().normalize();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public NodeList getElements(String keywordToParse) {

        NodeList parsedTag;

        //LOG.info("Root Element: " + doc.getDocumentElement().getNodeName());
        parsedTag = doc.getElementsByTagName(keywordToParse);

        return parsedTag;
    }
}
