/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.testing.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.testing.core.constants.TestingCoreConstants;
import com.testing.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TestingCoreManager extends GeneratedTestingCoreManager
{
	public static final TestingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TestingCoreManager) em.getExtension(TestingCoreConstants.EXTENSIONNAME);
	}
}
