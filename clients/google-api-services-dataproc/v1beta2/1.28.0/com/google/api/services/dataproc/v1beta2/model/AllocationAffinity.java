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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * Allocation Affinity for consuming Zonal allocation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AllocationAffinity extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumeAllocationType;

  /**
   * Corresponds to the label key of Allocation resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Corresponds to the label values of allocation resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumeAllocationType() {
    return consumeAllocationType;
  }

  /**
   * @param consumeAllocationType consumeAllocationType or {@code null} for none
   */
  public AllocationAffinity setConsumeAllocationType(java.lang.String consumeAllocationType) {
    this.consumeAllocationType = consumeAllocationType;
    return this;
  }

  /**
   * Corresponds to the label key of Allocation resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Corresponds to the label key of Allocation resource.
   * @param key key or {@code null} for none
   */
  public AllocationAffinity setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Corresponds to the label values of allocation resource.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Corresponds to the label values of allocation resource.
   * @param values values or {@code null} for none
   */
  public AllocationAffinity setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public AllocationAffinity set(String fieldName, Object value) {
    return (AllocationAffinity) super.set(fieldName, value);
  }

  @Override
  public AllocationAffinity clone() {
    return (AllocationAffinity) super.clone();
  }

}