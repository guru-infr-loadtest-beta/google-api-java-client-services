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

package com.google.api.services.kgsearch.v1;

/**
 * Service definition for Kgsearch (v1).
 *
 * <p>
 * Searches the Google Knowledge Graph for entities.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/knowledge-graph/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link KgsearchRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Kgsearch extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.9 of the Knowledge Graph Search API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://kgsearch.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Kgsearch(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Kgsearch(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Entities collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Kgsearch kgsearch = new Kgsearch(...);}
   *   {@code Kgsearch.Entities.List request = kgsearch.entities().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Entities entities() {
    return new Entities();
  }

  /**
   * The "entities" collection of methods.
   */
  public class Entities {

    /**
     * Searches Knowledge Graph for entities that match the constraints. A list of matched entities will
     * be returned in response, which will be in JSON-LD format and compatible with http://schema.org
     *
     * Create a request for the method "entities.search".
     *
     * This request holds the parameters needed by the kgsearch server.  After setting any optional
     * parameters, call the {@link Search#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Search search() throws java.io.IOException {
      Search result = new Search();
      initialize(result);
      return result;
    }

    public class Search extends KgsearchRequest<com.google.api.services.kgsearch.v1.model.SearchResponse> {

      private static final String REST_PATH = "v1/entities:search";

      /**
       * Searches Knowledge Graph for entities that match the constraints. A list of matched entities
       * will be returned in response, which will be in JSON-LD format and compatible with
       * http://schema.org
       *
       * Create a request for the method "entities.search".
       *
       * This request holds the parameters needed by the the kgsearch server.  After setting any
       * optional parameters, call the {@link Search#execute()} method to invoke the remote operation.
       * <p> {@link
       * Search#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Search() {
        super(Kgsearch.this, "GET", REST_PATH, null, com.google.api.services.kgsearch.v1.model.SearchResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Search set$Xgafv(java.lang.String $Xgafv) {
        return (Search) super.set$Xgafv($Xgafv);
      }

      @Override
      public Search setAccessToken(java.lang.String accessToken) {
        return (Search) super.setAccessToken(accessToken);
      }

      @Override
      public Search setAlt(java.lang.String alt) {
        return (Search) super.setAlt(alt);
      }

      @Override
      public Search setCallback(java.lang.String callback) {
        return (Search) super.setCallback(callback);
      }

      @Override
      public Search setFields(java.lang.String fields) {
        return (Search) super.setFields(fields);
      }

      @Override
      public Search setKey(java.lang.String key) {
        return (Search) super.setKey(key);
      }

      @Override
      public Search setOauthToken(java.lang.String oauthToken) {
        return (Search) super.setOauthToken(oauthToken);
      }

      @Override
      public Search setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Search) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Search setQuotaUser(java.lang.String quotaUser) {
        return (Search) super.setQuotaUser(quotaUser);
      }

      @Override
      public Search setUploadType(java.lang.String uploadType) {
        return (Search) super.setUploadType(uploadType);
      }

      @Override
      public Search setUploadProtocol(java.lang.String uploadProtocol) {
        return (Search) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The list of entity id to be used for search instead of query string. To specify multiple
       * ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A=B
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> ids;

      /** The list of entity id to be used for search instead of query string. To specify multiple ids in the
     HTTP request, repeat the parameter in the URL as in ...?ids=A=B
       */
      public java.util.List<java.lang.String> getIds() {
        return ids;
      }

      /**
       * The list of entity id to be used for search instead of query string. To specify multiple
       * ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A=B
       */
      public Search setIds(java.util.List<java.lang.String> ids) {
        this.ids = ids;
        return this;
      }

      /** Enables indenting of json results. */
      @com.google.api.client.util.Key
      private java.lang.Boolean indent;

      /** Enables indenting of json results.
       */
      public java.lang.Boolean getIndent() {
        return indent;
      }

      /** Enables indenting of json results. */
      public Search setIndent(java.lang.Boolean indent) {
        this.indent = indent;
        return this;
      }

      /**
       * The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> languages;

      /** The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
       */
      public java.util.List<java.lang.String> getLanguages() {
        return languages;
      }

      /**
       * The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
       */
      public Search setLanguages(java.util.List<java.lang.String> languages) {
        this.languages = languages;
        return this;
      }

      /** Limits the number of entities to be returned. */
      @com.google.api.client.util.Key
      private java.lang.Integer limit;

      /** Limits the number of entities to be returned.
       */
      public java.lang.Integer getLimit() {
        return limit;
      }

      /** Limits the number of entities to be returned. */
      public Search setLimit(java.lang.Integer limit) {
        this.limit = limit;
        return this;
      }

      /** Enables prefix match against names and aliases of entities */
      @com.google.api.client.util.Key
      private java.lang.Boolean prefix;

      /** Enables prefix match against names and aliases of entities
       */
      public java.lang.Boolean getPrefix() {
        return prefix;
      }

      /** Enables prefix match against names and aliases of entities */
      public Search setPrefix(java.lang.Boolean prefix) {
        this.prefix = prefix;
        return this;
      }

      /** The literal query string for search. */
      @com.google.api.client.util.Key
      private java.lang.String query;

      /** The literal query string for search.
       */
      public java.lang.String getQuery() {
        return query;
      }

      /** The literal query string for search. */
      public Search setQuery(java.lang.String query) {
        this.query = query;
        return this;
      }

      /**
       * Restricts returned entities with these types, e.g. Person (as defined in
       * http://schema.org/Person). If multiple types are specified, returned entities will contain
       * one or more of these types.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> types;

      /** Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person).
     If multiple types are specified, returned entities will contain one or more of these types.
       */
      public java.util.List<java.lang.String> getTypes() {
        return types;
      }

      /**
       * Restricts returned entities with these types, e.g. Person (as defined in
       * http://schema.org/Person). If multiple types are specified, returned entities will contain
       * one or more of these types.
       */
      public Search setTypes(java.util.List<java.lang.String> types) {
        this.types = types;
        return this;
      }

      @Override
      public Search set(String parameterName, Object value) {
        return (Search) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Kgsearch}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Kgsearch}. */
    @Override
    public Kgsearch build() {
      return new Kgsearch(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link KgsearchRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setKgsearchRequestInitializer(
        KgsearchRequestInitializer kgsearchRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(kgsearchRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
