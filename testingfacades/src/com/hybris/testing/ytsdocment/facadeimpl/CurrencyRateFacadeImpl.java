/**
 *
 */
package com.hybris.testing.ytsdocment.facadeimpl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.testing.facades.currency.data.CurrencyRateData;
import com.hybris.testing.ytsdocument.facade.CurrencyRateFacade;
import com.hybris.testingcore.hybriscustomserviceImpl.CurrencyRateServiceImpl;
import com.testing.core.model.CurrencyRateModel;

/**
 *
 */
public class CurrencyRateFacadeImpl implements CurrencyRateFacade
{
	@Resource(name = "currencyRateServiceImpl")
	private CurrencyRateServiceImpl currencyRateServiceImpl;

	private Converter<CurrencyRateModel, CurrencyRateData> currencyRateConverter;

	/**
	 * @return the currencyRateConverter
	 */
	public Converter<CurrencyRateModel, CurrencyRateData> getCurrencyRateConverter()
	{
		return currencyRateConverter;
	}

	/**
	 * @param currencyRateConverter
	 *                                 the currencyRateConverter to set
	 */
	public void setCurrencyRateConverter(final Converter<CurrencyRateModel, CurrencyRateData> currencyRateConverter)
	{
		this.currencyRateConverter = currencyRateConverter;
	}


	/**
	 * @return the currencyRateServiceImpl
	 */
	public CurrencyRateServiceImpl getCurrencyRateServiceImpl()
	{
		return currencyRateServiceImpl;
	}

	/**
	 * @param currencyRateServiceImpl
	 *                                   the currencyRateServiceImpl to set
	 */
	public void setCurrencyRateServiceImpl(final CurrencyRateServiceImpl currencyRateServiceImpl)
	{
		this.currencyRateServiceImpl = currencyRateServiceImpl;
	}

	@Override
	public List<CurrencyRateData> getConversionDateDetails()
	{
		// XXX Auto-generated method stub
		final List<CurrencyRateModel> currencyRateModel = currencyRateServiceImpl.getConversionDateDetails();
		return Converters.convertAll(currencyRateModel, getCurrencyRateConverter());
	}



}
