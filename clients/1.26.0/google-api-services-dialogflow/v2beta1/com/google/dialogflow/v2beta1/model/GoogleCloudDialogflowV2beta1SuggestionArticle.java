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
 * Represents suggested article.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SuggestionArticle extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A map that contains metadata about the answer and the document from which it
   * originates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Output only. Article snippets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> snippets;

  /**
   * Output only. The article title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. The article URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Output only. A map that contains metadata about the answer and the document from which it
   * originates.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Output only. A map that contains metadata about the answer and the document from which it
   * originates.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionArticle setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Output only. Article snippets.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSnippets() {
    return snippets;
  }

  /**
   * Output only. Article snippets.
   * @param snippets snippets or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionArticle setSnippets(java.util.List<java.lang.String> snippets) {
    this.snippets = snippets;
    return this;
  }

  /**
   * Output only. The article title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Output only. The article title.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionArticle setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. The article URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Output only. The article URI.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestionArticle setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestionArticle set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SuggestionArticle) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestionArticle clone() {
    return (GoogleCloudDialogflowV2beta1SuggestionArticle) super.clone();
  }

}
