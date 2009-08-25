/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: Konstantin Krivopustov
 * Created: 17.03.2009 17:42:45
 *
 * $Id$
 */
package com.haulmont.cuba.core.app;

public interface CubaDeployerMBean
{
    String OBJECT_NAME = "haulmont.cuba:service=CubaDeployer";

    void start();

    String getReleaseNumber();

    String getReleaseTimestamp();
}
