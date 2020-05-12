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

package com.google.api.services.books.v1.model;

/**
 * Model definition for Annotationsdata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Annotationsdata extends com.google.api.client.json.GenericJson {

  /**
   * A list of Annotation Data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeoAnnotationdata> items;

  /**
   * Resource type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The total number of volume annotations found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * A list of Annotation Data.
   * @return value or {@code null} for none
   */
  public java.util.List<GeoAnnotationdata> getItems() {
    return items;
  }

  /**
   * A list of Annotation Data.
   * @param items items or {@code null} for none
   */
  public Annotationsdata setItems(java.util.List<GeoAnnotationdata> items) {
    this.items = items;
    return this;
  }

  /**
   * Resource type
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type
   * @param kind kind or {@code null} for none
   */
  public Annotationsdata setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Annotationsdata setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The total number of volume annotations found.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * The total number of volume annotations found.
   * @param totalItems totalItems or {@code null} for none
   */
  public Annotationsdata setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public Annotationsdata set(String fieldName, Object value) {
    return (Annotationsdata) super.set(fieldName, value);
  }

  @Override
  public Annotationsdata clone() {
    return (Annotationsdata) super.clone();
  }

}
