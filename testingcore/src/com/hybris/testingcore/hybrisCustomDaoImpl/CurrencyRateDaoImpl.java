/**
 *
 */
package com.hybris.testingcore.hybrisCustomDaoImpl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import com.hybris.testingcore.hybriscustomdao.CurrencyRateDao;
import com.testing.core.model.CurrencyRateModel;

/**
 *
 */
public class CurrencyRateDaoImpl implements CurrencyRateDao
{
	private FlexibleSearchService flexibleSearchService;


	private static final String HYBRIS_CURRENCYRATE_QUERY = "SELECT{" + CurrencyRateModel.PK + "}FROM{"
			+ CurrencyRateModel._TYPECODE + "}WHERE{" + CurrencyRateModel.CONVERSIONDATE + "}>= ?currentDate";


	@Override
	public List<CurrencyRateModel> getConversionDateDetails()
	{

		final LocalDate localDate = LocalDate.now();

		final String currentDate = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		final FlexibleSearchQuery query = new FlexibleSearchQuery(HYBRIS_CURRENCYRATE_QUERY);

		query.addQueryParameter("currentDate", currentDate);

		final SearchResult<CurrencyRateModel> currencyDataque = getFlexibleSearchService().search(query);

		return currencyDataque.getResult() == null ? Collections.emptyList() : currencyDataque.getResult();

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
