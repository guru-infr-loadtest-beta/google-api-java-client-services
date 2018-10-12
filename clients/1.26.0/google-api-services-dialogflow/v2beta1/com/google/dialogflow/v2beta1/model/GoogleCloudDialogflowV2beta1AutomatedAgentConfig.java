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
 * Defines the Automated Agent to connect to a conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1AutomatedAgentConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. ID of the Dialogflow agent environment to use.
   *
   * This project needs to either be the same project as the conversation or you need to grant
   * `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in
   * this project.
   *
   * Format: `projects//agent/environments/` If environment is not specified, the default `draft`
   * environment is used. Refer to [DetectIntentRequest](/dialogflow-enterprise/docs/reference/rpc/g
   * oogle.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest) for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agent;

  /**
   * Required. ID of the Dialogflow agent environment to use.
   *
   * This project needs to either be the same project as the conversation or you need to grant
   * `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in
   * this project.
   *
   * Format: `projects//agent/environments/` If environment is not specified, the default `draft`
   * environment is used. Refer to [DetectIntentRequest](/dialogflow-enterprise/docs/reference/rpc/g
   * oogle.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest) for more
   * details.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgent() {
    return agent;
  }

  /**
   * Required. ID of the Dialogflow agent environment to use.
   *
   * This project needs to either be the same project as the conversation or you need to grant
   * `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in
   * this project.
   *
   * Format: `projects//agent/environments/` If environment is not specified, the default `draft`
   * environment is used. Refer to [DetectIntentRequest](/dialogflow-enterprise/docs/reference/rpc/g
   * oogle.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest) for more
   * details.
   * @param agent agent or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AutomatedAgentConfig setAgent(java.lang.String agent) {
    this.agent = agent;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1AutomatedAgentConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1AutomatedAgentConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1AutomatedAgentConfig clone() {
    return (GoogleCloudDialogflowV2beta1AutomatedAgentConfig) super.clone();
  }

}
