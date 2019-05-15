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

package com.google.api.services.run.v1alpha1.model;

/**
 * ListDomainMappingsResponse is a list of DomainMapping resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDomainMappingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call such as "v1alpha1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * List of DomainMappings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DomainMapping> items;

  static {
    // hack to force ProGuard to consider DomainMapping used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DomainMapping.class);
  }

  /**
   * The kind of this resource, in this case "DomainMappingList".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this DomainMapping list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListMeta metadata;

  /**
   * The API version for this call such as "v1alpha1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call such as "v1alpha1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public ListDomainMappingsResponse setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * List of DomainMappings.
   * @return value or {@code null} for none
   */
  public java.util.List<DomainMapping> getItems() {
    return items;
  }

  /**
   * List of DomainMappings.
   * @param items items or {@code null} for none
   */
  public ListDomainMappingsResponse setItems(java.util.List<DomainMapping> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of this resource, in this case "DomainMappingList".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this resource, in this case "DomainMappingList".
   * @param kind kind or {@code null} for none
   */
  public ListDomainMappingsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this DomainMapping list.
   * @return value or {@code null} for none
   */
  public ListMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this DomainMapping list.
   * @param metadata metadata or {@code null} for none
   */
  public ListDomainMappingsResponse setMetadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public ListDomainMappingsResponse set(String fieldName, Object value) {
    return (ListDomainMappingsResponse) super.set(fieldName, value);
  }

  @Override
  public ListDomainMappingsResponse clone() {
    return (ListDomainMappingsResponse) super.clone();
  }

}