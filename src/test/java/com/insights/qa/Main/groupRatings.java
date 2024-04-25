package com.insights.qa.Main;

import com.insights.qa.HtmlParser.DomHtmlParser;
import com.insights.qa.Main.CalculatedResults.groupRatingsDb;
import com.insights.qa.Main.CalculatedResults.groupRatingsEndpointApi;
import com.insights.qa.model.tables.joinReviews;
import com.insights.qa.model.tables.reviewPercentSet;
import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

public class groupRatings {

    private static Logger LOG = Logger.getLogger(groupRatings.class);
    public static String ns1 = "ns1:";

    public static void setApiDimensionalAverages(DomHtmlParser apiEndpoint, String elementTag) {

        int numberOfChildElements = 0;
        int posEaseToFindCheck = 0;
        int posClearlyStatedChargesCheck = 0;
        int ffProductMetExpectationCheck = 0;
        int posLikelihoodToShopAgainCheck = 0;
        int posClarityOfInfoCheck = 0;
        int ffOrderTrackingCheck = 0;
        int posSelectionOfProductsCheck = 0;
        int sellerRatingCheck = 0;
        int posCheckoutCheck = 0;
        int posLookAndDesignCheck = 0;
        int ffReturnsProcessCheck = 0;
        int ffLikelihoodToRecommendCheck = 0;
        int ffOnTimeDeliveryCheck = 0;
        int posPricesRelativeToOthersCheck = 0;
        int ffOverallRatingCheck = 0;
        int posLikelihoodToRecommendCheck = 0;
        int ffCustomerSupportCheck = 0;
        int posOverallRatingCheck = 0;
        int ffProductAvailabilityCheck = 0;
        int posVarietyOfShippingCheck = 0;
        int posShippingChargesCheck = 0;
        int overallRatingCheck = 0;
        int ffLikelihoodToBuyAgainCheck = 0;

        String elementValue = ns1 + elementTag;
        NodeList nList = apiEndpoint.getElements(elementValue);

        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            Element eElement = (Element) nNode;
            LOG.info("************************************");
            LOG.info("Validating Averages: " + nNode.getNodeName());
            LOG.info("************************************");

            groupRatingsEndpointApi.setTotalAverageElements(eElement.getChildNodes().getLength());

            for (int ChildNum = 0; ChildNum < eElement.getChildNodes().getLength(); ChildNum++) {

                NodeList averageNodes = eElement.getChildNodes().item(ChildNum).getChildNodes();

                for (int ChildNumAverageIndex = 0; ChildNumAverageIndex < averageNodes.getLength(); ChildNumAverageIndex++) {
                    //LOG.info("debug: " + eElement.getChildNodes().item(j).getChildNodes().item(ChildNum).getNodeName());

                    String AverageElements = averageNodes.item(ChildNumAverageIndex).getNodeName();
                    String AverageEleValues = averageNodes.item(ChildNumAverageIndex).getTextContent();


                    //LOG.info(AverageElements + " : " + AverageEleValues + " " + ChildNumAverageIndex);

                    if (AverageEleValues.equals("posEaseToFind")) {
                        groupRatingsEndpointApi.setPosEaseToFind(AverageEleValues);
                        posEaseToFindCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posEaseToFindCheck != 0) {
                        groupRatingsEndpointApi.setPosEaseToFindValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posEaseToFindCheck != 0) {
                        groupRatingsEndpointApi.setPosEaseToFindCount(Integer.parseInt(AverageEleValues));
                        posEaseToFindCheck = 0;

                    } else if (AverageEleValues.equals("posClearlyStatedCharges")) {
                        groupRatingsEndpointApi.setPosClearlyStatedCharges(AverageEleValues);
                        posClearlyStatedChargesCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posClearlyStatedChargesCheck != 0) {
                        groupRatingsEndpointApi.setPosClearlyStatedChargesValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posClearlyStatedChargesCheck != 0) {
                        groupRatingsEndpointApi.setPosClearlyStatedChargesCount(Integer.parseInt(AverageEleValues));
                        posClearlyStatedChargesCheck = 0;

                    } else if (AverageEleValues.equals("ffProductMetExpectation")) {
                        groupRatingsEndpointApi.setFfProductMetExpectation(AverageEleValues);
                        ffProductMetExpectationCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffProductMetExpectationCheck != 0) {
                        groupRatingsEndpointApi.setFfProductMetExpectationValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffProductMetExpectationCheck != 0) {
                        groupRatingsEndpointApi.setFfProductMetExpectationCount(Integer.parseInt(AverageEleValues));
                        ffProductMetExpectationCheck = 0;

                    } else if (AverageEleValues.equals("posLikelihoodToShopAgain")) {
                        groupRatingsEndpointApi.setPosLikelihoodToShopAgain(AverageEleValues);
                        posLikelihoodToShopAgainCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posLikelihoodToShopAgainCheck != 0) {
                        groupRatingsEndpointApi.setPosLikelihoodToShopAgainValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posLikelihoodToShopAgainCheck != 0) {
                        groupRatingsEndpointApi.setPosLikelihoodToShopAgainCount(Integer.parseInt(AverageEleValues));
                        posLikelihoodToShopAgainCheck = 0;

                    } else if (AverageEleValues.equals("posClarityOfInfo")) {
                        groupRatingsEndpointApi.setPosClarityOfInfo(AverageEleValues);
                        posClarityOfInfoCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posClarityOfInfoCheck != 0) {
                        groupRatingsEndpointApi.setPosClarityOfInfoValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posClarityOfInfoCheck != 0) {
                        groupRatingsEndpointApi.setPosClarityOfInfoCount(Integer.parseInt(AverageEleValues));
                        posClarityOfInfoCheck = 0;

                    } else if (AverageEleValues.equals("ffOrderTracking")) {
                        groupRatingsEndpointApi.setFfOrderTracking(AverageEleValues);
                        ffOrderTrackingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffOrderTrackingCheck != 0) {
                        groupRatingsEndpointApi.setFfOrderTrackingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffOrderTrackingCheck != 0) {
                        groupRatingsEndpointApi.setFfOrderTrackingCount(Integer.parseInt(AverageEleValues));
                        ffOrderTrackingCheck = 0;

                    } else if (AverageEleValues.equals("posSelectionOfProducts")) {
                        groupRatingsEndpointApi.setPosSelectionOfProducts(AverageEleValues);
                        posSelectionOfProductsCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posSelectionOfProductsCheck != 0) {
                        groupRatingsEndpointApi.setPosSelectionOfProductsValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posSelectionOfProductsCheck != 0) {
                        groupRatingsEndpointApi.setPosSelectionOfProductsCount(Integer.parseInt(AverageEleValues));
                        posSelectionOfProductsCheck = 0;

                    } else if (AverageEleValues.equals("sellerRating")) {
                        groupRatingsEndpointApi.setSellerRating(AverageEleValues);
                        sellerRatingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && sellerRatingCheck != 0) {
                        groupRatingsEndpointApi.setSellerRatingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && sellerRatingCheck != 0) {
                        groupRatingsEndpointApi.setSellerRatingCount(Integer.parseInt(AverageEleValues));
                        sellerRatingCheck = 0;

                    } else if (AverageEleValues.equals("posCheckout")) {
                        groupRatingsEndpointApi.setPosCheckout(AverageEleValues);
                        posCheckoutCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posCheckoutCheck != 0) {
                        groupRatingsEndpointApi.setPosCheckoutValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posCheckoutCheck != 0) {
                        groupRatingsEndpointApi.setPosCheckoutCount(Integer.parseInt(AverageEleValues));
                        posCheckoutCheck = 0;

                    } else if (AverageEleValues.equals("posLookAndDesign")) {
                        groupRatingsEndpointApi.setPosLookAndDesign(AverageEleValues);
                        posLookAndDesignCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posLookAndDesignCheck != 0) {
                        groupRatingsEndpointApi.setPosLookAndDesignValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posLookAndDesignCheck != 0) {
                        groupRatingsEndpointApi.setPosLookAndDesignCount(Integer.parseInt(AverageEleValues));
                        posLookAndDesignCheck = 0;

                    } else if (AverageEleValues.equals("ffReturnsProcess")) {
                        groupRatingsEndpointApi.setFfOverallReturnProcess(AverageEleValues);
                        ffReturnsProcessCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffReturnsProcessCheck != 0) {
                        groupRatingsEndpointApi.setFfOverallReturnProcessValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffReturnsProcessCheck != 0) {
                        groupRatingsEndpointApi.setFfOverallReturnProcessCount(Integer.parseInt(AverageEleValues));
                        ffReturnsProcessCheck = 0;

                    } else if (AverageEleValues.equals("ffLikelihoodToRecommend")) {
                        groupRatingsEndpointApi.setFfLikelihoodToRecommend(AverageEleValues);
                        ffLikelihoodToRecommendCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffLikelihoodToRecommendCheck != 0) {
                        groupRatingsEndpointApi.setFfLikelihoodToRecommendValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffLikelihoodToRecommendCheck != 0) {
                        groupRatingsEndpointApi.setFfLikelihoodToRecommendCount(Integer.parseInt(AverageEleValues));
                        ffLikelihoodToRecommendCheck = 0;

                    } else if (AverageEleValues.equals("ffOnTimeDelivery")) {
                        groupRatingsEndpointApi.setFfOnTimeDelivery(AverageEleValues);
                        ffOnTimeDeliveryCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffOnTimeDeliveryCheck != 0) {
                        groupRatingsEndpointApi.setFfOnTimeDeliveryValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffOnTimeDeliveryCheck != 0) {
                        groupRatingsEndpointApi.setFfOnTimeDeliveryCount(Integer.parseInt(AverageEleValues));
                        ffOnTimeDeliveryCheck = 0;

                    } else if (AverageEleValues.equals("posPricesRelativeToOthers")) {
                        groupRatingsEndpointApi.setPosPricesRelativeToOthers(AverageEleValues);
                        posPricesRelativeToOthersCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posPricesRelativeToOthersCheck != 0) {
                        groupRatingsEndpointApi.setPosPricesRelativeToOthersValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posPricesRelativeToOthersCheck != 0) {
                        groupRatingsEndpointApi.setPosPricesRelativeToOthersCount(Integer.parseInt(AverageEleValues));
                        posPricesRelativeToOthersCheck = 0;

                    } else if (AverageEleValues.equals("ffOverallRating")) {
                        groupRatingsEndpointApi.setFfOverallRating(AverageEleValues);
                        ffOverallRatingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffOverallRatingCheck != 0) {
                        groupRatingsEndpointApi.setFfOverallRatingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffOverallRatingCheck != 0) {
                        groupRatingsEndpointApi.setFfOverallRatingCount(Integer.parseInt(AverageEleValues));
                        ffOverallRatingCheck = 0;

                    } else if (AverageEleValues.equals("posLikelihoodToRecommend")) {
                        groupRatingsEndpointApi.setPosLikelihoodToRecommend(AverageEleValues);
                        posLikelihoodToRecommendCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posLikelihoodToRecommendCheck != 0) {
                        groupRatingsEndpointApi.setPosLikelihoodToRecommendValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posLikelihoodToRecommendCheck != 0) {
                        groupRatingsEndpointApi.setPosLikelihoodToRecommendCount(Integer.parseInt(AverageEleValues));
                        posLikelihoodToRecommendCheck = 0;

                    } else if (AverageEleValues.equals("ffCustomerSupport")) {
                        groupRatingsEndpointApi.setFfCustomerSupport(AverageEleValues);
                        ffCustomerSupportCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffCustomerSupportCheck != 0) {
                        groupRatingsEndpointApi.setFfCustomerSupportValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffCustomerSupportCheck != 0) {
                        groupRatingsEndpointApi.setFfCustomerSupportCount(Integer.parseInt(AverageEleValues));
                        ffCustomerSupportCheck = 0;

                    } else if (AverageEleValues.equals("posOverallRating")) {
                        groupRatingsEndpointApi.setPosOverallRating(AverageEleValues);
                        posOverallRatingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posOverallRatingCheck != 0) {
                        groupRatingsEndpointApi.setPosOverallRatingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posOverallRatingCheck != 0) {
                        groupRatingsEndpointApi.setPosOverallRatingCount(Integer.parseInt(AverageEleValues));
                        posOverallRatingCheck = 0;

                    } else if (AverageEleValues.equals("ffProductAvailability")) {
                        groupRatingsEndpointApi.setFfProductAvailability(AverageEleValues);
                        ffProductAvailabilityCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffProductAvailabilityCheck != 0) {
                        groupRatingsEndpointApi.setFfProductAvailabilityValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffProductAvailabilityCheck != 0) {
                        groupRatingsEndpointApi.setFfProductAvailabilityCount(Integer.parseInt(AverageEleValues));
                        ffProductAvailabilityCheck = 0;

                    } else if (AverageEleValues.equals("posVarietyOfShipping")) {
                        groupRatingsEndpointApi.setPosVarietyOfShipping(AverageEleValues);
                        posVarietyOfShippingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posVarietyOfShippingCheck != 0) {
                        groupRatingsEndpointApi.setPosVarietyOfShippingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posVarietyOfShippingCheck != 0) {
                        groupRatingsEndpointApi.setPosVarietyOfShippingCount(Integer.parseInt(AverageEleValues));
                        posVarietyOfShippingCheck = 0;

                    } else if (AverageEleValues.equals("posShippingCharges")) {
                        groupRatingsEndpointApi.setPosShippingCharges(AverageEleValues);
                        posShippingChargesCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && posShippingChargesCheck != 0) {
                        groupRatingsEndpointApi.setPosShippingChargesValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && posShippingChargesCheck != 0) {
                        groupRatingsEndpointApi.setPosShippingChargesCount(Integer.parseInt(AverageEleValues));
                        posShippingChargesCheck = 0;
                    } else if (AverageEleValues.equals("overallRating")) {
                        groupRatingsEndpointApi.setOverallRating(AverageEleValues);
                        overallRatingCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && overallRatingCheck != 0) {
                        groupRatingsEndpointApi.setOverallRatingValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && overallRatingCheck != 0) {
                        groupRatingsEndpointApi.setOverallRatingCount(Integer.parseInt(AverageEleValues));
                        overallRatingCheck = 0;

                    } else if (AverageEleValues.equals("ffLikelihoodToBuyAgain")) {
                        groupRatingsEndpointApi.setFfLikelihoodToBuyAgainValue(AverageEleValues);
                        ffLikelihoodToBuyAgainCheck = 1;
                    } else if (AverageElements.equals("ns1:Value") && ffLikelihoodToBuyAgainCheck != 0) {
                        groupRatingsEndpointApi.setFfLikelihoodToBuyAgainValue(AverageEleValues);
                    } else if (AverageElements.equals("ns1:Count") && ffLikelihoodToBuyAgainCheck != 0) {
                        groupRatingsEndpointApi.setFfLikelihoodToBuyAgainCount(Integer.parseInt(AverageEleValues));
                        overallRatingCheck = 0;
                    }
                }
            }
        }
        //LOG.info(groupRatingsEndpointApi.getPosClearlyStatedCharges() + " " + groupRatingsEndpointApi.getPosClearlyStatedChargesValue() + " " + groupRatingsEndpointApi.getPosClearlyStatedChargesCount());
        //LOG.info(groupRatingsEndpointApi.getPosEaseToFind() + " " + groupRatingsEndpointApi.getPosEaseToFindValue() + " " + groupRatingsEndpointApi.getPosEaseToFindCount());
        //LOG.info(groupRatingsEndpointApi.getFfProductMetExpectation() + " " + groupRatingsEndpointApi.getFfProductMetExpectationValue() + " " + groupRatingsEndpointApi.getFfProductMetExpectationCount());
        //LOG.info(groupRatingsEndpointApi.getPosShippingCharges() + " " + groupRatingsEndpointApi.getPosShippingChargesValue() + " " + groupRatingsEndpointApi.getPosShippingChargesCount());

    }

    public static void calculateDatabaseAverages(List<joinReviews> ReviewRatingResults){

        String roundedAvg;

        for (int i = 0; i < ReviewRatingResults.size(); i++) {

            roundedAvg = format("%.1f",ReviewRatingResults.get(i).getAVERAGE());

            if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posEaseToFind")) {

                groupRatingsDb.setPosEaseToFindValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosEaseToFindValue());
                groupRatingsDb.setPosEaseToFindCount(groupRatingsDb.getPosEaseToFindCount() + ReviewRatingResults.get(i).getAVG_COUNT());
                //LOG.info("API: " + groupRatingsEndpointApi.getPosEaseToFindValue() + "|" + groupRatingsEndpointApi.getPosEaseToFindCount() + " DB: " + ReviewRatingResults.get(i).getAVERAGE() + "|" + ReviewRatingResults.get(i).getREVIEW_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffCustomerSupport")) {

                groupRatingsDb.setFfCustomerSupportValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfCustomerSupportValue());
                groupRatingsDb.setFfCustomerSupportCount(groupRatingsDb.getFfCustomerSupportCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffLikelihoodToBuyAgain")) {

                groupRatingsDb.setFfLikelihoodToBuyAgainValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfLikelihoodToBuyAgainValue());
                groupRatingsDb.setFfLikelihoodToBuyAgainCount(groupRatingsDb.getFfLikelihoodToBuyAgainCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffLikelihoodToRecommend")) {

                groupRatingsDb.setFfLikelihoodToRecommendValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfLikelihoodToRecommendValue());
                groupRatingsDb.setFfLikelihoodToRecommendCount(groupRatingsDb.getFfLikelihoodToRecommendCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffOnTimeDelivery")) {

                groupRatingsDb.setFfOnTimeDeliveryValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfOnTimeDeliveryValue());
                groupRatingsDb.setFfOnTimeDeliveryCount(groupRatingsDb.getFfOnTimeDeliveryCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffOrderTracking")) {

                groupRatingsDb.setFfOrderTrackingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfOrderTrackingValue());
                groupRatingsDb.setFfOrderTrackingCount(groupRatingsDb.getFfOrderTrackingCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffOverallRating")) {

                groupRatingsDb.setFfOverallRatingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfOverallRatingValue());
                groupRatingsDb.setFfOverallRatingCount(groupRatingsDb.getFfOverallRatingCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffOverallReturnProcess")) {

                groupRatingsDb.setFfOverallReturnProcessValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfOverallReturnProcessValue());
                groupRatingsDb.setFfOverallReturnProcessCount(groupRatingsDb.getFfOverallReturnProcessCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffProductAvailability")) {

                groupRatingsDb.setFfProductAvailabilityValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfProductAvailabilityValue());
                groupRatingsDb.setFfProductAvailabilityCount(groupRatingsDb.getFfProductAvailabilityCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("ffProductMetExpectation")) {

                groupRatingsDb.setFfProductMetExpectationValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getFfProductMetExpectationValue());
                groupRatingsDb.setFfProductMetExpectationCount(groupRatingsDb.getFfProductMetExpectationCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("overallRating")) {

                groupRatingsDb.setOverallRatingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getOverallRatingValue());
                groupRatingsDb.setOverallRatingCount(groupRatingsDb.getOverallRatingCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posCheckout")) {

                groupRatingsDb.setPosCheckoutValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosCheckoutValue());
                groupRatingsDb.setPosCheckoutCount(groupRatingsDb.getPosCheckoutCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posClarityOfInfo")) {

                groupRatingsDb.setPosClarityOfInfoValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosClarityOfInfoValue());
                groupRatingsDb.setPosClarityOfInfoCount(groupRatingsDb.getPosClarityOfInfoCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posClearlyStatedCharges")) {

                groupRatingsDb.setPosClearlyStatedChargesValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosClearlyStatedChargesValue());
                groupRatingsDb.setPosClearlyStatedChargesCount(groupRatingsDb.getPosClearlyStatedChargesCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posLikelihoodToRecommend")) {

                groupRatingsDb.setPosLikelihoodToRecommendValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosLikelihoodToRecommendValue());
                groupRatingsDb.setPosLikelihoodToRecommendCount(groupRatingsDb.getPosLikelihoodToRecommendCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posLikelihoodToShopAgain")) {

                groupRatingsDb.setPosLikelihoodToShopAgainValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosLikelihoodToShopAgainValue());
                groupRatingsDb.setPosLikelihoodToShopAgainCount(groupRatingsDb.getPosLikelihoodToShopAgainCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posLookAndDesign")) {

                groupRatingsDb.setPosLookAndDesignValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosLookAndDesignValue());
                groupRatingsDb.setPosLookAndDesignCount(groupRatingsDb.getPosLookAndDesignCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posOverallRating")) {

                groupRatingsDb.setPosOverallRatingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosOverallRatingValue());
                groupRatingsDb.setPosOverallRatingCount(groupRatingsDb.getPosOverallRatingCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posPricesRelativeToOthers")) {

                groupRatingsDb.setPosPricesRelativeToOthersValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosPricesRelativeToOthersValue());
                groupRatingsDb.setPosPricesRelativeToOthersCount(groupRatingsDb.getPosPricesRelativeToOthersCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posSelectionOfProducts")) {

                groupRatingsDb.setPosSelectionOfProductsValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosSelectionOfProductsValue());
                groupRatingsDb.setPosSelectionOfProductsCount(groupRatingsDb.getPosSelectionOfProductsCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posShippingCharges")) {

                groupRatingsDb.setPosShippingChargesValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosShippingChargesValue());
                groupRatingsDb.setPosShippingChargesCount(groupRatingsDb.getPosShippingChargesCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("posVarietyOfShipping")) {

                groupRatingsDb.setPosVarietyOfShippingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getPosVarietyOfShippingValue());
                groupRatingsDb.setPosVarietyOfShippingCount(groupRatingsDb.getPosVarietyOfShippingCount() + ReviewRatingResults.get(i).getAVG_COUNT());

            } else if (ReviewRatingResults.get(i).getQUESTION_KEY().equals("sellerRating")) {

                groupRatingsDb.setSellerRatingValue(Double.parseDouble(roundedAvg) * ReviewRatingResults.get(i).getAVG_COUNT() + groupRatingsDb.getSellerRatingValue());
                groupRatingsDb.setSellerRatingCount(groupRatingsDb.getSellerRatingCount() + ReviewRatingResults.get(i).getAVG_COUNT());
            }
        }
        groupRatingsDb.setPosEaseToFindValue(groupRatingsDb.getPosEaseToFindValue() / groupRatingsDb.getPosEaseToFindCount());
        groupRatingsDb.setFfCustomerSupportValue(groupRatingsDb.getFfCustomerSupportValue() / groupRatingsDb.getFfCustomerSupportCount());
        groupRatingsDb.setFfLikelihoodToBuyAgainValue(groupRatingsDb.getFfLikelihoodToBuyAgainValue() / groupRatingsDb.getFfLikelihoodToBuyAgainCount());
        groupRatingsDb.setFfLikelihoodToRecommendValue(groupRatingsDb.getFfLikelihoodToRecommendValue() / groupRatingsDb.getFfLikelihoodToRecommendCount());
        groupRatingsDb.setFfOnTimeDeliveryValue(groupRatingsDb.getFfOnTimeDeliveryValue() / groupRatingsDb.getFfOnTimeDeliveryCount());
        groupRatingsDb.setFfOrderTrackingValue(groupRatingsDb.getFfOrderTrackingValue() / groupRatingsDb.getFfOrderTrackingCount());
        groupRatingsDb.setFfOverallRatingValue(groupRatingsDb.getFfOverallRatingValue() / groupRatingsDb.getFfOverallRatingCount());
        groupRatingsDb.setFfOverallReturnProcessValue(groupRatingsDb.getFfOverallReturnProcessValue() / groupRatingsDb.getFfOverallReturnProcessCount());
        groupRatingsDb.setFfProductAvailabilityValue(groupRatingsDb.getFfProductAvailabilityValue() / groupRatingsDb.getFfProductAvailabilityCount());
        groupRatingsDb.setFfProductMetExpectationValue(groupRatingsDb.getFfProductMetExpectationValue() / groupRatingsDb.getFfProductMetExpectationCount());
        groupRatingsDb.setOverallRatingValue(groupRatingsDb.getOverallRatingValue() / groupRatingsDb.getOverallRatingCount());
        groupRatingsDb.setPosCheckoutValue(groupRatingsDb.getPosCheckoutValue() / groupRatingsDb.getPosCheckoutCount());
        groupRatingsDb.setPosClarityOfInfoValue(groupRatingsDb.getPosClarityOfInfoValue() / groupRatingsDb.getPosClarityOfInfoCount());
        groupRatingsDb.setPosClearlyStatedChargesValue(groupRatingsDb.getPosClearlyStatedChargesValue() / groupRatingsDb.getPosClearlyStatedChargesCount());
        groupRatingsDb.setPosLikelihoodToRecommendValue(groupRatingsDb.getPosLikelihoodToRecommendValue() / groupRatingsDb.getPosLikelihoodToRecommendCount());
        groupRatingsDb.setPosLikelihoodToShopAgainValue(groupRatingsDb.getPosLikelihoodToShopAgainValue() / groupRatingsDb.getPosLikelihoodToShopAgainCount());
        groupRatingsDb.setPosLookAndDesignValue(groupRatingsDb.getPosLookAndDesignValue() / groupRatingsDb.getPosLookAndDesignCount());
        groupRatingsDb.setPosOverallRatingValue(groupRatingsDb.getPosOverallRatingValue() / groupRatingsDb.getPosOverallRatingCount());
        groupRatingsDb.setPosPricesRelativeToOthersValue(groupRatingsDb.getPosPricesRelativeToOthersValue() / groupRatingsDb.getPosPricesRelativeToOthersCount());
        groupRatingsDb.setPosSelectionOfProductsValue(groupRatingsDb.getPosSelectionOfProductsValue() / groupRatingsDb.getPosSelectionOfProductsCount());
        groupRatingsDb.setPosShippingChargesValue(groupRatingsDb.getPosShippingChargesValue() / groupRatingsDb.getPosShippingChargesCount());
        groupRatingsDb.setPosVarietyOfShippingValue(groupRatingsDb.getPosVarietyOfShippingValue() / groupRatingsDb.getPosVarietyOfShippingCount());
        groupRatingsDb.setSellerRatingValue(groupRatingsDb.getSellerRatingValue() / groupRatingsDb.getSellerRatingCount());

    }

    public static void verifyAverages(List<joinReviews> QuestionKeys) {

        int i;
        int ElementCount = 0;

        for (i = 0 ; i < QuestionKeys.size(); i++) {

            String ApiEndpointResults = "";
            String DbResults = "";

            if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posEaseToFind")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosEaseToFindValue() + "|" + groupRatingsEndpointApi.getPosEaseToFindCount();
                DbResults = format("%.1f", groupRatingsDb.getPosEaseToFindValue()) + "|" + groupRatingsDb.getPosEaseToFindCount();
                assertEquals("posEaseToFind not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posEaseToFind) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posEaseToFind "  + groupRatingsDb.getPosEaseToFindValue() + "|" + groupRatingsDb.getPosEaseToFindCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosEaseToFindValue(0.0);
                groupRatingsDb.setPosEaseToFindCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("sellerRating")) {
                ApiEndpointResults = groupRatingsEndpointApi.getSellerRatingValue() + "|" + groupRatingsEndpointApi.getSellerRatingCount();
                DbResults = format("%.1f", groupRatingsDb.getSellerRatingValue()) + "|" + groupRatingsDb.getSellerRatingCount();
                assertEquals("sellerRating not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(sellerRating) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:sellerRating "  + groupRatingsDb.getSellerRatingValue() + "|" + groupRatingsDb.getSellerRatingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setSellerRatingValue(0.0);
                groupRatingsDb.setSellerRatingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posVarietyOfShipping")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosVarietyOfShippingValue() + "|" + groupRatingsEndpointApi.getPosVarietyOfShippingCount();
                DbResults = format("%.1f", groupRatingsDb.getPosVarietyOfShippingValue()) + "|" + groupRatingsDb.getPosVarietyOfShippingCount();
                assertEquals("posVarietyOfShipping not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posVarietyOfShipping) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posVarietyOfShipping "  + groupRatingsDb.getPosVarietyOfShippingValue() + "|" + groupRatingsDb.getPosVarietyOfShippingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosVarietyOfShippingValue(0.0);
                groupRatingsDb.setPosVarietyOfShippingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posShippingCharges")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosShippingChargesValue() + "|" + groupRatingsEndpointApi.getPosShippingChargesCount();
                DbResults = format("%.1f", groupRatingsDb.getPosShippingChargesValue()) + "|" + groupRatingsDb.getPosShippingChargesCount();
                assertEquals("posShippingCharges not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posShippingCharges) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posShippingCharges "  + groupRatingsDb.getPosShippingChargesValue() + "|" + groupRatingsDb.getPosShippingChargesCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosShippingChargesValue(0.0);
                groupRatingsDb.setPosShippingChargesCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posSelectionOfProducts")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosSelectionOfProductsValue() + "|" + groupRatingsEndpointApi.getPosSelectionOfProductsCount();
                DbResults = format("%.1f", groupRatingsDb.getPosSelectionOfProductsValue()) + "|" + groupRatingsDb.getPosSelectionOfProductsCount();
                assertEquals("posSelectionOfProducts not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posSelectionOfProducts) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posSelectionOfProducts "  + groupRatingsDb.getPosSelectionOfProductsValue() + "|" + groupRatingsDb.getPosSelectionOfProductsCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosSelectionOfProductsValue(0.0);
                groupRatingsDb.setPosSelectionOfProductsCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posPricesRelativeToOthers")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosPricesRelativeToOthersValue() + "|" + groupRatingsEndpointApi.getPosPricesRelativeToOthersCount();
                DbResults = format("%.1f", groupRatingsDb.getPosPricesRelativeToOthersValue()) + "|" + groupRatingsDb.getPosPricesRelativeToOthersCount();
                assertEquals("posPricesRelativeToOthers not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posPricesRelativeToOthers) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posPricesRelativeToOthers "  + groupRatingsDb.getPosPricesRelativeToOthersValue() + "|" + groupRatingsDb.getPosPricesRelativeToOthersCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosPricesRelativeToOthersValue(0.0);
                groupRatingsDb.setPosPricesRelativeToOthersCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posOverallRating")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosOverallRatingValue() + "|" + groupRatingsEndpointApi.getPosOverallRatingCount();
                DbResults = format("%.1f", groupRatingsDb.getPosOverallRatingValue()) + "|" + groupRatingsDb.getPosOverallRatingCount();
                assertEquals("posOverallRating not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posOverallRating) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posOverallRating "  + groupRatingsDb.getPosOverallRatingValue() + "|" + groupRatingsDb.getPosOverallRatingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosOverallRatingValue(0.0);
                groupRatingsDb.setPosOverallRatingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posLookAndDesign")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosLookAndDesignValue() + "|" + groupRatingsEndpointApi.getPosLookAndDesignCount();
                DbResults = format("%.1f", groupRatingsDb.getPosLookAndDesignValue()) + "|" + groupRatingsDb.getPosLookAndDesignCount();
                assertEquals("posLookAndDesign not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posLookAndDesign) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posLookAndDesign "  + groupRatingsDb.getPosLookAndDesignValue() + "|" + groupRatingsDb.getPosLookAndDesignCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosLookAndDesignValue(0.0);
                groupRatingsDb.setPosLookAndDesignCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posLikelihoodToShopAgain")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosLikelihoodToShopAgainValue() + "|" + groupRatingsEndpointApi.getPosLikelihoodToShopAgainCount();
                DbResults = format("%.1f", groupRatingsDb.getPosLikelihoodToShopAgainValue()) + "|" + groupRatingsDb.getPosLikelihoodToShopAgainCount();
                assertEquals("posLikelihoodToShopAgain not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posLikelihoodToShopAgain) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posLikelihoodToShopAgain "  + groupRatingsDb.getPosLikelihoodToShopAgainValue() + "|" + groupRatingsDb.getPosLikelihoodToShopAgainCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosLikelihoodToShopAgainValue(0.0);
                groupRatingsDb.setPosLikelihoodToShopAgainCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posLikelihoodToRecommend")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosLikelihoodToRecommendValue() + "|" + groupRatingsEndpointApi.getPosLikelihoodToRecommendCount();
                DbResults = format("%.1f", groupRatingsDb.getPosLikelihoodToRecommendValue()) + "|" + groupRatingsDb.getPosLikelihoodToRecommendCount();
                assertEquals("posLikelihoodToRecommend not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posLikelihoodToRecommend) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posLikelihoodToRecommend "  + groupRatingsDb.getPosLikelihoodToRecommendValue() + "|" + groupRatingsDb.getPosLikelihoodToRecommendCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosLikelihoodToRecommendValue(0.0);
                groupRatingsDb.setPosLikelihoodToRecommendCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posClearlyStatedCharges")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosClearlyStatedChargesValue() + "|" + groupRatingsEndpointApi.getPosClearlyStatedChargesCount();
                DbResults = format("%.1f", groupRatingsDb.getPosClearlyStatedChargesValue()) + "|" + groupRatingsDb.getPosClearlyStatedChargesCount();
                assertEquals("posClearlyStatedCharges not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posClearlyStatedCharges) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posClearlyStatedCharges "  + groupRatingsDb.getPosClearlyStatedChargesValue() + "|" + groupRatingsDb.getPosClearlyStatedChargesCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosClearlyStatedChargesValue(0.0);
                groupRatingsDb.setPosClearlyStatedChargesCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posClarityOfInfo")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosClarityOfInfoValue() + "|" + groupRatingsEndpointApi.getPosClarityOfInfoCount();
                DbResults = format("%.1f", groupRatingsDb.getPosClarityOfInfoValue()) + "|" + groupRatingsDb.getPosClarityOfInfoCount();
                assertEquals("posClarityOfInfo not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posClarityOfInfo) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posClarityOfInfo "  + groupRatingsDb.getPosClarityOfInfoValue() + "|" + groupRatingsDb.getPosClarityOfInfoCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosClarityOfInfoValue(0.0);
                groupRatingsDb.setPosClarityOfInfoCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("posCheckout")) {
                ApiEndpointResults = groupRatingsEndpointApi.getPosCheckoutValue() + "|" + groupRatingsEndpointApi.getPosCheckoutCount();
                DbResults = format("%.1f", groupRatingsDb.getPosCheckoutValue()) + "|" + groupRatingsDb.getPosCheckoutCount();
                assertEquals("posCheckout not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(posCheckout) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:posCheckout "  + groupRatingsDb.getPosCheckoutValue() + "|" + groupRatingsDb.getPosCheckoutCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setPosCheckoutValue(0.0);
                groupRatingsDb.setPosCheckoutCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffProductMetExpectation")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfProductMetExpectationValue() + "|" + groupRatingsEndpointApi.getFfProductMetExpectationCount();
                DbResults = format("%.1f", groupRatingsDb.getFfProductMetExpectationValue()) + "|" + groupRatingsDb.getFfProductMetExpectationCount();
                assertEquals("ffProductMetExpectation not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffProductMetExpectation) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffProductMetExpectation "  + groupRatingsDb.getFfProductMetExpectationValue() + "|" + groupRatingsDb.getFfProductMetExpectationCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfProductMetExpectationValue(0.0);
                groupRatingsDb.setFfProductMetExpectationCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffProductAvailability")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfProductAvailabilityValue() + "|" + groupRatingsEndpointApi.getFfProductAvailabilityCount();
                DbResults = format("%.1f", groupRatingsDb.getFfProductAvailabilityValue()) + "|" + groupRatingsDb.getFfProductAvailabilityCount();
                assertEquals("ffProductAvailability not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffProductAvailability) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffProductAvailability "  + groupRatingsDb.getFfProductAvailabilityValue() + "|" + groupRatingsDb.getFfProductAvailabilityCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfProductAvailabilityValue(0.0);
                groupRatingsDb.setFfProductAvailabilityCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffOverallReturnProcess")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfOverallReturnProcessValue() + "|" + groupRatingsEndpointApi.getFfOverallReturnProcessCount();
                DbResults = format("%.1f", groupRatingsDb.getFfOverallReturnProcessValue()) + "|" + groupRatingsDb.getFfOverallReturnProcessCount();
                assertEquals("ffOverallReturnProcess not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffOverallReturnProcess) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffOverallReturnProcess "  + groupRatingsDb.getFfOverallReturnProcessValue() + "|" + groupRatingsDb.getFfOverallReturnProcessCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfOverallReturnProcessValue(0.0);
                groupRatingsDb.setFfOverallReturnProcessCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffOverallRating")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfOverallRatingValue() + "|" + groupRatingsEndpointApi.getFfOverallRatingCount();
                DbResults = format("%.1f", groupRatingsDb.getFfOverallRatingValue()) + "|" + groupRatingsDb.getFfOverallRatingCount();
                assertEquals("ffOverallRating not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffOverallRating) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffOverallRating "  + groupRatingsDb.getFfOverallRatingValue() + "|" + groupRatingsDb.getFfOverallRatingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfOverallRatingValue(0.0);
                groupRatingsDb.setFfOverallRatingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffOrderTracking")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfOrderTrackingValue() + "|" + groupRatingsEndpointApi.getFfOrderTrackingCount();
                DbResults = format("%.1f", groupRatingsDb.getFfOrderTrackingValue()) + "|" + groupRatingsDb.getFfOrderTrackingCount();
                assertEquals("ffOrderTracking not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffOrderTracking) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffOrderTracking "  + groupRatingsDb.getFfOrderTrackingValue() + "|" + groupRatingsDb.getFfOrderTrackingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfOrderTrackingValue(0.0);
                groupRatingsDb.setFfOrderTrackingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffOnTimeDelivery")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfOnTimeDeliveryValue() + "|" + groupRatingsEndpointApi.getFfOnTimeDeliveryCount();
                DbResults = format("%.1f", groupRatingsDb.getFfOnTimeDeliveryValue()) + "|" + groupRatingsDb.getFfOnTimeDeliveryCount();
                assertEquals("ffOnTimeDelivery not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffOnTimeDelivery) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffOnTimeDelivery "  + groupRatingsDb.getFfOnTimeDeliveryValue() + "|" + groupRatingsDb.getFfOnTimeDeliveryCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfOnTimeDeliveryValue(0.0);
                groupRatingsDb.setFfOnTimeDeliveryCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffLikelihoodToRecommend")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfLikelihoodToRecommendValue() + "|" + groupRatingsEndpointApi.getFfLikelihoodToRecommendCount();
                DbResults = format("%.1f", groupRatingsDb.getFfLikelihoodToRecommendValue()) + "|" + groupRatingsDb.getFfLikelihoodToRecommendCount();
                //assertEquals("ffLikelihoodToRecommend not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffLikelihoodToRecommend) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffLikelihoodToRecommend "  + groupRatingsDb.getFfLikelihoodToRecommendValue() + "|" + groupRatingsDb.getFfLikelihoodToRecommendCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfLikelihoodToRecommendValue(0.0);
                groupRatingsDb.setFfLikelihoodToRecommendCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffCustomerSupport")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfCustomerSupportValue() + "|" + groupRatingsEndpointApi.getFfCustomerSupportCount();
                DbResults = format("%.1f", groupRatingsDb.getFfCustomerSupportValue()) + "|" + groupRatingsDb.getFfCustomerSupportCount();
                assertEquals("ffCustomerSupport not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffCustomerSupport) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffCustomerSupport "  + groupRatingsDb.getFfCustomerSupportValue() + "|" + groupRatingsDb.getFfCustomerSupportCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfCustomerSupportValue(0.0);
                groupRatingsDb.setFfCustomerSupportCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("overallRating")) {
                ApiEndpointResults = groupRatingsEndpointApi.getOverallRatingValue() + "|" + groupRatingsEndpointApi.getOverallRatingCount();
                DbResults = format("%.1f", groupRatingsDb.getOverallRatingValue()) + "|" + groupRatingsDb.getOverallRatingCount();
                assertEquals("overallRating not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(overallRating) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:overallRating "  + groupRatingsDb.getOverallRatingValue() + "|" + groupRatingsDb.getOverallRatingCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setOverallRatingValue(0.0);
                groupRatingsDb.setOverallRatingCount(0);

            } else if (QuestionKeys.get(i).getSINGLE_QUESTION_KEY().equals("ffLikelihoodToBuyAgain")) {
                ApiEndpointResults = groupRatingsEndpointApi.getFfLikelihoodToBuyAgainValue() + "|" + groupRatingsEndpointApi.getFfLikelihoodToBuyAgainCount();
                DbResults = format("%.1f", groupRatingsDb.getFfLikelihoodToBuyAgainValue()) + "|" + groupRatingsDb.getFfLikelihoodToBuyAgainCount();
                assertEquals("ffLikelihoodToBuyAgain not equals! ",ApiEndpointResults,DbResults);
                ElementCount++;
                LOG.info("(ffLikelihoodToBuyAgain) API: (" + ApiEndpointResults + ") DB: " + "(" + DbResults + ")");
                //LOG.info("Debug:ffLikelihoodToBuyAgain "  + groupRatingsDb.getFfLikelihoodToBuyAgainValue() + "|" + groupRatingsDb.getFfLikelihoodToBuyAgainCount());
                LOG.info("************************************\n" );
                groupRatingsDb.setFfLikelihoodToBuyAgainValue(0.0);
                groupRatingsDb.setFfLikelihoodToBuyAgainCount(0);

            }
        }
        assertEquals("Not all Question Key were validated ",QuestionKeys.size(),ElementCount);
        LOG.info("All " + QuestionKeys.size() + " Question Keys were verified! ");
        assertEquals(groupRatingsEndpointApi.getTotalAverageElements(),QuestionKeys.size());
        LOG.info("All " + groupRatingsEndpointApi.getTotalAverageElements() + " Averages were verfied");
        LOG.info("************************************\n" );
    }

    public static void setPercentages(DomHtmlParser apiEndpoint, String elementTag){

        int Positive90Check = 0;
        int Positive30Check = 0;
        int Postive7Check = 0;
        int Neutral90Check = 0;
        int Neutral30Check = 0;
        int Neutral7Check = 0;
        int Negative90Check = 0;
        int Negative30Check = 0;
        int Negative7Check = 0;

        String elementValue = ns1 + elementTag;
        NodeList nList = apiEndpoint.getElements(elementValue);

        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            Element eElement = (Element) nNode;
            LOG.info("************************************");
            LOG.info("Validating Percentages: " + nNode.getNodeName());
            LOG.info("************************************");

            groupRatingsEndpointApi.setTotalPercentageElements(eElement.getChildNodes().getLength());

            for (int ChildNum = 0; ChildNum < eElement.getChildNodes().getLength(); ChildNum++) {

                NodeList percentNodes = eElement.getChildNodes().item(ChildNum).getChildNodes();

                String percentType = percentNodes.item(0).getTextContent();
                String percentPeriod = percentNodes.item(1).getTextContent();

                if (percentType.equals("positive") && percentPeriod.equals("90"))
                {
                    groupRatingsEndpointApi.setPositive_90_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setPositiveCount_90_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("positive") && percentPeriod.equals("30")) {
                    groupRatingsEndpointApi.setPositive_30_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setPositiveCount_30_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("positive") && percentPeriod.equals("7")) {
                    groupRatingsEndpointApi.setPositive_7_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setPositiveCount_7_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("neutral") && percentPeriod.equals("90")) {
                    groupRatingsEndpointApi.setNeutral_90_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNeutralCount_90_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("neutral") && percentPeriod.equals("30")) {
                    groupRatingsEndpointApi.setNeutral_30_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNeutralCount_30_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("neutral") && percentPeriod.equals("7")) {
                    groupRatingsEndpointApi.setNeutral_7_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNeutralCount_7_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("negative") && percentPeriod.equals("90")) {
                    groupRatingsEndpointApi.setNegative_90_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNegativeCount_90_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("negative") && percentPeriod.equals("30")) {
                    groupRatingsEndpointApi.setNegative_30_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNegativeCount_30_days(percentNodes.item(3).getTextContent());

                } else if (percentType.equals("negative") && percentPeriod.equals("7")) {
                    groupRatingsEndpointApi.setNegative_7_Percent(percentNodes.item(2).getTextContent());
                    groupRatingsEndpointApi.setNegativeCount_7_days(percentNodes.item(3).getTextContent());

                }
            }
        }
    }

    public static void calculateDatabasePercent(List<reviewPercentSet> ReviewPercentages ){

        for (int i = 0; i < ReviewPercentages.size(); i++) {

            if(ReviewPercentages.get(i).getPERIOD() == 90){

                groupRatingsDb.setPositiveCount_90_days(groupRatingsDb.getPositiveCount_90_days() + ReviewPercentages.get(i).getPOSITIVE_COUNT());
                groupRatingsDb.setNeutralCount_90_days(groupRatingsDb.getNeutralCount_90_days() + ReviewPercentages.get(i).getNEUTRAL_COUNT());
                groupRatingsDb.setNegativeCount_90_days(groupRatingsDb.getNegativeCount_90_days() + ReviewPercentages.get(i).getNEGATIVE_COUNT());

            } else if (ReviewPercentages.get(i).getPERIOD() == 30){

                groupRatingsDb.setPositiveCount_30_days(groupRatingsDb.getPositiveCount_30_days() + ReviewPercentages.get(i).getPOSITIVE_COUNT());
                groupRatingsDb.setNeutralCount_30_days(groupRatingsDb.getNeutralCount_30_days() + ReviewPercentages.get(i).getNEUTRAL_COUNT());
                groupRatingsDb.setNegativeCount_30_days(groupRatingsDb.getNegativeCount_30_days() + ReviewPercentages.get(i).getNEGATIVE_COUNT());

            } else if (ReviewPercentages.get(i).getPERIOD() == 7){

                groupRatingsDb.setPositiveCount_7_days(groupRatingsDb.getPositiveCount_7_days() + ReviewPercentages.get(i).getPOSITIVE_COUNT());
                groupRatingsDb.setNeutralCount_7_days(groupRatingsDb.getNeutralCount_7_days() + ReviewPercentages.get(i).getNEUTRAL_COUNT());
                groupRatingsDb.setNegativeCount_7_days(groupRatingsDb.getNegativeCount_7_days() + ReviewPercentages.get(i).getNEGATIVE_COUNT());

            }
        }
    }

    public static void verifyPercentages(){

        float pos90 = 0;
        float neutral90 = 0;
        float nega90 = 0;
        float pos30 = 0;
        float neutral30 = 0;
        float nega30 = 0;
        float pos7 = 0;
        float neutral7 = 0;
        float nega7 = 0;

        pos90 = (groupRatingsDb.getPositiveCount_90_days() * 100.0f) / (groupRatingsDb.getPositiveCount_90_days() +
                groupRatingsDb.getNeutralCount_90_days() + groupRatingsDb.getNegativeCount_90_days());

        neutral90 = (groupRatingsDb.getNeutralCount_90_days() * 100.0f) / (groupRatingsDb.getNeutralCount_90_days() +
                groupRatingsDb.getPositiveCount_90_days() + groupRatingsDb.getNegativeCount_90_days());

        nega90 = (groupRatingsDb.getNegativeCount_90_days() * 100.0f)/ (groupRatingsDb.getNegativeCount_90_days() +
                groupRatingsDb.getPositiveCount_90_days() + groupRatingsDb.getNeutralCount_90_days());

        pos30 = (groupRatingsDb.getPositiveCount_30_days() * 100.0f) / (groupRatingsDb.getPositiveCount_30_days() +
                groupRatingsDb.getNeutralCount_30_days() + groupRatingsDb.getNegativeCount_30_days());

        neutral30 = (groupRatingsDb.getNeutralCount_30_days() * 100.0f) / (groupRatingsDb.getNeutralCount_30_days() +
                groupRatingsDb.getPositiveCount_30_days() + groupRatingsDb.getNegativeCount_30_days());

        nega30 = (groupRatingsDb.getNegativeCount_30_days() * 100.0f)/ (groupRatingsDb.getNegativeCount_30_days() +
                groupRatingsDb.getPositiveCount_30_days() + groupRatingsDb.getNeutralCount_30_days());

        pos7 = (groupRatingsDb.getPositiveCount_7_days() * 100.0f) / (groupRatingsDb.getPositiveCount_7_days() +
                groupRatingsDb.getNeutralCount_7_days() + groupRatingsDb.getNegativeCount_7_days());

        neutral7 = (groupRatingsDb.getNeutralCount_7_days() * 100.0f) / (groupRatingsDb.getNeutralCount_7_days() +
                groupRatingsDb.getPositiveCount_7_days() + groupRatingsDb.getNegativeCount_7_days());

        nega7 = (groupRatingsDb.getNegativeCount_7_days() * 100.0f)/ (groupRatingsDb.getNegativeCount_7_days() +
                groupRatingsDb.getPositiveCount_7_days() + groupRatingsDb.getNeutralCount_7_days());

        assertEquals("Positive 90 Days Percent not equal! ", format("%.1f",pos90), groupRatingsEndpointApi.getPositive_90_Percent());
        LOG.info("Positive 90 Days Percent: " + format("%.1f",pos90) + " to " + groupRatingsEndpointApi.getPositive_90_Percent());
        assertEquals("Positive 90 Days Count not equal! ", (groupRatingsDb.getPositiveCount_90_days()).toString(),groupRatingsEndpointApi.getPositiveCount_90_days());
        LOG.info("Positive 90 Days Count: " + (groupRatingsDb.getPositiveCount_90_days()) + " to " + groupRatingsEndpointApi.getPositiveCount_90_days());
        LOG.info("************************************\n" );

        assertEquals("Neutral 90 Days Percent not equal! ", format("%.1f",neutral90), groupRatingsEndpointApi.getNeutral_90_Percent());
        LOG.info("Neutral 90 Days Percent: " + format("%.1f",neutral90) + " to " + groupRatingsEndpointApi.getNeutral_90_Percent());
        assertEquals("Neutral 90 Days Count not equal! ", (groupRatingsDb.getNeutralCount_90_days()).toString(),groupRatingsEndpointApi.getNeutralCount_90_days());
        LOG.info("Neutral 90 Days Count: " + groupRatingsDb.getNeutralCount_90_days() + " to " + groupRatingsEndpointApi.getNeutralCount_90_days());
        LOG.info("************************************\n" );

        assertEquals("Negative 90 Days Percent not equal! ", format("%.1f",nega90), groupRatingsEndpointApi.getNegative_90_Percent());
        LOG.info("Negative 90 Days Percent: " + format("%.1f",nega90) + " to " + groupRatingsEndpointApi.getNegative_90_Percent());
        assertEquals("Negative 90 Days Count not equal! ", (groupRatingsDb.getNegativeCount_90_days()).toString(),groupRatingsEndpointApi.getNegativeCount_90_days());
        LOG.info("Negative 90 Days Count: " + groupRatingsDb.getNegativeCount_90_days() + " to " + groupRatingsEndpointApi.getNegativeCount_90_days());
        LOG.info("************************************\n" );

        assertEquals("Positive 30 Days Percent not equal! ", format("%.1f",pos30), groupRatingsEndpointApi.getPositive_30_Percent());
        LOG.info("Positive 30 Days Percent: " + format("%.1f",pos30) + " to " + groupRatingsEndpointApi.getPositive_30_Percent());
        assertEquals("Positive 30 Days Count not equal! ", (groupRatingsDb.getPositiveCount_30_days()).toString(),groupRatingsEndpointApi.getPositiveCount_30_days());
        LOG.info("Positive 30 Days Count: " + (groupRatingsDb.getPositiveCount_30_days()) + " to " + groupRatingsEndpointApi.getPositiveCount_30_days());
        LOG.info("************************************\n" );

        assertEquals("Neutral 30 Days Percent not equal! ", format("%.1f",neutral30), groupRatingsEndpointApi.getNeutral_30_Percent());
        LOG.info("Neutral 30 Days Percent: " + format("%.1f",neutral30) + " to " + groupRatingsEndpointApi.getNeutral_30_Percent());
        assertEquals("Neutral 30 Days Count not equal! ", (groupRatingsDb.getNeutralCount_30_days()).toString(),groupRatingsEndpointApi.getNeutralCount_30_days());
        LOG.info("Neutral 30 Days Count: " + groupRatingsDb.getNeutralCount_30_days() + " to " + groupRatingsEndpointApi.getNeutralCount_30_days());
        LOG.info("************************************\n" );

        assertEquals("Negative 30 Days Percent not equal! ", format("%.1f",nega30), groupRatingsEndpointApi.getNegative_30_Percent());
        LOG.info("Negative 30 Days Percent: " + format("%.1f",nega30) + " to " + groupRatingsEndpointApi.getNegative_30_Percent());
        assertEquals("Negative 30 Days Count not equal! ", (groupRatingsDb.getNegativeCount_30_days()).toString(),groupRatingsEndpointApi.getNegativeCount_30_days());
        LOG.info("Negative 30 Days Count: " + groupRatingsDb.getNegativeCount_30_days() + " to " + groupRatingsEndpointApi.getNegativeCount_30_days());
        LOG.info("************************************\n" );

        assertEquals("Positive 7 Days Percent not equal! ", format("%.1f",pos7), groupRatingsEndpointApi.getPositive_7_Percent());
        LOG.info("Positive 7 Days Percent: " + format("%.1f",pos7) + " to " + groupRatingsEndpointApi.getPositive_7_Percent());
        assertEquals("Positive 7 Days Count not equal! ", (groupRatingsDb.getPositiveCount_7_days()).toString(),groupRatingsEndpointApi.getPositiveCount_7_days());
        LOG.info("Positive 7 Days Count: " + (groupRatingsDb.getPositiveCount_7_days()) + " to " + groupRatingsEndpointApi.getPositiveCount_7_days());
        LOG.info("************************************\n" );

        assertEquals("Neutral 7 Days Percent not equal! ", format("%.1f",neutral7), groupRatingsEndpointApi.getNeutral_7_Percent());
        LOG.info("Neutral 7 Days Percent: " + format("%.1f",neutral7) + " to " + groupRatingsEndpointApi.getNeutral_7_Percent());
        assertEquals("Neutral 7 Days Count not equal! ", (groupRatingsDb.getNeutralCount_7_days()).toString(),groupRatingsEndpointApi.getNeutralCount_7_days());
        LOG.info("Neutral 7 Days Count: " + groupRatingsDb.getNeutralCount_7_days() + " to " + groupRatingsEndpointApi.getNeutralCount_7_days());
        LOG.info("************************************\n" );

        assertEquals("Negative 7 Days Percent not equal! ", format("%.1f",nega7), groupRatingsEndpointApi.getNegative_7_Percent());
        LOG.info("Negative 7 Days Percent: " + format("%.1f",nega7) + " to " + groupRatingsEndpointApi.getNegative_7_Percent());
        assertEquals("Negative 7 Count not equal! ", (groupRatingsDb.getNegativeCount_7_days()).toString(),groupRatingsEndpointApi.getNegativeCount_7_days());
        LOG.info("Negative 7 Days Count: " + groupRatingsDb.getNegativeCount_7_days() + " to " + groupRatingsEndpointApi.getNegativeCount_7_days());
        LOG.info("************************************\n" );

        groupRatingsDb.setPositiveCount_90_days(0);
        groupRatingsDb.setNeutralCount_90_days(0);
        groupRatingsDb.setNegativeCount_90_days(0);
        groupRatingsDb.setPositiveCount_30_days(0);
        groupRatingsDb.setNeutralCount_30_days(0);
        groupRatingsDb.setNegativeCount_30_days(0);
        groupRatingsDb.setPositiveCount_7_days(0);
        groupRatingsDb.setNeutralCount_7_days(0);
        groupRatingsDb.setNegativeCount_7_days(0);

    }
}
