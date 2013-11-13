/**Copyright 2013 The Cybercat project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.automation.features;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.PageObjectException;
import org.cybercat.automation.annotations.CCRedirectionStep;
import org.cybercat.automation.annotations.CCTestStep;
import org.cybercat.automation.test.IFeature;
import org.cybercat.automation.test.IVersionControl;

/**
 * @author Ubegun
 *
 */
public interface IApacheHomeFeature extends IFeature, IVersionControl{

    @CCRedirectionStep(desctiption="Navigation to stat page", url="http://apache.org/")
    public abstract IApacheHomeFeature gotoApache() throws AutomationFrameworkException;

    
    @CCTestStep("Navigation step")
    public abstract IApacheHomeFeature sampleNavigate(String toProject) throws AutomationFrameworkException;

}