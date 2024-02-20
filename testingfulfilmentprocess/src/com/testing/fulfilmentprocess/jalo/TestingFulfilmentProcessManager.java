/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.testing.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.testing.fulfilmentprocess.constants.TestingFulfilmentProcessConstants;

public class TestingFulfilmentProcessManager extends GeneratedTestingFulfilmentProcessManager
{
	public static final TestingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TestingFulfilmentProcessManager) em.getExtension(TestingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
