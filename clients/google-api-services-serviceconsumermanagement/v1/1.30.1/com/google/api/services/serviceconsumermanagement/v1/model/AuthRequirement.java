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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * User-defined authentication requirements, including support for [JSON Web Token
 * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthRequirement extends com.google.api.client.json.GenericJson {

  /**
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in
   * all the runtime components.
   *
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audiences;

  /**
   * id from authentication provider.
   *
   * Example:
   *
   *     provider_id: bookstore_auth
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerId;

  /**
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in
   * all the runtime components.
   *
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @return value or {@code null} for none
   */
  public java.lang.String getAudiences() {
    return audiences;
  }

  /**
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in
   * all the runtime components.
   *
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @param audiences audiences or {@code null} for none
   */
  public AuthRequirement setAudiences(java.lang.String audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * id from authentication provider.
   *
   * Example:
   *
   *     provider_id: bookstore_auth
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderId() {
    return providerId;
  }

  /**
   * id from authentication provider.
   *
   * Example:
   *
   *     provider_id: bookstore_auth
   * @param providerId providerId or {@code null} for none
   */
  public AuthRequirement setProviderId(java.lang.String providerId) {
    this.providerId = providerId;
    return this;
  }

  @Override
  public AuthRequirement set(String fieldName, Object value) {
    return (AuthRequirement) super.set(fieldName, value);
  }

  @Override
  public AuthRequirement clone() {
    return (AuthRequirement) super.clone();
  }

}
