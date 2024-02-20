/**
 *
 */
package com.hybris.testingcore.hybrisCustomDaoImpl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.List;

import com.hybris.testingcore.hybriscustomdao.MySuppliersDao;
import com.testing.core.model.MySupplierModel;

/**
 *
 */
public class MySupplierDaoImpl implements MySuppliersDao
{
	private FlexibleSearchService flexibleSearchService;

	private static final String HYBRIS_MySupplier_QUERY = "SELECT{" + MySupplierModel.PK + "}FROM{" + MySupplierModel._TYPECODE
			+ "}WHERE{" + MySupplierModel.ACTIVE + "}=1";

	@Override
	public List<MySupplierModel> getMySupplierdetails()
	{

		final SearchResult<MySupplierModel> supplier = getFlexibleSearchService().search(HYBRIS_MySupplier_QUERY);

		return supplier.getResult() == null ? Collections.emptyList() : supplier.getResult();
	}

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
