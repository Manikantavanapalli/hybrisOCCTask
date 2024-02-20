/**
 *
 */
package com.hybris.testing.ytsdocument.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.hybris.testing.facades.currency.data.CurrencyRateData;
import com.testing.core.model.CurrencyRateModel;



/**
 *
 */
public class CurrencyRatePopulator implements Populator<CurrencyRateModel, CurrencyRateData>
{
	@Override
	public void populate(final CurrencyRateModel source, final CurrencyRateData target) throws ConversionException
	{
		// XXX Auto-generated method stub

		target.setFromCurrency(source.getFromCurrency().getIsocode());
		target.setToCurrency(source.getToCurrency().getIsocode());
		target.setConversionRate(source.getConversionRate());
		target.setConversionType(source.getConversionType().getCode());
		target.setConversionDate(source.getConversionDate().toString());

	}
}
