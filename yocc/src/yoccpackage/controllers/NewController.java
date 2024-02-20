package yoccpackage.controllers;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import javax.annotation.Resource;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybris.testing.dto.doc.HybrisEcommerceDocDataListWSDTO;
import com.hybris.testing.facades.store.data.YTSDocumentStoreDataList;
import com.hybris.testing.ytsdocment.facadeimpl.YTSDocumentStoreFacadeImpl;

import io.swagger.v3.oas.annotations.Parameter;
import yoccpackage.constants.YOccConstants;

@Controller
@ApiVersion("v2")
@RequestMapping(value = "/{baseSiteId}/documents")
public class NewController

{

	protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;

	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@Resource(name = "yTSDocumentStoreFacadeImpl")
	private YTSDocumentStoreFacadeImpl yTSDocumentStoreFacadeImpl;


	@RequestMapping(value = "/newResource", method = RequestMethod.GET)
	@ResponseBody
	public String getNewResource()
	{
		return "newSampleResource";
	}


	@Secured(
	{ YOccConstants.ROLE_CUSTOMERGROUP, YOccConstants.ROLE_GUEST, YOccConstants.ROLE_CUSTOMERMANAGERGROUP,
			YOccConstants.ROLE_TRUSTED_CLIENT })
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	@ResponseBody
	@ApiBaseSiteIdParam
	public HybrisEcommerceDocDataListWSDTO getHybrisEcommerceDocDetails(@Parameter(description = "DOC code", required = true)
	@PathVariable
	final String code, @ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		{

			final YTSDocumentStoreDataList hybrisEcommerceDocDataList = new YTSDocumentStoreDataList();
			hybrisEcommerceDocDataList.setDocuments(yTSDocumentStoreFacadeImpl.getYTSDocumentStoreDataId(code));
			return dataMapper.map(hybrisEcommerceDocDataList, HybrisEcommerceDocDataListWSDTO.class, fields);

		}
	}

}