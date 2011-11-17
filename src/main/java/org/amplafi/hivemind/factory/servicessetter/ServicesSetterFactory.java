/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package org.amplafi.hivemind.factory.servicessetter;

import com.sworddance.core.ServicesSetter;

import org.apache.commons.logging.Log;
import org.apache.hivemind.ServiceImplementationFactory;
import org.apache.hivemind.ServiceImplementationFactoryParameters;

/**
 * Factory for {@link ServicesSetter}.
 *
 * @author andyhot
 */
public class ServicesSetterFactory implements ServiceImplementationFactory {
    private Log log;

    public Object createCoreServiceImplementation(
            ServiceImplementationFactoryParameters params) {
        ServicesSetterImpl ss = new ServicesSetterImpl();
        ss.setModule(params.getInvokingModule());
        ss.setLog(getLog());
        return ss;
    }

    /**
     * @param log the log to set
     */
    public void setLog(Log log) {
        this.log = log;
    }

    /**
     * @return the log
     */
    public Log getLog() {
        return log;
    }

}
