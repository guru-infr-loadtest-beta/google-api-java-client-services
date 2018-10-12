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
 * The top-level message sent by the client to the `StreamingAnalyzeContent` method.
 *
 * Multiple request messages must be sent in the following order:
 *
 * 1.  The first message must contain `participant` and `config` fields. To     receive an audio
 * response, the first message must also contain the     `reply_audio_config` field. The first
 * message must not contain `input`.
 *
 * 2.  All subsequent messages must contain only input data. Specifically:     - If the `config` in
 * the first message was set to `audio_config`, then       all subsequent messages must contain only
 * `input_audio`. It is a good       practice to split the input audio into short chunks and deliver
 * each       chunk in a separate message.     - If the `config` in the first message was set to
 * `text_config`, then       the second message must contain only `input_text`. Moreover, the
 * `input_text` field can be only sent once.     After all input is delivered, the client must half-
 * close, or abort the     request stream.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Instructs the speech recognizer how to process the speech audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1InputAudioConfig audioConfig;

  /**
   * The input audio content to be recognized. Must be sent if `audio_config` is set in the first
   * message. The complete audio over all streaming messages must not exceed 1 minute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputAudio;

  /**
   * The UTF-8 encoded natural language text to be processed. Must be sent if `text_config` is set
   * in the first message. Text length must not exceed 256 bytes. The `input_text` field can be only
   * sent once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputText;

  /**
   * Optional. Instructs the speech synthesizer how to generate the output audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1OutputAudioConfig replyAudioConfig;

  /**
   * The natural language text to be processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1InputTextConfig textConfig;

  /**
   * Instructs the speech recognizer how to process the speech audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1InputAudioConfig getAudioConfig() {
    return audioConfig;
  }

  /**
   * Instructs the speech recognizer how to process the speech audio.
   * @param audioConfig audioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest setAudioConfig(GoogleCloudDialogflowV2beta1InputAudioConfig audioConfig) {
    this.audioConfig = audioConfig;
    return this;
  }

  /**
   * The input audio content to be recognized. Must be sent if `audio_config` is set in the first
   * message. The complete audio over all streaming messages must not exceed 1 minute.
   * @see #decodeInputAudio()
   * @return value or {@code null} for none
   */
  public java.lang.String getInputAudio() {
    return inputAudio;
  }

  /**
   * The input audio content to be recognized. Must be sent if `audio_config` is set in the first
   * message. The complete audio over all streaming messages must not exceed 1 minute.
   * @see #getInputAudio()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInputAudio() {
    return com.google.api.client.util.Base64.decodeBase64(inputAudio);
  }

  /**
   * The input audio content to be recognized. Must be sent if `audio_config` is set in the first
   * message. The complete audio over all streaming messages must not exceed 1 minute.
   * @see #encodeInputAudio()
   * @param inputAudio inputAudio or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest setInputAudio(java.lang.String inputAudio) {
    this.inputAudio = inputAudio;
    return this;
  }

  /**
   * The input audio content to be recognized. Must be sent if `audio_config` is set in the first
   * message. The complete audio over all streaming messages must not exceed 1 minute.
   * @see #setInputAudio()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest encodeInputAudio(byte[] inputAudio) {
    this.inputAudio = com.google.api.client.util.Base64.encodeBase64URLSafeString(inputAudio);
    return this;
  }

  /**
   * The UTF-8 encoded natural language text to be processed. Must be sent if `text_config` is set
   * in the first message. Text length must not exceed 256 bytes. The `input_text` field can be only
   * sent once.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputText() {
    return inputText;
  }

  /**
   * The UTF-8 encoded natural language text to be processed. Must be sent if `text_config` is set
   * in the first message. Text length must not exceed 256 bytes. The `input_text` field can be only
   * sent once.
   * @param inputText inputText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest setInputText(java.lang.String inputText) {
    this.inputText = inputText;
    return this;
  }

  /**
   * Optional. Instructs the speech synthesizer how to generate the output audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig getReplyAudioConfig() {
    return replyAudioConfig;
  }

  /**
   * Optional. Instructs the speech synthesizer how to generate the output audio.
   * @param replyAudioConfig replyAudioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest setReplyAudioConfig(GoogleCloudDialogflowV2beta1OutputAudioConfig replyAudioConfig) {
    this.replyAudioConfig = replyAudioConfig;
    return this;
  }

  /**
   * The natural language text to be processed.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1InputTextConfig getTextConfig() {
    return textConfig;
  }

  /**
   * The natural language text to be processed.
   * @param textConfig textConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest setTextConfig(GoogleCloudDialogflowV2beta1InputTextConfig textConfig) {
    this.textConfig = textConfig;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest clone() {
    return (GoogleCloudDialogflowV2beta1StreamingAnalyzeContentRequest) super.clone();
  }

}
