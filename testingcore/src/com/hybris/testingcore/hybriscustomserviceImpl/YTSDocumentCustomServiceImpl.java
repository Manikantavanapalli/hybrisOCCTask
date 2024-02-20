/**
 *
 */
package com.hybris.testingcore.hybriscustomserviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.hybris.testingcore.hybriscustomdao.YTSDocumentDao;
import com.hybris.testingcore.hybriscustomservice.YTSDocumentCustomService;
import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public class YTSDocumentCustomServiceImpl implements YTSDocumentCustomService
{
	@Resource
	private YTSDocumentDao ytsDocumentDao;

	@Override
	public List<YTSDocumentModel> getYTSDocumentdetails(final String code)
	{
		final List<YTSDocumentModel> storeModels = ytsDocumentDao.getYTSDocumentdetails(code);
		return storeModels;
	}


}
