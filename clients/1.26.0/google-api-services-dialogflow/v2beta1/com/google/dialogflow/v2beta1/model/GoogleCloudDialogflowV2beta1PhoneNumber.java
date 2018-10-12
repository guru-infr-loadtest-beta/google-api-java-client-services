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

package com.google.dialogflow.v2beta1.model;

/**
 * Represents a phone number. `PhoneNumber` resources enable phone calls to be answered by
 * Dialogflow services and are added to a project through a `PhoneNumberOrder`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1PhoneNumber extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The conversation profile calls to this `PhoneNumber` should use. Format:
   * `projects//conversationProfiles/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationProfile;

  /**
   * Output only. The state of the `PhoneNumber`. Defaults to `ACTIVE`. `PhoneNumber` objects set to
   * `DELETE_REQUESTED` always decline incoming calls and can be removed completely within 30 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * Required. The unique identifier of this phone number. Format: `projects//phoneNumbers/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. An example of
   * a correctly formatted phone number: +15556767888.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * Optional. The conversation profile calls to this `PhoneNumber` should use. Format:
   * `projects//conversationProfiles/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationProfile() {
    return conversationProfile;
  }

  /**
   * Optional. The conversation profile calls to this `PhoneNumber` should use. Format:
   * `projects//conversationProfiles/`.
   * @param conversationProfile conversationProfile or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumber setConversationProfile(java.lang.String conversationProfile) {
    this.conversationProfile = conversationProfile;
    return this;
  }

  /**
   * Output only. The state of the `PhoneNumber`. Defaults to `ACTIVE`. `PhoneNumber` objects set to
   * `DELETE_REQUESTED` always decline incoming calls and can be removed completely within 30 days.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Output only. The state of the `PhoneNumber`. Defaults to `ACTIVE`. `PhoneNumber` objects set to
   * `DELETE_REQUESTED` always decline incoming calls and can be removed completely within 30 days.
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumber setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Required. The unique identifier of this phone number. Format: `projects//phoneNumbers/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of this phone number. Format: `projects//phoneNumbers/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumber setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. An example of
   * a correctly formatted phone number: +15556767888.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Output only. Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. An example of
   * a correctly formatted phone number: +15556767888.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumber setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1PhoneNumber set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1PhoneNumber) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1PhoneNumber clone() {
    return (GoogleCloudDialogflowV2beta1PhoneNumber) super.clone();
  }

}
