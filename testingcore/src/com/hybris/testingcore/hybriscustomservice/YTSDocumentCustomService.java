/**
 *
 */
package com.hybris.testingcore.hybriscustomservice;

import java.util.List;

import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public interface YTSDocumentCustomService
{
	List<YTSDocumentModel> getYTSDocumentdetails(final String code);
}
