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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybris.testing.facades.mysppliers.MySuppliersStoreDataList;
import com.hybris.testing.facades.mysppliers.dto.MySuppliersStoreDataListWSDTO;
import com.hybris.testing.ytsdocment.facadeimpl.MySuppliersFacadeImpl;

@Controller
@ApiVersion("v2")
@RequestMapping(value = "/{baseSiteId}")
public class MySuppliersController
{

	protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;

	@Resource
	private DataMapper dataMapper;

	@Resource
	private MySuppliersFacadeImpl mySuppliersFacadeImpl;

	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	@ResponseBody
	@ApiBaseSiteIdParam
	public MySuppliersStoreDataListWSDTO getMySuppliersData(@ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		{
			final MySuppliersStoreDataList mySuppliersStoreDataList = new MySuppliersStoreDataList();
			mySuppliersStoreDataList.setStoresupplierslistdata(mySuppliersFacadeImpl.getMySupplierdetails());

			return dataMapper.map(mySuppliersStoreDataList, MySuppliersStoreDataListWSDTO.class, fields);
		}
	}
}
