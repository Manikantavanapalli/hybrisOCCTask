/**
 *
 */
package com.hybris.testing.ytsdocment.facadeimpl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.testing.facades.mysppliers.MySuppliersStoreData;
import com.hybris.testing.ytsdocument.facade.MySuppliersFacade;
import com.hybris.testingcore.hybriscustomservice.MySupplierService;
import com.testing.core.model.MySupplierModel;

/**
 *
 */
public class MySuppliersFacadeImpl implements MySuppliersFacade
{
	@Resource(name = "mySupplierServiceImpl")
	private MySupplierService mySupplierServiceImpl;


	/**
	 * @return the mySupplierServiceImpl
	 */
	public MySupplierService getMySupplierServiceImpl()
	{
		return mySupplierServiceImpl;
	}

	/**
	 * @param mySupplierServiceImpl
	 *                                 the mySupplierServiceImpl to set
	 */
	public void setMySupplierServiceImpl(final MySupplierService mySupplierServiceImpl)
	{
		this.mySupplierServiceImpl = mySupplierServiceImpl;
	}

	private Converter<MySupplierModel, MySuppliersStoreData> MySupplierConverter;

	/**
	 * @return the mySupplierConverter
	 */
	public Converter<MySupplierModel, MySuppliersStoreData> getMySupplierConverter()
	{
		return MySupplierConverter;
	}

	/**
	 * @param mySupplierConverter
	 *                               the mySupplierConverter to set
	 */
	public void setMySupplierConverter(final Converter<MySupplierModel, MySuppliersStoreData> mySupplierConverter)
	{
		this.MySupplierConverter = mySupplierConverter;
	}

	/**
	 * @return the mySupplierServiceImpl
	 */

	@Override
	public List<MySuppliersStoreData> getMySupplierdetails()
	{
		// XXX Auto-generated method stub
		final List<MySupplierModel> mySupplierModel = mySupplierServiceImpl.getMySupplierdetails();
		return Converters.convertAll(mySupplierModel, getMySupplierConverter());

	}

}
