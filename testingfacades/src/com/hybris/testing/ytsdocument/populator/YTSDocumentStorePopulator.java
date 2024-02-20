/**
 *
 */
package com.hybris.testing.ytsdocument.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.hybris.testing.facades.store.data.YTSDocumentStoreData;
import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public class YTSDocumentStorePopulator implements Populator<YTSDocumentModel, YTSDocumentStoreData>
{

	@Override
	public void populate(final YTSDocumentModel source, final YTSDocumentStoreData target) throws ConversionException
	{
		// XXX Auto-generated method stub

		target.setCode(source.getCode());
		target.setDocName(source.getDocName());
		target.setDocType(source.getDocType().toString());
		target.setKeywords(source.getKeywords().toString());
		target.setLanguage(source.getLanguageType().toString());
		target.setUrl(source.getUrl());
		target.setVisibility(source.getVisibility());
	}

}
