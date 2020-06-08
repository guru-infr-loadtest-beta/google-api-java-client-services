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

package com.google.api.services.file.v1beta1.model;

/**
 * NFS export options specifications.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NfsExportOptions extends com.google.api.client.json.GenericJson {

  /**
   * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for
   * allowing both read and write requests. The default is READ_WRITE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessMode;

  /**
   * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long anonGid;

  /**
   * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long anonUid;

  /**
   * List of either an IPv4 addresses in the format {octet 1}.{octet 2}.{octet 3}.{octet 4} or CIDR
   * ranges in the format {octet 1}.{octet 2}.{octet 3}.{octet 4}/{mask size} which may mount the
   * file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An
   * error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipRanges;

  /**
   * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for
   * not allowing root access. The default is NO_ROOT_SQUASH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String squashMode;

  /**
   * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for
   * allowing both read and write requests. The default is READ_WRITE.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessMode() {
    return accessMode;
  }

  /**
   * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for
   * allowing both read and write requests. The default is READ_WRITE.
   * @param accessMode accessMode or {@code null} for none
   */
  public NfsExportOptions setAccessMode(java.lang.String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnonGid() {
    return anonGid;
  }

  /**
   * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * @param anonGid anonGid or {@code null} for none
   */
  public NfsExportOptions setAnonGid(java.lang.Long anonGid) {
    this.anonGid = anonGid;
    return this;
  }

  /**
   * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnonUid() {
    return anonUid;
  }

  /**
   * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only
   * be set with squash_mode of ROOT_SQUASH.  An error will be returned if this field is specified
   * for other squash_mode settings.
   * @param anonUid anonUid or {@code null} for none
   */
  public NfsExportOptions setAnonUid(java.lang.Long anonUid) {
    this.anonUid = anonUid;
    return this;
  }

  /**
   * List of either an IPv4 addresses in the format {octet 1}.{octet 2}.{octet 3}.{octet 4} or CIDR
   * ranges in the format {octet 1}.{octet 2}.{octet 3}.{octet 4}/{mask size} which may mount the
   * file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An
   * error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpRanges() {
    return ipRanges;
  }

  /**
   * List of either an IPv4 addresses in the format {octet 1}.{octet 2}.{octet 3}.{octet 4} or CIDR
   * ranges in the format {octet 1}.{octet 2}.{octet 3}.{octet 4}/{mask size} which may mount the
   * file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An
   * error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * @param ipRanges ipRanges or {@code null} for none
   */
  public NfsExportOptions setIpRanges(java.util.List<java.lang.String> ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  /**
   * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for
   * not allowing root access. The default is NO_ROOT_SQUASH.
   * @return value or {@code null} for none
   */
  public java.lang.String getSquashMode() {
    return squashMode;
  }

  /**
   * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for
   * not allowing root access. The default is NO_ROOT_SQUASH.
   * @param squashMode squashMode or {@code null} for none
   */
  public NfsExportOptions setSquashMode(java.lang.String squashMode) {
    this.squashMode = squashMode;
    return this;
  }

  @Override
  public NfsExportOptions set(String fieldName, Object value) {
    return (NfsExportOptions) super.set(fieldName, value);
  }

  @Override
  public NfsExportOptions clone() {
    return (NfsExportOptions) super.clone();
  }

}
