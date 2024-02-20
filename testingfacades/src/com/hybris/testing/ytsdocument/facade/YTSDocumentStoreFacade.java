/**
 *
 */
package com.hybris.testing.ytsdocument.facade;

import java.util.List;

import com.hybris.testing.facades.store.data.YTSDocumentStoreData;


/**
 *
 */
public interface YTSDocumentStoreFacade
{
	List<YTSDocumentStoreData> getYTSDocumentStoreDataId(String code);
}
