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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SuperBag}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSuperBag extends GenericItem
{
	/** Qualifier of the <code>SuperBag.bagName</code> attribute **/
	public static final String BAGNAME = "bagName";
	/** Qualifier of the <code>SuperBag.bagId</code> attribute **/
	public static final String BAGID = "bagId";
	/** Qualifier of the <code>SuperBag.bagRoomNumber</code> attribute **/
	public static final String BAGROOMNUMBER = "bagRoomNumber";
	/** Qualifier of the <code>SuperBag.pockets</code> attribute **/
	public static final String POCKETS = "pockets";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BAGNAME, AttributeMode.INITIAL);
		tmp.put(BAGID, AttributeMode.INITIAL);
		tmp.put(BAGROOMNUMBER, AttributeMode.INITIAL);
		tmp.put(POCKETS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagId</code> attribute.
	 * @return the bagId
	 */
	public Integer getBagId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BAGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagId</code> attribute.
	 * @return the bagId
	 */
	public Integer getBagId()
	{
		return getBagId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagId</code> attribute. 
	 * @return the bagId
	 */
	public int getBagIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBagId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagId</code> attribute. 
	 * @return the bagId
	 */
	public int getBagIdAsPrimitive()
	{
		return getBagIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagId</code> attribute. 
	 * @param value the bagId
	 */
	public void setBagId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BAGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagId</code> attribute. 
	 * @param value the bagId
	 */
	public void setBagId(final Integer value)
	{
		setBagId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagId</code> attribute. 
	 * @param value the bagId
	 */
	public void setBagId(final SessionContext ctx, final int value)
	{
		setBagId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagId</code> attribute. 
	 * @param value the bagId
	 */
	public void setBagId(final int value)
	{
		setBagId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagName</code> attribute.
	 * @return the bagName - code
	 */
	public String getBagName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BAGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagName</code> attribute.
	 * @return the bagName - code
	 */
	public String getBagName()
	{
		return getBagName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagName</code> attribute. 
	 * @param value the bagName - code
	 */
	public void setBagName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BAGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagName</code> attribute. 
	 * @param value the bagName - code
	 */
	public void setBagName(final String value)
	{
		setBagName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagRoomNumber</code> attribute.
	 * @return the bagRoomNumber
	 */
	public String getBagRoomNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BAGROOMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.bagRoomNumber</code> attribute.
	 * @return the bagRoomNumber
	 */
	public String getBagRoomNumber()
	{
		return getBagRoomNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagRoomNumber</code> attribute. 
	 * @param value the bagRoomNumber
	 */
	public void setBagRoomNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BAGROOMNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.bagRoomNumber</code> attribute. 
	 * @param value the bagRoomNumber
	 */
	public void setBagRoomNumber(final String value)
	{
		setBagRoomNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.pockets</code> attribute.
	 * @return the pockets
	 */
	public List<String> getPockets(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, POCKETS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuperBag.pockets</code> attribute.
	 * @return the pockets
	 */
	public List<String> getPockets()
	{
		return getPockets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.pockets</code> attribute. 
	 * @param value the pockets
	 */
	public void setPockets(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, POCKETS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuperBag.pockets</code> attribute. 
	 * @param value the pockets
	 */
	public void setPockets(final List<String> value)
	{
		setPockets( getSession().getSessionContext(), value );
	}
	
}
