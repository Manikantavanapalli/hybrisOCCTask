/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Feb-2024, 5:57:34 pm                     ---
 * ----------------------------------------------------------------
 */
package com.testing.core.jalo;

import com.testing.core.constants.TestingCoreConstants;
import com.testing.core.jalo.Teacher;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Student}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedStudent extends GenericItem
{
	/** Qualifier of the <code>Student.studentId</code> attribute **/
	public static final String STUDENTID = "studentId";
	/** Qualifier of the <code>Student.studentName</code> attribute **/
	public static final String STUDENTNAME = "studentName";
	/** Qualifier of the <code>Student.studentSection</code> attribute **/
	public static final String STUDENTSECTION = "studentSection";
	/** Qualifier of the <code>Student.Teachers</code> attribute **/
	public static final String TEACHERS = "Teachers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TEACHERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStudent> TEACHERSHANDLER = new BidirectionalOneToManyHandler<GeneratedStudent>(
	TestingCoreConstants.TC.STUDENT,
	false,
	"Teachers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STUDENTID, AttributeMode.INITIAL);
		tmp.put(STUDENTNAME, AttributeMode.INITIAL);
		tmp.put(STUDENTSECTION, AttributeMode.INITIAL);
		tmp.put(TEACHERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TEACHERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentId</code> attribute.
	 * @return the studentId - code
	 */
	public String getStudentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STUDENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentId</code> attribute.
	 * @return the studentId - code
	 */
	public String getStudentId()
	{
		return getStudentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentId</code> attribute. 
	 * @param value the studentId - code
	 */
	public void setStudentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STUDENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentId</code> attribute. 
	 * @param value the studentId - code
	 */
	public void setStudentId(final String value)
	{
		setStudentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentName</code> attribute.
	 * @return the studentName - code
	 */
	public String getStudentName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STUDENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentName</code> attribute.
	 * @return the studentName - code
	 */
	public String getStudentName()
	{
		return getStudentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentName</code> attribute. 
	 * @param value the studentName - code
	 */
	public void setStudentName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STUDENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentName</code> attribute. 
	 * @param value the studentName - code
	 */
	public void setStudentName(final String value)
	{
		setStudentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentSection</code> attribute.
	 * @return the studentSection - code
	 */
	public String getStudentSection(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STUDENTSECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.studentSection</code> attribute.
	 * @return the studentSection - code
	 */
	public String getStudentSection()
	{
		return getStudentSection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentSection</code> attribute. 
	 * @param value the studentSection - code
	 */
	public void setStudentSection(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STUDENTSECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.studentSection</code> attribute. 
	 * @param value the studentSection - code
	 */
	public void setStudentSection(final String value)
	{
		setStudentSection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.Teachers</code> attribute.
	 * @return the Teachers
	 */
	public Teacher getTeachers(final SessionContext ctx)
	{
		return (Teacher)getProperty( ctx, TEACHERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.Teachers</code> attribute.
	 * @return the Teachers
	 */
	public Teacher getTeachers()
	{
		return getTeachers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.Teachers</code> attribute. 
	 * @param value the Teachers
	 */
	public void setTeachers(final SessionContext ctx, final Teacher value)
	{
		TEACHERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.Teachers</code> attribute. 
	 * @param value the Teachers
	 */
	public void setTeachers(final Teacher value)
	{
		setTeachers( getSession().getSessionContext(), value );
	}
	
}
