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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CurrencyRate}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCurrencyRate extends GenericItem
{
	/** Qualifier of the <code>CurrencyRate.fromCurrency</code> attribute **/
	public static final String FROMCURRENCY = "fromCurrency";
	/** Qualifier of the <code>CurrencyRate.toCurrency</code> attribute **/
	public static final String TOCURRENCY = "toCurrency";
	/** Qualifier of the <code>CurrencyRate.conversionDate</code> attribute **/
	public static final String CONVERSIONDATE = "conversionDate";
	/** Qualifier of the <code>CurrencyRate.conversionType</code> attribute **/
	public static final String CONVERSIONTYPE = "conversionType";
	/** Qualifier of the <code>CurrencyRate.conversionRate</code> attribute **/
	public static final String CONVERSIONRATE = "conversionRate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMCURRENCY, AttributeMode.INITIAL);
		tmp.put(TOCURRENCY, AttributeMode.INITIAL);
		tmp.put(CONVERSIONDATE, AttributeMode.INITIAL);
		tmp.put(CONVERSIONTYPE, AttributeMode.INITIAL);
		tmp.put(CONVERSIONRATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionDate</code> attribute.
	 * @return the conversionDate
	 */
	public Date getConversionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONVERSIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionDate</code> attribute.
	 * @return the conversionDate
	 */
	public Date getConversionDate()
	{
		return getConversionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionDate</code> attribute. 
	 * @param value the conversionDate
	 */
	public void setConversionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONVERSIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionDate</code> attribute. 
	 * @param value the conversionDate
	 */
	public void setConversionDate(final Date value)
	{
		setConversionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionRate</code> attribute.
	 * @return the conversionRate
	 */
	public Double getConversionRate(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CONVERSIONRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionRate</code> attribute.
	 * @return the conversionRate
	 */
	public Double getConversionRate()
	{
		return getConversionRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @return the conversionRate
	 */
	public double getConversionRateAsPrimitive(final SessionContext ctx)
	{
		Double value = getConversionRate( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @return the conversionRate
	 */
	public double getConversionRateAsPrimitive()
	{
		return getConversionRateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @param value the conversionRate
	 */
	public void setConversionRate(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CONVERSIONRATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @param value the conversionRate
	 */
	public void setConversionRate(final Double value)
	{
		setConversionRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @param value the conversionRate
	 */
	public void setConversionRate(final SessionContext ctx, final double value)
	{
		setConversionRate( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionRate</code> attribute. 
	 * @param value the conversionRate
	 */
	public void setConversionRate(final double value)
	{
		setConversionRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionType</code> attribute.
	 * @return the conversionType
	 */
	public EnumerationValue getConversionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONVERSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.conversionType</code> attribute.
	 * @return the conversionType
	 */
	public EnumerationValue getConversionType()
	{
		return getConversionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionType</code> attribute. 
	 * @param value the conversionType
	 */
	public void setConversionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONVERSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.conversionType</code> attribute. 
	 * @param value the conversionType
	 */
	public void setConversionType(final EnumerationValue value)
	{
		setConversionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.fromCurrency</code> attribute.
	 * @return the fromCurrency
	 */
	public Currency getFromCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, FROMCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.fromCurrency</code> attribute.
	 * @return the fromCurrency
	 */
	public Currency getFromCurrency()
	{
		return getFromCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.fromCurrency</code> attribute. 
	 * @param value the fromCurrency
	 */
	public void setFromCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, FROMCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.fromCurrency</code> attribute. 
	 * @param value the fromCurrency
	 */
	public void setFromCurrency(final Currency value)
	{
		setFromCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.toCurrency</code> attribute.
	 * @return the toCurrency
	 */
	public Currency getToCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, TOCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CurrencyRate.toCurrency</code> attribute.
	 * @return the toCurrency
	 */
	public Currency getToCurrency()
	{
		return getToCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.toCurrency</code> attribute. 
	 * @param value the toCurrency
	 */
	public void setToCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, TOCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CurrencyRate.toCurrency</code> attribute. 
	 * @param value the toCurrency
	 */
	public void setToCurrency(final Currency value)
	{
		setToCurrency( getSession().getSessionContext(), value );
	}
	
}
