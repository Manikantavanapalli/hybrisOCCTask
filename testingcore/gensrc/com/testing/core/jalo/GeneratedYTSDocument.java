/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Feb-2024, 5:57:34 pm                     ---
 * ----------------------------------------------------------------
 */
package com.testing.core.jalo;

import com.testing.core.constants.TestingCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem YTSDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedYTSDocument extends GenericItem
{
	/** Qualifier of the <code>YTSDocument.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>YTSDocument.docName</code> attribute **/
	public static final String DOCNAME = "docName";
	/** Qualifier of the <code>YTSDocument.keywords</code> attribute **/
	public static final String KEYWORDS = "keywords";
	/** Qualifier of the <code>YTSDocument.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>YTSDocument.docType</code> attribute **/
	public static final String DOCTYPE = "docType";
	/** Qualifier of the <code>YTSDocument.languageType</code> attribute **/
	public static final String LANGUAGETYPE = "languageType";
	/** Qualifier of the <code>YTSDocument.visibility</code> attribute **/
	public static final String VISIBILITY = "visibility";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DOCNAME, AttributeMode.INITIAL);
		tmp.put(KEYWORDS, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(DOCTYPE, AttributeMode.INITIAL);
		tmp.put(LANGUAGETYPE, AttributeMode.INITIAL);
		tmp.put(VISIBILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.code</code> attribute.
	 * @return the code - code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.code</code> attribute.
	 * @return the code - code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.code</code> attribute. 
	 * @param value the code - code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.code</code> attribute. 
	 * @param value the code - code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docName</code> attribute.
	 * @return the docName
	 */
	public String getDocName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedYTSDocument.getDocName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DOCNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docName</code> attribute.
	 * @return the docName
	 */
	public String getDocName()
	{
		return getDocName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docName</code> attribute. 
	 * @return the localized docName
	 */
	public Map<Language,String> getAllDocName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DOCNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docName</code> attribute. 
	 * @return the localized docName
	 */
	public Map<Language,String> getAllDocName()
	{
		return getAllDocName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docName</code> attribute. 
	 * @param value the docName
	 */
	public void setDocName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedYTSDocument.setDocName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DOCNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docName</code> attribute. 
	 * @param value the docName
	 */
	public void setDocName(final String value)
	{
		setDocName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docName</code> attribute. 
	 * @param value the docName
	 */
	public void setAllDocName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DOCNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docName</code> attribute. 
	 * @param value the docName
	 */
	public void setAllDocName(final Map<Language,String> value)
	{
		setAllDocName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docType</code> attribute.
	 * @return the docType
	 */
	public EnumerationValue getDocType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.docType</code> attribute.
	 * @return the docType
	 */
	public EnumerationValue getDocType()
	{
		return getDocType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docType</code> attribute. 
	 * @param value the docType
	 */
	public void setDocType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.docType</code> attribute. 
	 * @param value the docType
	 */
	public void setDocType(final EnumerationValue value)
	{
		setDocType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.keywords</code> attribute.
	 * @return the keywords
	 */
	public List<String> getKeywords(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, KEYWORDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.keywords</code> attribute.
	 * @return the keywords
	 */
	public List<String> getKeywords()
	{
		return getKeywords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, KEYWORDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final List<String> value)
	{
		setKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.languageType</code> attribute.
	 * @return the languageType
	 */
	public EnumerationValue getLanguageType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LANGUAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.languageType</code> attribute.
	 * @return the languageType
	 */
	public EnumerationValue getLanguageType()
	{
		return getLanguageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.languageType</code> attribute. 
	 * @param value the languageType
	 */
	public void setLanguageType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LANGUAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.languageType</code> attribute. 
	 * @param value the languageType
	 */
	public void setLanguageType(final EnumerationValue value)
	{
		setLanguageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedYTSDocument.getUrl requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.url</code> attribute. 
	 * @return the localized url
	 */
	public Map<Language,String> getAllUrl(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,URL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.url</code> attribute. 
	 * @return the localized url
	 */
	public Map<Language,String> getAllUrl()
	{
		return getAllUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedYTSDocument.setUrl requires a session language", 0 );
		}
		setLocalizedProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.url</code> attribute. 
	 * @param value the url
	 */
	public void setAllUrl(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.url</code> attribute. 
	 * @param value the url
	 */
	public void setAllUrl(final Map<Language,String> value)
	{
		setAllUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.visibility</code> attribute.
	 * @return the visibility
	 */
	public Boolean isVisibility(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VISIBILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.visibility</code> attribute.
	 * @return the visibility
	 */
	public Boolean isVisibility()
	{
		return isVisibility( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.visibility</code> attribute. 
	 * @return the visibility
	 */
	public boolean isVisibilityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isVisibility( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>YTSDocument.visibility</code> attribute. 
	 * @return the visibility
	 */
	public boolean isVisibilityAsPrimitive()
	{
		return isVisibilityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VISIBILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final Boolean value)
	{
		setVisibility( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final SessionContext ctx, final boolean value)
	{
		setVisibility( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>YTSDocument.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final boolean value)
	{
		setVisibility( getSession().getSessionContext(), value );
	}
	
}
