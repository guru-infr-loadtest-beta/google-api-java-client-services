/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for InAppProduct.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InAppProduct extends com.google.api.client.json.GenericJson {

  /**
   * The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLanguage;

  /**
   * Default price cannot be zero. In-app products can never be free. Default price is always in the
   * developer's Checkout merchant currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price defaultPrice;

  /**
   * Grace period of the subscription, specified in ISO 8601 format. It will allow developers to
   * give their subscribers a grace period when the payment for the new recurrence period is
   * declined. Acceptable values = "P3D" (three days), "P7D" (seven days), "P14D" (fourteen days),
   * and "P30D" (thirty days)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gracePeriod;

  /**
   * List of localized title and description data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, InAppProductListing> listings;

  /**
   * The package name of the parent app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Prices per buyer region. None of these prices should be zero. In-app products can never be
   * free.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Price> prices;

  /**
   * Purchase type enum value. Unmodifiable after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseType;

  /**
   * Whether or not the developer wants the specific subscription to be resubscribable. If the
   * developer doesn't use PBL2.0, this value is ignored since the feature is only for developers
   * using PBL2.0. This feature allows users to resubscribe to an expired subscription directly from
   * the subscription center by clicking on a "Resubscribe" CTA under the entry for the expired
   * subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resubscribeEligibility;

  /**
   * The stock-keeping-unit (SKU) of the product, unique within an app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sku;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week),
   * "P1M" (one month), "P3M" (three months), "P6M" (six months), and "P1Y" (one year).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionPeriod;

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven
   * days) and "P999D" (999 days). Seasonal subscriptions cannot have a trial period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trialPeriod;

  /**
   * The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB".
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLanguage() {
    return defaultLanguage;
  }

  /**
   * The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB".
   * @param defaultLanguage defaultLanguage or {@code null} for none
   */
  public InAppProduct setDefaultLanguage(java.lang.String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Default price cannot be zero. In-app products can never be free. Default price is always in the
   * developer's Checkout merchant currency.
   * @return value or {@code null} for none
   */
  public Price getDefaultPrice() {
    return defaultPrice;
  }

  /**
   * Default price cannot be zero. In-app products can never be free. Default price is always in the
   * developer's Checkout merchant currency.
   * @param defaultPrice defaultPrice or {@code null} for none
   */
  public InAppProduct setDefaultPrice(Price defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

  /**
   * Grace period of the subscription, specified in ISO 8601 format. It will allow developers to
   * give their subscribers a grace period when the payment for the new recurrence period is
   * declined. Acceptable values = "P3D" (three days), "P7D" (seven days), "P14D" (fourteen days),
   * and "P30D" (thirty days)
   * @return value or {@code null} for none
   */
  public java.lang.String getGracePeriod() {
    return gracePeriod;
  }

  /**
   * Grace period of the subscription, specified in ISO 8601 format. It will allow developers to
   * give their subscribers a grace period when the payment for the new recurrence period is
   * declined. Acceptable values = "P3D" (three days), "P7D" (seven days), "P14D" (fourteen days),
   * and "P30D" (thirty days)
   * @param gracePeriod gracePeriod or {@code null} for none
   */
  public InAppProduct setGracePeriod(java.lang.String gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

  /**
   * List of localized title and description data.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, InAppProductListing> getListings() {
    return listings;
  }

  /**
   * List of localized title and description data.
   * @param listings listings or {@code null} for none
   */
  public InAppProduct setListings(java.util.Map<String, InAppProductListing> listings) {
    this.listings = listings;
    return this;
  }

  /**
   * The package name of the parent app.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * The package name of the parent app.
   * @param packageName packageName or {@code null} for none
   */
  public InAppProduct setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Prices per buyer region. None of these prices should be zero. In-app products can never be
   * free.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Price> getPrices() {
    return prices;
  }

  /**
   * Prices per buyer region. None of these prices should be zero. In-app products can never be
   * free.
   * @param prices prices or {@code null} for none
   */
  public InAppProduct setPrices(java.util.Map<String, Price> prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Purchase type enum value. Unmodifiable after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseType() {
    return purchaseType;
  }

  /**
   * Purchase type enum value. Unmodifiable after creation.
   * @param purchaseType purchaseType or {@code null} for none
   */
  public InAppProduct setPurchaseType(java.lang.String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * Whether or not the developer wants the specific subscription to be resubscribable. If the
   * developer doesn't use PBL2.0, this value is ignored since the feature is only for developers
   * using PBL2.0. This feature allows users to resubscribe to an expired subscription directly from
   * the subscription center by clicking on a "Resubscribe" CTA under the entry for the expired
   * subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getResubscribeEligibility() {
    return resubscribeEligibility;
  }

  /**
   * Whether or not the developer wants the specific subscription to be resubscribable. If the
   * developer doesn't use PBL2.0, this value is ignored since the feature is only for developers
   * using PBL2.0. This feature allows users to resubscribe to an expired subscription directly from
   * the subscription center by clicking on a "Resubscribe" CTA under the entry for the expired
   * subscription.
   * @param resubscribeEligibility resubscribeEligibility or {@code null} for none
   */
  public InAppProduct setResubscribeEligibility(java.lang.String resubscribeEligibility) {
    this.resubscribeEligibility = resubscribeEligibility;
    return this;
  }

  /**
   * The stock-keeping-unit (SKU) of the product, unique within an app.
   * @return value or {@code null} for none
   */
  public java.lang.String getSku() {
    return sku;
  }

  /**
   * The stock-keeping-unit (SKU) of the product, unique within an app.
   * @param sku sku or {@code null} for none
   */
  public InAppProduct setSku(java.lang.String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public InAppProduct setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week),
   * "P1M" (one month), "P3M" (three months), "P6M" (six months), and "P1Y" (one year).
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week),
   * "P1M" (one month), "P3M" (three months), "P6M" (six months), and "P1Y" (one year).
   * @param subscriptionPeriod subscriptionPeriod or {@code null} for none
   */
  public InAppProduct setSubscriptionPeriod(java.lang.String subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven
   * days) and "P999D" (999 days). Seasonal subscriptions cannot have a trial period.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrialPeriod() {
    return trialPeriod;
  }

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven
   * days) and "P999D" (999 days). Seasonal subscriptions cannot have a trial period.
   * @param trialPeriod trialPeriod or {@code null} for none
   */
  public InAppProduct setTrialPeriod(java.lang.String trialPeriod) {
    this.trialPeriod = trialPeriod;
    return this;
  }

  @Override
  public InAppProduct set(String fieldName, Object value) {
    return (InAppProduct) super.set(fieldName, value);
  }

  @Override
  public InAppProduct clone() {
    return (InAppProduct) super.clone();
  }

}
