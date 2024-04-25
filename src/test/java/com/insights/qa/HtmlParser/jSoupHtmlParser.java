package com.insights.qa.HtmlParser;


import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenny La on 11/10/15.
 */
public class jSoupHtmlParser {

    private static final Logger LOG = Logger.getLogger(jSoupHtmlParser.class);

    public static Document doc;
    public Connection connection;
    public String testUrl;

    public jSoupHtmlParser(String testUrl)
    {
        this.testUrl = testUrl;
        try
        {
            connection = Jsoup.connect(testUrl);
            doc = connection.userAgent("Mozilla").get();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * get the http response code while connecting to the test url.
     * @return int = the http response code
     */
    public int getHttpResponseCode()
    {
        return connection.response().statusCode();
    }

    /**
     * Given the tag name and parse the html with the tag name.
     * Return the number of the tags with the given name.
     * @param keywordToParse
     * @return int = number of the tags
     */
    public int getNumberOfTab(String keywordToParse){
        Elements parsedTag = null;

        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            parsedTag = docInner.select("ns1|" + keywordToParse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return parsedTag.size();
    }

    /**
     * Given the tag name and parse the html with the tag name.
     * Return the text value of the tag with the given name.
     * @param keywordToParse
     * @return String = text value of the tag
     */
    public String getElementTextValue(String keywordToParse){
        Elements parsedTag = null;
        String value = "";

        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            parsedTag = docInner.select("ns1|" + keywordToParse);

            //LOG.info("debug " + parsedTag);

            if (parsedTag.size() > 1)
            {
                //LOG.info("debug " + keywordToParse + " size " + parsedTag.size());

                for (int i = 0; i < parsedTag.size(); i++) {

                    if (i == 0)
                    {
                        //LOG.info("debug if " + keywordToParse + " size " + i);
                        value = parsedTag.get(0).text();
                    }
                    else if (value.equals(parsedTag.get(i).text()))
                    {
                        //LOG.info("debug else if " + keywordToParse + " size " + i);
                        value = parsedTag.get(i).text();
                    }
                }
            }
            else
            {
                value = parsedTag.text();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * Given the tag name and parse the html with the tag name.
     * Return the content of the tags with the given name in String.
     * @param keywordToParse
     * @return String = content of the tags
     */
    public List<String> getListofElementsText(String keywordToParse){
        List<String> ListofElementText = new ArrayList<String>();

        try {

            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            Elements parsedTag = docInner.select("ns1|" + keywordToParse);

            for (Element linkAttr : parsedTag) {
                ListofElementText.add(linkAttr.text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListofElementText;
    }

    public Elements getElements(String keywordToParse){
        Elements parsedTag = null;

        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            parsedTag = docInner.select("ns1|" + keywordToParse);

            //LOG.info("Debug tag contents: " + parsedTag.text());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parsedTag;
    }

    public List<String> getListOfElementsAttributeValues(String keywordToParse, String attrName){
        List<String> ListofAttrValues = new ArrayList<String>();

        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            Elements parsedTag = docInner.select("ns1|" + keywordToParse);

            for (Element linkAttr : parsedTag) {
                ListofAttrValues.add(linkAttr.attr(attrName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListofAttrValues;
    }

    public String getElementByAttributeValueText(String keywordToParse, String attrName, String attrValue) {
        String tagContent = "";
        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            Elements parsedTag = docInner.select("ns1|" + keywordToParse);

            for (Element link : parsedTag) {
                if (attrValue.equals(link.attr(attrName))) {
                    tagContent = link.text();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tagContent;
    }

    /**
     * Given the tag name and parse the html with the name.
     * Verify all the contents of the tags with the name are not empty.
     * Return true if non of them are empty.
     * @param keywordToParse
     * @return boolean
     */
    public boolean verify_all_the_contents_with_the_given_name_are_not_empty (String keywordToParse){
        Elements parsedTag = null;
        boolean ret = true;
        try {
            org.jsoup.nodes.Document docInner = Jsoup.parse(doc.outerHtml());
            parsedTag = docInner.select("ns1|" + keywordToParse);

            for(int i = 0; i < parsedTag.size(); i ++){
                //LOG.info("The content is: " + parsedTag.get(i).text());
                if(parsedTag.get(i).text().isEmpty())
                    ret = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * Given the metadata tag name and parse the html with the name.
     * Return the number of the metadata tags with the given name.
     * @param keywordToParse
     * @return int
     */
    public int parse_metatags_and_return_number_of_metatags(String keywordToParse){
        Elements parsedTag = null;
        try {
            parsedTag = doc.select("Metadata");
            parsedTag = parsedTag.get(0).select("search_metadata");
            parsedTag = parsedTag.get(0).select(keywordToParse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return parsedTag.size();
    }

    /**
     * Given the metadata tag name and parse the html with the name.
     * Return the content of the metadata tags with the given name in String.
     * @param keywordToParse
     * @return String
     */
    public String parse_metatags_and_return_content_of_metatags(String keywordToParse){
        Elements parsedTag = null;
        try {
            parsedTag = doc.select("Metadata");
            parsedTag = parsedTag.get(0).select("search_metadata");
            parsedTag = parsedTag.get(0).select(keywordToParse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return parsedTag.text();
    }
}