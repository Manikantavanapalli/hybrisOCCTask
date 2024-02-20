/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Feb-2024, 5:57:34 pm                     ---
 * ----------------------------------------------------------------
 */
package com.testing.core.jalo;

import com.testing.core.constants.TestingCoreConstants;
import com.testing.core.jalo.Student;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Teacher}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTeacher extends GenericItem
{
	/** Qualifier of the <code>Teacher.teacherId</code> attribute **/
	public static final String TEACHERID = "teacherId";
	/** Qualifier of the <code>Teacher.teacherName</code> attribute **/
	public static final String TEACHERNAME = "teacherName";
	/** Qualifier of the <code>Teacher.teacherSection</code> attribute **/
	public static final String TEACHERSECTION = "teacherSection";
	/** Qualifier of the <code>Teacher.Students</code> attribute **/
	public static final String STUDENTS = "Students";
	/**
	* {@link OneToManyHandler} for handling 1:n STUDENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Student> STUDENTSHANDLER = new OneToManyHandler<Student>(
	TestingCoreConstants.TC.STUDENT,
	true,
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
		tmp.put(TEACHERID, AttributeMode.INITIAL);
		tmp.put(TEACHERNAME, AttributeMode.INITIAL);
		tmp.put(TEACHERSECTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.Students</code> attribute.
	 * @return the Students
	 */
	public Collection<Student> getStudents(final SessionContext ctx)
	{
		return STUDENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.Students</code> attribute.
	 * @return the Students
	 */
	public Collection<Student> getStudents()
	{
		return getStudents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.Students</code> attribute. 
	 * @param value the Students
	 */
	public void setStudents(final SessionContext ctx, final Collection<Student> value)
	{
		STUDENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.Students</code> attribute. 
	 * @param value the Students
	 */
	public void setStudents(final Collection<Student> value)
	{
		setStudents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Students. 
	 * @param value the item to add to Students
	 */
	public void addToStudents(final SessionContext ctx, final Student value)
	{
		STUDENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Students. 
	 * @param value the item to add to Students
	 */
	public void addToStudents(final Student value)
	{
		addToStudents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Students. 
	 * @param value the item to remove from Students
	 */
	public void removeFromStudents(final SessionContext ctx, final Student value)
	{
		STUDENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Students. 
	 * @param value the item to remove from Students
	 */
	public void removeFromStudents(final Student value)
	{
		removeFromStudents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherId</code> attribute.
	 * @return the teacherId - code
	 */
	public String getTeacherId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEACHERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherId</code> attribute.
	 * @return the teacherId - code
	 */
	public String getTeacherId()
	{
		return getTeacherId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherId</code> attribute. 
	 * @param value the teacherId - code
	 */
	public void setTeacherId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEACHERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherId</code> attribute. 
	 * @param value the teacherId - code
	 */
	public void setTeacherId(final String value)
	{
		setTeacherId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherName</code> attribute.
	 * @return the teacherName - code
	 */
	public String getTeacherName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEACHERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherName</code> attribute.
	 * @return the teacherName - code
	 */
	public String getTeacherName()
	{
		return getTeacherName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherName</code> attribute. 
	 * @param value the teacherName - code
	 */
	public void setTeacherName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEACHERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherName</code> attribute. 
	 * @param value the teacherName - code
	 */
	public void setTeacherName(final String value)
	{
		setTeacherName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherSection</code> attribute.
	 * @return the teacherSection - code
	 */
	public String getTeacherSection(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEACHERSECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.teacherSection</code> attribute.
	 * @return the teacherSection - code
	 */
	public String getTeacherSection()
	{
		return getTeacherSection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherSection</code> attribute. 
	 * @param value the teacherSection - code
	 */
	public void setTeacherSection(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEACHERSECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.teacherSection</code> attribute. 
	 * @param value the teacherSection - code
	 */
	public void setTeacherSection(final String value)
	{
		setTeacherSection( getSession().getSessionContext(), value );
	}
	
}
