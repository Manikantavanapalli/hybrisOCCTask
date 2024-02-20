/**
 * 
 */
package com.hybris.testing.ytsdocument.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.hybris.testing.facades.mysppliers.MySuppliersStoreData;
import com.testing.core.model.MySupplierModel;

/**
 * 
 */
public class MySuppliersPopulator implements Populator<MySupplierModel, MySuppliersStoreData>
{
	@Override
	public void populate(final MySupplierModel source, final MySuppliersStoreData target) throws ConversionException
	{
		// XXX Auto-generated method stub

		target.setManuFacturerCode(source.getManuFacturerCode());
		target.setManufacturerName(source.getManufacturerName());
		target.setUrl(source.getUrl());
		target.setActive(source.getActive());
		target.setSeo(source.getSeo());
	}
}
