/**
 *
 */
package yoccpackage.controllers;

import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import javax.annotation.Resource;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybris.testing.facades.doc.data.CurrencyDataListWsDTO;
import com.hybris.testing.facades.doc.data.HybrisCurrencyDataList;
import com.hybris.testing.ytsdocment.facadeimpl.CurrencyRateFacadeImpl;

import yoccpackage.constants.YOccConstants;


/**
 *
 */
@Controller
@ApiVersion("v2")
@RequestMapping(value = "/{baseSiteId}")
public class CurrencyRateController
{
	protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;

	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@Resource(name = "currencyRateFacadeImpl")
	private CurrencyRateFacadeImpl currencyRateFacadeImpl;

	@Secured(
	{ YOccConstants.ROLE_CUSTOMERGROUP, YOccConstants.ROLE_GUEST, YOccConstants.ROLE_CUSTOMERMANAGERGROUP,
			YOccConstants.ROLE_TRUSTED_CLIENT })
	@RequestMapping(value = "/currency", method = RequestMethod.GET)
	@ResponseBody
	@ApiBaseSiteIdParam
	public CurrencyDataListWsDTO getConversionDateDetails(@ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		{
			final HybrisCurrencyDataList hybrisCurrencyDataList = new HybrisCurrencyDataList();
			hybrisCurrencyDataList.setCurrencyRateHybris(currencyRateFacadeImpl.getConversionDateDetails());

			return dataMapper.map(hybrisCurrencyDataList, CurrencyDataListWsDTO.class, fields);


		}
	}

}
