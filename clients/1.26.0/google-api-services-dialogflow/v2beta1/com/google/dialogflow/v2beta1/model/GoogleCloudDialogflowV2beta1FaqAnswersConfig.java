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
 * Defines FAQ responses that a human agent assistant can provide.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1FaqAnswersConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Settings for knowledge base, Format: `projects//knowledgeBases/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String knowledgeBaseName;

  /**
   * Optional. Maximum number of results to return. If unset, defaults to 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxResults;

  /**
   * Required. Settings for knowledge base, Format: `projects//knowledgeBases/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKnowledgeBaseName() {
    return knowledgeBaseName;
  }

  /**
   * Required. Settings for knowledge base, Format: `projects//knowledgeBases/`.
   * @param knowledgeBaseName knowledgeBaseName or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1FaqAnswersConfig setKnowledgeBaseName(java.lang.String knowledgeBaseName) {
    this.knowledgeBaseName = knowledgeBaseName;
    return this;
  }

  /**
   * Optional. Maximum number of results to return. If unset, defaults to 10.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxResults() {
    return maxResults;
  }

  /**
   * Optional. Maximum number of results to return. If unset, defaults to 10.
   * @param maxResults maxResults or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1FaqAnswersConfig setMaxResults(java.lang.Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1FaqAnswersConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1FaqAnswersConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1FaqAnswersConfig clone() {
    return (GoogleCloudDialogflowV2beta1FaqAnswersConfig) super.clone();
  }

}
