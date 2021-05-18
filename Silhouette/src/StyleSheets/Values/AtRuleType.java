package StyleSheets.Values;

/**
 * Contains all types for CSS at-rule. 
 * @see StyleSheets.BaseComponents.AtRule.Builder#Builder(AtRuleType)
 * @see StyleSheets.BaseComponents.AtRule.Builder#Builder(AtRuleType, String) 
 */
public enum AtRuleType {
    CHARSET,
    COLOR_PROFILE,
    COUNTER_STYLE,
    DOCUMENT,
    FONT_FACE,
    FONT_FEATURE_VALUES,
    IMPORT,
    KEYFRAMES,
    MEDIA,
    NAMESPACE,
    PAGE,
    PROPERTY,
    SUPPORTS,
    VIEWPORT
}
