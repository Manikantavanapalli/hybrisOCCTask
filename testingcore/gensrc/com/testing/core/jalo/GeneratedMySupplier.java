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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MySupplier}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMySupplier extends GenericItem
{
	/** Qualifier of the <code>MySupplier.manuFacturerCode</code> attribute **/
	public static final String MANUFACTURERCODE = "manuFacturerCode";
	/** Qualifier of the <code>MySupplier.manufacturerName</code> attribute **/
	public static final String MANUFACTURERNAME = "manufacturerName";
	/** Qualifier of the <code>MySupplier.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>MySupplier.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>MySupplier.seo</code> attribute **/
	public static final String SEO = "seo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MANUFACTURERCODE, AttributeMode.INITIAL);
		tmp.put(MANUFACTURERNAME, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(SEO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manuFacturerCode</code> attribute.
	 * @return the manuFacturerCode
	 */
	public String getManuFacturerCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MANUFACTURERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manuFacturerCode</code> attribute.
	 * @return the manuFacturerCode
	 */
	public String getManuFacturerCode()
	{
		return getManuFacturerCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manuFacturerCode</code> attribute. 
	 * @param value the manuFacturerCode
	 */
	public void setManuFacturerCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MANUFACTURERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manuFacturerCode</code> attribute. 
	 * @param value the manuFacturerCode
	 */
	public void setManuFacturerCode(final String value)
	{
		setManuFacturerCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manufacturerName</code> attribute.
	 * @return the manufacturerName
	 */
	public String getManufacturerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMySupplier.getManufacturerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MANUFACTURERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manufacturerName</code> attribute.
	 * @return the manufacturerName
	 */
	public String getManufacturerName()
	{
		return getManufacturerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @return the localized manufacturerName
	 */
	public Map<Language,String> getAllManufacturerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MANUFACTURERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @return the localized manufacturerName
	 */
	public Map<Language,String> getAllManufacturerName()
	{
		return getAllManufacturerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @param value the manufacturerName
	 */
	public void setManufacturerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMySupplier.setManufacturerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MANUFACTURERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @param value the manufacturerName
	 */
	public void setManufacturerName(final String value)
	{
		setManufacturerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @param value the manufacturerName
	 */
	public void setAllManufacturerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MANUFACTURERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.manufacturerName</code> attribute. 
	 * @param value the manufacturerName
	 */
	public void setAllManufacturerName(final Map<Language,String> value)
	{
		setAllManufacturerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.seo</code> attribute.
	 * @return the seo
	 */
	public String getSeo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.seo</code> attribute.
	 * @return the seo
	 */
	public String getSeo()
	{
		return getSeo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.seo</code> attribute. 
	 * @param value the seo
	 */
	public void setSeo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.seo</code> attribute. 
	 * @param value the seo
	 */
	public void setSeo(final String value)
	{
		setSeo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MySupplier.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MySupplier.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
