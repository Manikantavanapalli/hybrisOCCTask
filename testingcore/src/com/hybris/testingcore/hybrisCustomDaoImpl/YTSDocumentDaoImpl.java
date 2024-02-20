/**
 *
 */
package com.hybris.testingcore.hybrisCustomDaoImpl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hybris.testingcore.hybriscustomdao.YTSDocumentDao;
import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public class YTSDocumentDaoImpl implements YTSDocumentDao
{
	private FlexibleSearchService flexibleSearchService;

	private static final String HYBRIS_YTSDOCUMENT_QUERY = "SELECT{" + YTSDocumentModel.PK + "}FROM{" + YTSDocumentModel._TYPECODE
			+ "}WHERE{" + YTSDocumentModel.CODE + "}=?code";

	@Override
	public List<YTSDocumentModel> getYTSDocumentdetails(final String code)
	{
		final Map<String, Object> params = new HashMap<>();
		params.put("code", code);

		final SearchResult<YTSDocumentModel> store = getFlexibleSearchService().search(HYBRIS_YTSDOCUMENT_QUERY, params);

		return store.getResult() == null ? Collections.emptyList() : store.getResult();
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

