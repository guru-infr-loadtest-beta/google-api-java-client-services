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

package com.google.api.services.lifesciences.v2beta.model;

/**
 * The arguments to the `RunPipeline` method. The requesting user must have the
 * `iam.serviceAccounts.actAs` permission for the Cloud Life Sciences service account or the request
 * will fail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Life Sciences API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunPipelineRequest extends com.google.api.client.json.GenericJson {

  /**
   * User-defined labels to associate with the returned operation. These labels are not propagated
   * to any Google Cloud Platform resources used by the operation, and can be modified at any time.
   *
   * To associate labels with resources created while executing the operation, see the appropriate
   * resource message (for example, `VirtualMachine`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The description of the pipeline to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Pipeline pipeline;

  /**
   * User-defined labels to associate with the returned operation. These labels are not propagated
   * to any Google Cloud Platform resources used by the operation, and can be modified at any time.
   *
   * To associate labels with resources created while executing the operation, see the appropriate
   * resource message (for example, `VirtualMachine`).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-defined labels to associate with the returned operation. These labels are not propagated
   * to any Google Cloud Platform resources used by the operation, and can be modified at any time.
   *
   * To associate labels with resources created while executing the operation, see the appropriate
   * resource message (for example, `VirtualMachine`).
   * @param labels labels or {@code null} for none
   */
  public RunPipelineRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The description of the pipeline to run.
   * @return value or {@code null} for none
   */
  public Pipeline getPipeline() {
    return pipeline;
  }

  /**
   * Required. The description of the pipeline to run.
   * @param pipeline pipeline or {@code null} for none
   */
  public RunPipelineRequest setPipeline(Pipeline pipeline) {
    this.pipeline = pipeline;
    return this;
  }

  @Override
  public RunPipelineRequest set(String fieldName, Object value) {
    return (RunPipelineRequest) super.set(fieldName, value);
  }

  @Override
  public RunPipelineRequest clone() {
    return (RunPipelineRequest) super.clone();
  }

}
