/**
 *
 */
package com.hybris.testingcore.hybriscustomserviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.testingcore.hybrisCustomDaoImpl.CurrencyRateDaoImpl;
import com.hybris.testingcore.hybriscustomservice.CurrencyRateService;
import com.testing.core.model.CurrencyRateModel;

/**
 *
 */
public class CurrencyRateServiceImpl implements CurrencyRateService
{
	@Resource(name = "currencyRateDaoImpl")
	private CurrencyRateDaoImpl currencyRateDaoImpl;

	@Override
	public List<CurrencyRateModel> getConversionDateDetails()
	{
		final List<CurrencyRateModel> currencyDate = currencyRateDaoImpl.getConversionDateDetails();
		return currencyDate;
	}

}
