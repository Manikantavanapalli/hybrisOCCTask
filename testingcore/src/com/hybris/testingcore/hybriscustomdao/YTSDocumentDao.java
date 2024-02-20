/**
 *
 */
package com.hybris.testingcore.hybriscustomdao;

import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

import com.testing.core.model.YTSDocumentModel;


/**
 *
 */
public interface YTSDocumentDao extends Dao
{
	List<YTSDocumentModel> getYTSDocumentdetails(final String code);
}
