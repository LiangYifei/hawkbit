/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.ddi.client.strategy;

import java.io.InputStream;

/**
 * @author Jonathan Knoblauch
 *
 */
public interface PersistenceStrategy {

    public String getPersistenceStrategy();

    public void handleInputStream(InputStream in, String artifactName);

}
