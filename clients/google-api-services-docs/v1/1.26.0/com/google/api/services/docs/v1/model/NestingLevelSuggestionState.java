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

package com.google.api.services.docs.v1.model;

/**
 * A mask that indicates which of the fields on the base NestingLevel have been changed in this
 * suggestion. For any field set to true, there is a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NestingLevelSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if there was a suggested change to bullet_alignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bulletAlignmentSuggested;

  /**
   * Indicates if there was a suggested change to glyph_format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean glyphFormatSuggested;

  /**
   * Indicates if there was a suggested change to glyph_symbol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean glyphSymbolSuggested;

  /**
   * Indicates if there was a suggested change to glyph_type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean glyphTypeSuggested;

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indentFirstLineSuggested;

  /**
   * Indicates if there was a suggested change to indent_start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indentStartSuggested;

  /**
   * Indicates if there was a suggested change to start_number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean startNumberSuggested;

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextStyleSuggestionState textStyleSuggestionState;

  /**
   * Indicates if there was a suggested change to bullet_alignment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBulletAlignmentSuggested() {
    return bulletAlignmentSuggested;
  }

  /**
   * Indicates if there was a suggested change to bullet_alignment.
   * @param bulletAlignmentSuggested bulletAlignmentSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setBulletAlignmentSuggested(java.lang.Boolean bulletAlignmentSuggested) {
    this.bulletAlignmentSuggested = bulletAlignmentSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to glyph_format.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGlyphFormatSuggested() {
    return glyphFormatSuggested;
  }

  /**
   * Indicates if there was a suggested change to glyph_format.
   * @param glyphFormatSuggested glyphFormatSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setGlyphFormatSuggested(java.lang.Boolean glyphFormatSuggested) {
    this.glyphFormatSuggested = glyphFormatSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to glyph_symbol.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGlyphSymbolSuggested() {
    return glyphSymbolSuggested;
  }

  /**
   * Indicates if there was a suggested change to glyph_symbol.
   * @param glyphSymbolSuggested glyphSymbolSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setGlyphSymbolSuggested(java.lang.Boolean glyphSymbolSuggested) {
    this.glyphSymbolSuggested = glyphSymbolSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to glyph_type.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGlyphTypeSuggested() {
    return glyphTypeSuggested;
  }

  /**
   * Indicates if there was a suggested change to glyph_type.
   * @param glyphTypeSuggested glyphTypeSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setGlyphTypeSuggested(java.lang.Boolean glyphTypeSuggested) {
    this.glyphTypeSuggested = glyphTypeSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndentFirstLineSuggested() {
    return indentFirstLineSuggested;
  }

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * @param indentFirstLineSuggested indentFirstLineSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setIndentFirstLineSuggested(java.lang.Boolean indentFirstLineSuggested) {
    this.indentFirstLineSuggested = indentFirstLineSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to indent_start.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndentStartSuggested() {
    return indentStartSuggested;
  }

  /**
   * Indicates if there was a suggested change to indent_start.
   * @param indentStartSuggested indentStartSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setIndentStartSuggested(java.lang.Boolean indentStartSuggested) {
    this.indentStartSuggested = indentStartSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to start_number.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStartNumberSuggested() {
    return startNumberSuggested;
  }

  /**
   * Indicates if there was a suggested change to start_number.
   * @param startNumberSuggested startNumberSuggested or {@code null} for none
   */
  public NestingLevelSuggestionState setStartNumberSuggested(java.lang.Boolean startNumberSuggested) {
    this.startNumberSuggested = startNumberSuggested;
    return this;
  }

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * @return value or {@code null} for none
   */
  public TextStyleSuggestionState getTextStyleSuggestionState() {
    return textStyleSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in text style have been changed in this suggestion.
   * @param textStyleSuggestionState textStyleSuggestionState or {@code null} for none
   */
  public NestingLevelSuggestionState setTextStyleSuggestionState(TextStyleSuggestionState textStyleSuggestionState) {
    this.textStyleSuggestionState = textStyleSuggestionState;
    return this;
  }

  @Override
  public NestingLevelSuggestionState set(String fieldName, Object value) {
    return (NestingLevelSuggestionState) super.set(fieldName, value);
  }

  @Override
  public NestingLevelSuggestionState clone() {
    return (NestingLevelSuggestionState) super.clone();
  }

}