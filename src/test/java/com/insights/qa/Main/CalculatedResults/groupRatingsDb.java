package com.insights.qa.Main.CalculatedResults;

public class groupRatingsDb {

    private static String Mid;
    private static String CountryCode;
    private static String posOverallRating;
    private static Double posOverallRatingValue = 0.0;
    private static Integer posOverallRatingCount = 0;
    private static String posLikelihoodToShopAgain;
    private static Double posLikelihoodToShopAgainValue = 0.0;
    private static Integer posLikelihoodToShopAgainCount = 0;
    private static String posLikelihoodToRecommend;
    private static Double posLikelihoodToRecommendValue  = 0.0;
    private static Integer posLikelihoodToRecommendCount = 0;
    private static String ffLikelihoodToRecommend;
    private static Double ffLikelihoodToRecommendValue = 0.0;
    private static Integer ffLikelihoodToRecommendCount = 0;
    private static String sellerRating;
    private static Double sellerRatingValue = 0.0;
    private static Integer sellerRatingCount = 0;
    private static String posEaseToFind;
    private static Integer posEaseToFindCount = 0;
    private static Double posEaseToFindValue = 0.0;
    private static String posLookAndDesign;
    private static Double posLookAndDesignValue  = 0.0;
    private static Integer posLookAndDesignCount = 0;
    private static String posCheckout;
    private static Double posCheckoutValue  = 0.0;
    private static Integer posCheckoutCount = 0;
    private static String posSelectionOfProducts;
    private static Double posSelectionOfProductsValue  = 0.0;
    private static Integer posSelectionOfProductsCount = 0;
    private static String posClarityOfInfo;
    private static Double posClarityOfInfoValue  = 0.0;
    private static Integer posClarityOfInfoCount = 0;
    private static String posClearlyStatedCharges;
    private static Double posClearlyStatedChargesValue = 0.0;
    private static Integer posClearlyStatedChargesCount = 0;
    private static String posPricesRelativeToOthers;
    private static Double posPricesRelativeToOthersValue = 0.0;
    private static Integer posPricesRelativeToOthersCount = 0;
    private static String posShippingCharges;
    private static Double posShippingChargesValue = 0.0;
    private static Integer posShippingChargesCount = 0;
    private static String posVarietyOfShipping;
    private static Double posVarietyOfShippingValue  = 0.0;
    private static Integer posVarietyOfShippingCount = 0;
    private static String ffOnTimeDelivery;
    private static Double ffOnTimeDeliveryValue = 0.0;
    private static Integer ffOnTimeDeliveryCount = 0;
    private static String ffOrderTracking;
    private static Double ffOrderTrackingValue = 0.0;
    private static Integer ffOrderTrackingCount = 0;
    private static String ffProductMetExpectation;
    private static Double ffProductMetExpectationValue = 0.0;
    private static Integer ffProductMetExpectationCount = 0;
    private static String ffCustomerSupport;
    private static Double ffCustomerSupportValue  = 0.0;
    private static Integer ffCustomerSupportCount = 0;
    private static String ffProductAvailability;
    private static Double ffProductAvailabilityValue = 0.0;
    private static Integer ffProductAvailabilityCount = 0;
    private static String ffOverallReturnProcess;
    private static Double ffOverallReturnProcessValue = 0.0;
    private static Integer ffOverallReturnProcessCount = 0;
    private static Integer PositiveCount_90_days = 0;
    private static Integer NeutralCount_90_days = 0;
    private static Integer NegativeCount_90_days = 0;
    private static Integer PositiveCount_30_days = 0;
    private static Integer NeutralCount_30_days = 0;
    private static Integer NegativeCount_30_days = 0;
    private static Integer PositiveCount_7_days = 0;
    private static Integer NeutralCount_7_days = 0;
    private static Integer NegativeCount_7_days = 0;
    private static String ffOverallRating;
    private static Double ffOverallRatingValue = 0.0;
    private static Integer ffOverallRatingCount = 0;
    private static String overallRating;
    private static Double overallRatingValue = 0.0;
    private static Integer overallRatingCount = 0;
    private static String ffLikelihoodToBuyAgain;
    private static Double ffLikelihoodToBuyAgainValue = 0.0;
    private static Integer ffLikelihoodToBuyAgainCount = 0;

    public static String getMid() {
        return Mid;
    }
    public static void setMid(String mid) {
        Mid = mid;
    }

    public static String getCountryCode() {
        return CountryCode;
    }
    public static void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public static String getPosOverallRating() {
        return posOverallRating;
    }
    public static void setPosOverallRating(String posOverallRating) {
        groupRatingsDb.posOverallRating = posOverallRating;
    }

    public static String getPosLikelihoodToRecommend() {
        return posLikelihoodToRecommend;
    }
    public static void setPosLikelihoodToRecommend(String posLikelihoodToRecommend) {
        groupRatingsDb.posLikelihoodToRecommend = posLikelihoodToRecommend;
    }


    public static String getFfOnTimeDelivery() {
        return ffOnTimeDelivery;
    }
    public static void setFfOnTimeDelivery(String ffOnTimeDelivery) {
        groupRatingsDb.ffOnTimeDelivery = ffOnTimeDelivery;
    }

    public static String getFfCustomerSupport() {
        return ffCustomerSupport;
    }
    public static void setFfCustomerSupport(String ffCustomerSupport) {
        groupRatingsDb.ffCustomerSupport = ffCustomerSupport;
    }

    public static String getFfOrderTracking() {
        return ffOrderTracking;
    }
    public static void setFfOrderTracking(String ffOrderTracking) {
        groupRatingsDb.ffOrderTracking = ffOrderTracking;
    }

    public static String getFfOverallReturnProcess() {
        return ffOverallReturnProcess;
    }
    public static void setFfOverallReturnProcess(String ffOverallReturnProcess) {
        groupRatingsDb.ffOverallReturnProcess = ffOverallReturnProcess;
    }

    public static String getFfProductAvailability() {
        return ffProductAvailability;
    }
    public static void setFfProductAvailability(String ffProductAvailability) {
        groupRatingsDb.ffProductAvailability = ffProductAvailability;
    }

    public static String getFfProductMetExpectation() {
        return ffProductMetExpectation;
    }
    public static void setFfProductMetExpectation(String ffProductMetExpectation) {
        groupRatingsDb.ffProductMetExpectation = ffProductMetExpectation;
    }

    public static String getPosCheckout() {
        return posCheckout;
    }
    public static void setPosCheckout(String posCheckout) {
        groupRatingsDb.posCheckout = posCheckout;
    }

    public static String getPosClarityOfInfo() {
        return posClarityOfInfo;
    }
    public static void setPosClarityOfInfo(String posClarityOfInfo) {
        groupRatingsDb.posClarityOfInfo = posClarityOfInfo;
    }

    public static String getPosClearlyStatedCharges() {
        return posClearlyStatedCharges;
    }
    public static void setPosClearlyStatedCharges(String posClearlyStatedCharges) {
        groupRatingsDb.posClearlyStatedCharges = posClearlyStatedCharges;
    }

    public static String getPosEaseToFind() {
        return posEaseToFind;
    }
    public static void setPosEaseToFind(String posEaseToFind) {
        groupRatingsDb.posEaseToFind = posEaseToFind;
    }

    public static Integer getPosEaseToFindCount(){return posEaseToFindCount;}
    public static void setPosEaseToFindCount(Integer posEaseToFindCount) {
        groupRatingsDb.posEaseToFindCount = posEaseToFindCount;
    }

    public static String getPosLookAndDesign() {
        return posLookAndDesign;
    }
    public static void setPosLookAndDesign(String posLookAndDesign) {
        groupRatingsDb.posLookAndDesign = posLookAndDesign;
    }

    public static String getPosPricesRelativeToOthers() {
        return posPricesRelativeToOthers;
    }
    public static void setPosPricesRelativeToOthers(String posPricesRelativeToOthers) {
        groupRatingsDb.posPricesRelativeToOthers = posPricesRelativeToOthers;
    }

    public static String getPosSelectionOfProducts() {
        return posSelectionOfProducts;
    }
    public static void setPosSelectionOfProducts(String posSelectionOfProducts) {
        groupRatingsDb.posSelectionOfProducts = posSelectionOfProducts;
    }

    public static String getPosShippingCharges() {
        return posShippingCharges;
    }
    public static void setPosShippingCharges(String posShippingCharges) {
        groupRatingsDb.posShippingCharges = posShippingCharges;
    }

    public static String getPosVarietyOfShipping() {
        return posVarietyOfShipping;
    }
    public static void setPosVarietyOfShipping(String posVarietyOfShipping) {
        groupRatingsDb.posVarietyOfShipping = posVarietyOfShipping;
    }

    public static String getPosLikelihoodToShopAgain() {
        return posLikelihoodToShopAgain;
    }
    public static void setPosLikelihoodToShopAgain(String posLikelihoodToShopAgain) {
        groupRatingsDb.posLikelihoodToShopAgain = posLikelihoodToShopAgain;
    }

    public static Integer getPositiveCount_90_days() {
        return PositiveCount_90_days;
    }
    public static void setPositiveCount_90_days(Integer positiveCount_90_days) {
        PositiveCount_90_days = positiveCount_90_days;
    }

    public static Integer getNeutralCount_90_days() {
        return NeutralCount_90_days;
    }
    public static void setNeutralCount_90_days(Integer neutralCount_90_days) {
        NeutralCount_90_days = neutralCount_90_days;
    }

    public static Integer getNegativeCount_90_days() { return NegativeCount_90_days;
    }
    public static void setNegativeCount_90_days(Integer negativeCount_90_days) {
        NegativeCount_90_days = negativeCount_90_days;
    }

    public static Integer getPositiveCount_30_days() {
        return PositiveCount_30_days;
    }
    public static void setPositiveCount_30_days(Integer positiveCount_30_days) {
        PositiveCount_30_days = positiveCount_30_days;
    }

    public static Integer getNegativeCount_30_days() {
        return NegativeCount_30_days;
    }
    public static void setNegativeCount_30_days(Integer negativeCount_30_days) {
        NegativeCount_30_days = negativeCount_30_days;
    }

    public static Integer getNeutralCount_30_days() {
        return NeutralCount_30_days;
    }
    public static void setNeutralCount_30_days(Integer neutralCount_30_days) {
        NeutralCount_30_days = neutralCount_30_days;
    }

    public static Integer getPositiveCount_7_days() {
        return PositiveCount_7_days;
    }
    public static void setPositiveCount_7_days(Integer positiveCount_7_days) {
        PositiveCount_7_days = positiveCount_7_days;
    }

    public static Integer getNegativeCount_7_days() {
        return NegativeCount_7_days;
    }
    public static void setNegativeCount_7_days(Integer negativeCount_7_days) {
        NegativeCount_7_days = negativeCount_7_days;
    }

    public static Integer getNeutralCount_7_days() {
        return NeutralCount_7_days;
    }
    public static void setNeutralCount_7_days(Integer neutralCount_7_days) {
        NeutralCount_7_days = neutralCount_7_days;
    }

    public static Integer getFfLikelihoodToRecommendCount() {
        return ffLikelihoodToRecommendCount;
    }

    public static void setFfLikelihoodToRecommendCount(Integer ffLikelihoodToRecommendCount) {
        groupRatingsDb.ffLikelihoodToRecommendCount = ffLikelihoodToRecommendCount;
    }

    public static Integer getPosLikelihoodToRecommendCount() {
        return posLikelihoodToRecommendCount;
    }

    public static void setPosLikelihoodToRecommendCount(Integer posLikelihoodToRecommendCount) {
        groupRatingsDb.posLikelihoodToRecommendCount = posLikelihoodToRecommendCount;
    }

    public static Integer getFfOnTimeDeliveryCount() {
        return ffOnTimeDeliveryCount;
    }

    public static void setFfOnTimeDeliveryCount(Integer ffOnTimeDeliveryCount) {
        groupRatingsDb.ffOnTimeDeliveryCount = ffOnTimeDeliveryCount;
    }

    public static Integer getFfOrderTrackingCount() {
        return ffOrderTrackingCount;
    }

    public static void setFfOrderTrackingCount(Integer ffOrderTrackingCount) {
        groupRatingsDb.ffOrderTrackingCount = ffOrderTrackingCount;
    }

    public static Integer getFfProductMetExpectationCount() {
        return ffProductMetExpectationCount;
    }

    public static void setFfProductMetExpectationCount(Integer ffProductMetExpectationCount) {
        groupRatingsDb.ffProductMetExpectationCount = ffProductMetExpectationCount;
    }

    public static Integer getPosCheckoutCount() {
        return posCheckoutCount;
    }

    public static void setPosCheckoutCount(Integer posCheckoutCount) {
        groupRatingsDb.posCheckoutCount = posCheckoutCount;
    }

    public static Integer getPosClarityOfInfoCount() {
        return posClarityOfInfoCount;
    }

    public static void setPosClarityOfInfoCount(Integer posClarityOfInfoCount) {
        groupRatingsDb.posClarityOfInfoCount = posClarityOfInfoCount;
    }

    public static Integer getPosClearlyStatedChargesCount() {
        return posClearlyStatedChargesCount;
    }

    public static void setPosClearlyStatedChargesCount(Integer posClearlyStatedChargesCount) {
        groupRatingsDb.posClearlyStatedChargesCount = posClearlyStatedChargesCount;
    }

    public static Integer getPosLikelihoodToShopAgainCount() {
        return posLikelihoodToShopAgainCount;
    }

    public static void setPosLikelihoodToShopAgainCount(Integer posLikelihoodToShopAgainCount) {
        groupRatingsDb.posLikelihoodToShopAgainCount = posLikelihoodToShopAgainCount;
    }

    public static Integer getPosLookAndDesignCount() {
        return posLookAndDesignCount;
    }

    public static void setPosLookAndDesignCount(Integer posLookAndDesignCount) {
        groupRatingsDb.posLookAndDesignCount = posLookAndDesignCount;
    }

    public static Integer getPosOverallRatingCount() {
        return posOverallRatingCount;
    }

    public static void setPosOverallRatingCount(Integer posOverallRatingCount) {
        groupRatingsDb.posOverallRatingCount = posOverallRatingCount;
    }

    public static Integer getPosSelectionOfProductsCount() {
        return posSelectionOfProductsCount;
    }

    public static void setPosSelectionOfProductsCount(Integer posSelectionOfProductsCount) {
        groupRatingsDb.posSelectionOfProductsCount = posSelectionOfProductsCount;
    }

    public static Integer getPosPricesRelativeToOthersCount() {
        return posPricesRelativeToOthersCount;
    }

    public static void setPosPricesRelativeToOthersCount(Integer posPricesRelativeToOthersCount) {
        groupRatingsDb.posPricesRelativeToOthersCount = posPricesRelativeToOthersCount;
    }

    public static Integer getPosShippingChargesCount() {
        return posShippingChargesCount;
    }

    public static void setPosShippingChargesCount(Integer posShippingChargesCount) {
        groupRatingsDb.posShippingChargesCount = posShippingChargesCount;
    }

    public static Integer getPosVarietyOfShippingCount() {
        return posVarietyOfShippingCount;
    }

    public static void setPosVarietyOfShippingCount(Integer posVarietyOfShippingCount) {
        groupRatingsDb.posVarietyOfShippingCount = posVarietyOfShippingCount;
    }

    public static Integer getSellerRatingCount() {
        return sellerRatingCount;
    }

    public static void setSellerRatingCount(Integer sellerRatingCount) {
        groupRatingsDb.sellerRatingCount = sellerRatingCount;
    }

    public static String getFfLikelihoodToRecommend() {
        return ffLikelihoodToRecommend;
    }

    public static void setFfLikelihoodToRecommend(String ffLikelihoodToRecommend) {
        groupRatingsDb.ffLikelihoodToRecommend = ffLikelihoodToRecommend;
    }

    public static String getSellerRating() {
        return sellerRating;
    }

    public static void setSellerRating(String sellerRating) {
        groupRatingsDb.sellerRating = sellerRating;
    }

    public static Integer getFfCustomerSupportCount() {
        return ffCustomerSupportCount;
    }

    public static void setFfCustomerSupportCount(Integer ffCustomerSupportCount) {
        groupRatingsDb.ffCustomerSupportCount = ffCustomerSupportCount;
    }

    public static Integer getFfOverallReturnProcessCount() {
        return ffOverallReturnProcessCount;
    }

    public static void setFfOverallReturnProcessCount(Integer ffOverallReturnProcessCount) {
        groupRatingsDb.ffOverallReturnProcessCount = ffOverallReturnProcessCount;
    }

    public static Integer getFfProductAvailabilityCount() {
        return ffProductAvailabilityCount;
    }

    public static void setFfProductAvailabilityCount(Integer ffProductAvailabilityCount) {
        groupRatingsDb.ffProductAvailabilityCount = ffProductAvailabilityCount;
    }

    public static Double getPosLikelihoodToRecommendValue() {
        return posLikelihoodToRecommendValue;
    }

    public static Double getPosOverallRatingValue() {
        return posOverallRatingValue;
    }

    public static Double getPosCheckoutValue() {
        return posCheckoutValue;
    }

    public static Double getPosClarityOfInfoValue() {
        return posClarityOfInfoValue;
    }

    public static Double getPosClearlyStatedChargesValue() {
        return posClearlyStatedChargesValue;
    }

    public static Double getPosEaseToFindValue() {
        return posEaseToFindValue;
    }

    public static Double getPosLookAndDesignValue() {
        return posLookAndDesignValue;
    }

    public static Double getPosPricesRelativeToOthersValue() {
        return posPricesRelativeToOthersValue;
    }

    public static Double getPosSelectionOfProductsValue() {
        return posSelectionOfProductsValue;
    }

    public static Double getSellerRatingValue() {
        return sellerRatingValue;
    }

    public static Double getPosShippingChargesValue() {
        return posShippingChargesValue;
    }

    public static Double getPosLikelihoodToShopAgainValue() {
        return posLikelihoodToShopAgainValue;
    }

    public static void setPosLikelihoodToRecommendValue(Double posLikelihoodToRecommendValue) {
        groupRatingsDb.posLikelihoodToRecommendValue = posLikelihoodToRecommendValue;
    }

    public static void setPosOverallRatingValue(Double posOverallRatingValue) {
        groupRatingsDb.posOverallRatingValue = posOverallRatingValue;
    }

    public static void setPosCheckoutValue(Double posCheckoutValue) {
        groupRatingsDb.posCheckoutValue = posCheckoutValue;
    }

    public static void setPosClarityOfInfoValue(Double posClarityOfInfoValue) {
        groupRatingsDb.posClarityOfInfoValue = posClarityOfInfoValue;
    }

    public static void setPosClearlyStatedChargesValue(Double posClearlyStatedChargesValue) {
        groupRatingsDb.posClearlyStatedChargesValue = posClearlyStatedChargesValue;
    }

    public static void setPosEaseToFindValue(Double posEaseToFindValue) {
        groupRatingsDb.posEaseToFindValue = posEaseToFindValue;
    }

    public static void setPosLookAndDesignValue(Double posLookAndDesignValue) {
        groupRatingsDb.posLookAndDesignValue = posLookAndDesignValue;
    }

    public static void setPosSelectionOfProductsValue(Double posSelectionOfProductsValue) {
        groupRatingsDb.posSelectionOfProductsValue = posSelectionOfProductsValue;
    }

    public static void setPosPricesRelativeToOthersValue(Double posPricesRelativeToOthersValue) {
        groupRatingsDb.posPricesRelativeToOthersValue = posPricesRelativeToOthersValue;
    }

    public static void setSellerRatingValue(Double sellerRatingValue) {
        groupRatingsDb.sellerRatingValue = sellerRatingValue;
    }

    public static void setPosLikelihoodToShopAgainValue(Double posLikelihoodToShopAgainValue) {
        groupRatingsDb.posLikelihoodToShopAgainValue = posLikelihoodToShopAgainValue;
    }

    public static Double getFfCustomerSupportValue() {
        return ffCustomerSupportValue;
    }

    public static void setPosShippingChargesValue(Double posShippingChargesValue) {
        groupRatingsDb.posShippingChargesValue = posShippingChargesValue;
    }

    public static Double getFfOnTimeDeliveryValue() {
        return ffOnTimeDeliveryValue;
    }

    public static Double getFfOrderTrackingValue() {
        return ffOrderTrackingValue;
    }

    public static Double getFfOverallReturnProcessValue() {
        return ffOverallReturnProcessValue;
    }

    public static Double getFfProductAvailabilityValue() {
        return ffProductAvailabilityValue;
    }

    public static Double getFfProductMetExpectationValue() {
        return ffProductMetExpectationValue;
    }

    public static Double getPosVarietyOfShippingValue() {
        return posVarietyOfShippingValue;
    }

    public static void setFfCustomerSupportValue(Double ffCustomerSupportValue) {
        groupRatingsDb.ffCustomerSupportValue = ffCustomerSupportValue;
    }

    public static void setFfOnTimeDeliveryValue(Double ffOnTimeDeliveryValue) {
        groupRatingsDb.ffOnTimeDeliveryValue = ffOnTimeDeliveryValue;
    }

    public static void setFfOrderTrackingValue(Double ffOrderTrackingValue) {
        groupRatingsDb.ffOrderTrackingValue = ffOrderTrackingValue;
    }

    public static void setFfOverallReturnProcessValue(Double ffOverallReturnProcessValue) {
        groupRatingsDb.ffOverallReturnProcessValue = ffOverallReturnProcessValue;
    }

    public static void setFfProductAvailabilityValue(Double ffProductAvailabilityValue) {
        groupRatingsDb.ffProductAvailabilityValue = ffProductAvailabilityValue;
    }

    public static void setFfProductMetExpectationValue(Double ffProductMetExpectationValue) {
        groupRatingsDb.ffProductMetExpectationValue = ffProductMetExpectationValue;
    }

    public static void setPosVarietyOfShippingValue(Double posVarietyOfShippingValue) {
        groupRatingsDb.posVarietyOfShippingValue = posVarietyOfShippingValue;
    }

    public static Double getFfLikelihoodToRecommendValue() {
        return ffLikelihoodToRecommendValue;
    }

    public static void setFfLikelihoodToRecommendValue(Double ffLikelihoodToRecommendValue) {
        groupRatingsDb.ffLikelihoodToRecommendValue = ffLikelihoodToRecommendValue;
    }

    public static Integer getFfOverallRatingCount() {
        return ffOverallRatingCount;
    }

    public static String getFfOverallRating() {
        return ffOverallRating;
    }

    public static Double getFfOverallRatingValue() {
        return ffOverallRatingValue;
    }

    public static void setFfOverallRating(String ffOverallRating) {
        groupRatingsDb.ffOverallRating = ffOverallRating;
    }

    public static void setFfOverallRatingCount(Integer ffOverallRatingCount) {
        groupRatingsDb.ffOverallRatingCount = ffOverallRatingCount;
    }

    public static void setFfOverallRatingValue(Double ffOverallRatingValue) {
        groupRatingsDb.ffOverallRatingValue = ffOverallRatingValue;
    }

    public static void setOverallRatingValue(Double overallRatingValue) {
        groupRatingsDb.overallRatingValue = overallRatingValue;
    }

    public static void setOverallRatingCount(Integer overallRatingCount) {
        groupRatingsDb.overallRatingCount = overallRatingCount;
    }

    public static void setOverallRating(String overallRating) {
        groupRatingsDb.overallRating = overallRating;
    }

    public static void setFfLikelihoodToBuyAgainValue(Double ffLikelihoodToBuyAgainValue) {
        groupRatingsDb.ffLikelihoodToBuyAgainValue = ffLikelihoodToBuyAgainValue;
    }

    public static void setFfLikelihoodToBuyAgainCount(Integer ffLikelihoodToBuyAgainCount) {
        groupRatingsDb.ffLikelihoodToBuyAgainCount = ffLikelihoodToBuyAgainCount;
    }

    public static void setFfLikelihoodToBuyAgain(String ffLikelihoodToBuyAgain) {
        groupRatingsDb.ffLikelihoodToBuyAgain = ffLikelihoodToBuyAgain;
    }

    public static String getOverallRating() {
        return overallRating;
    }

    public static String getFfLikelihoodToBuyAgain() {
        return ffLikelihoodToBuyAgain;
    }

    public static Integer getOverallRatingCount() {
        return overallRatingCount;
    }

    public static Integer getFfLikelihoodToBuyAgainCount() {
        return ffLikelihoodToBuyAgainCount;
    }

    public static Double getOverallRatingValue() {
        return overallRatingValue;
    }

    public static Double getFfLikelihoodToBuyAgainValue() {
        return ffLikelihoodToBuyAgainValue;
    }
}
