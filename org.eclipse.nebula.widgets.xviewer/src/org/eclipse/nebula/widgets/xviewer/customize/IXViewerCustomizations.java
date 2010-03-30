/*******************************************************************************
 * Copyright (c) 2004, 2007 Boeing.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Boeing - initial API and implementation
 *******************************************************************************/
package org.eclipse.nebula.widgets.xviewer.customize;

import java.util.List;
import org.eclipse.nebula.widgets.xviewer.util.XViewerException;

/**
 * Methods to implement if this XViewer allows the user to save local/global customizations
 * 
 * @author Donald G. Dunne
 */
public interface IXViewerCustomizations {

   /**
    * Called to have customization saved
    * 
    * @param custData
    * @throws Exception
    */
   public void saveCustomization(CustomizeData custData) throws Exception;

   /**
    * Load and return saved customizations
    * 
    * @return list of saved customizations
    * @throws Exception
    */
   public List<CustomizeData> getSavedCustDatas() throws Exception;

   /**
    * Return customization saved as default
    * 
    * @return default customization
    * @throws XViewerException
    */
   public CustomizeData getUserDefaultCustData() throws XViewerException;

   /**
    * Return true if given customization is the default
    * 
    * @param custData
    * @return true if default
    */
   public boolean isCustomizationUserDefault(CustomizeData custData);

   /**
    * Set given customization as the user default
    * 
    * @param newCustData
    * @param set
    * @throws Exception
    */
   public void setUserDefaultCustData(CustomizeData newCustData, boolean set) throws Exception;

   /**
    * Delete customization
    * 
    * @param custData
    * @throws Exception
    */
   public void deleteCustomization(CustomizeData custData) throws Exception;

   /**
    * Return true if this XViewer is allowed to save local/global customizations
    * 
    * @return true if available
    */
   public boolean isCustomizationPersistAvailable();

}