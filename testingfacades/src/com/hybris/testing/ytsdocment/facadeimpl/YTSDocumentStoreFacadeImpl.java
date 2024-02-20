/**
 *
 */
package com.hybris.testing.ytsdocment.facadeimpl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.hybris.testing.facades.store.data.YTSDocumentStoreData;
import com.hybris.testing.ytsdocument.facade.YTSDocumentStoreFacade;
import com.hybris.testingcore.hybriscustomservice.YTSDocumentCustomService;
import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public class YTSDocumentStoreFacadeImpl implements YTSDocumentStoreFacade
{

	private YTSDocumentCustomService yTSDocumentCustomService;

	/**
	 * @return the yTSDocumentCustomService
	 */
	public YTSDocumentCustomService getyTSDocumentCustomService()
	{
		return yTSDocumentCustomService;
	}

	/**
	 * @param yTSDocumentCustomService
	 *                                    the yTSDocumentCustomService to set
	 */
	public void setyTSDocumentCustomService(final YTSDocumentCustomService yTSDocumentCustomService)
	{
		this.yTSDocumentCustomService = yTSDocumentCustomService;
	}

	private Converter<YTSDocumentModel, YTSDocumentStoreData> yTSDocumentStoreConverter;

	/**
	 * @return the yTSDocumentStoreConverter
	 */
	public Converter<YTSDocumentModel, YTSDocumentStoreData> getyTSDocumentStoreConverter()
	{
		return yTSDocumentStoreConverter;
	}

	/**
	 * @param yTSDocumentStoreConverter
	 *                                     the yTSDocumentStoreConverter to set
	 */
	public void setyTSDocumentStoreConverter(final Converter<YTSDocumentModel, YTSDocumentStoreData> yTSDocumentStoreConverter)
	{
		this.yTSDocumentStoreConverter = yTSDocumentStoreConverter;
	}

	@Override
	public List<YTSDocumentStoreData> getYTSDocumentStoreDataId(final String code)
	{
		final List<YTSDocumentModel> YTSDocumentModel  = yTSDocumentCustomService.getYTSDocumentdetails(code);
		return Converters.convertAll(YTSDocumentModel, getyTSDocumentStoreConverter());


	}

	/**
	 * @return the ytsDocumentStoreConverter
	 */
}
