/**
 *
 */
package com.hybris.testingcore.hybriscustomserviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.testingcore.hybriscustomdao.MySuppliersDao;
import com.hybris.testingcore.hybriscustomservice.MySupplierService;
import com.testing.core.model.MySupplierModel;

/**
 *
 */
public class MySupplierServiceImpl implements MySupplierService
{

	@Resource(name = "mySupplierDaoImpl")
	private MySuppliersDao mySupplierDaoImpl;

	@Override
	public List<MySupplierModel> getMySupplierdetails()
	{
		final List<MySupplierModel> suppliers = mySupplierDaoImpl.getMySupplierdetails();
		return suppliers;
	}

}
