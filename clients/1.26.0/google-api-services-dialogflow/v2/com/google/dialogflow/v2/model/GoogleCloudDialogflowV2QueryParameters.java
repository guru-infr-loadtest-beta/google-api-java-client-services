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

package com.google.dialogflow.v2.model;

/**
 * Represents the parameters of the conversational query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2QueryParameters extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The collection of contexts to be activated before this query is executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2Context> contexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2Context.class);
  }

  /**
   * Optional. The geo location of this conversational query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeLatLng geoLocation;

  /**
   * Optional. This field can be used to pass custom data into the webhook associated with the
   * agent. Arbitrary JSON objects are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. Specifies whether to delete all contexts in the current session before the new ones
   * are activated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean resetContexts;

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session of this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2SessionEntityType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2SessionEntityType.class);
  }

  /**
   * Optional. The time zone of this conversational query from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. If not
   * provided, the time zone specified in agent settings is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Optional. The collection of contexts to be activated before this query is executed.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2Context> getContexts() {
    return contexts;
  }

  /**
   * Optional. The collection of contexts to be activated before this query is executed.
   * @param contexts contexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setContexts(java.util.List<GoogleCloudDialogflowV2Context> contexts) {
    this.contexts = contexts;
    return this;
  }

  /**
   * Optional. The geo location of this conversational query.
   * @return value or {@code null} for none
   */
  public GoogleTypeLatLng getGeoLocation() {
    return geoLocation;
  }

  /**
   * Optional. The geo location of this conversational query.
   * @param geoLocation geoLocation or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setGeoLocation(GoogleTypeLatLng geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Optional. This field can be used to pass custom data into the webhook associated with the
   * agent. Arbitrary JSON objects are supported.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Optional. This field can be used to pass custom data into the webhook associated with the
   * agent. Arbitrary JSON objects are supported.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. Specifies whether to delete all contexts in the current session before the new ones
   * are activated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getResetContexts() {
    return resetContexts;
  }

  /**
   * Optional. Specifies whether to delete all contexts in the current session before the new ones
   * are activated.
   * @param resetContexts resetContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setResetContexts(java.lang.Boolean resetContexts) {
    this.resetContexts = resetContexts;
    return this;
  }

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session of this query.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2SessionEntityType> getSessionEntityTypes() {
    return sessionEntityTypes;
  }

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session of this query.
   * @param sessionEntityTypes sessionEntityTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setSessionEntityTypes(java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes) {
    this.sessionEntityTypes = sessionEntityTypes;
    return this;
  }

  /**
   * Optional. The time zone of this conversational query from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. If not
   * provided, the time zone specified in agent settings is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Optional. The time zone of this conversational query from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. If not
   * provided, the time zone specified in agent settings is used.
   * @param timeZone timeZone or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2QueryParameters set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2QueryParameters) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2QueryParameters clone() {
    return (GoogleCloudDialogflowV2QueryParameters) super.clone();
  }

}
