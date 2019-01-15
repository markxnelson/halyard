/*
 * Copyright 2019 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.distributed.oracle;

import com.netflix.spinnaker.halyard.config.config.v1.HalconfigDirectoryStructure;
import com.netflix.spinnaker.halyard.config.model.v1.providers.oracle.OracleAccount;
import com.netflix.spinnaker.halyard.core.error.v1.HalException;
import com.netflix.spinnaker.halyard.core.problem.v1.Problem;
import com.netflix.spinnaker.halyard.deploy.deployment.v1.AccountDeploymentDetails;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.SpinnakerRuntimeSettings;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.HasServiceSettings;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.LogCollector;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.distributed.DistributedLogCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class OracleDistributedLogCollectorFactory {
  public <T> LogCollector build(HasServiceSettings<T> service) {
    return new OracleDistributedLogCollector<>(service);
  }

  @Autowired
  HalconfigDirectoryStructure directoryStructure;

  private class OracleDistributedLogCollector<T> extends DistributedLogCollector<T, OracleAccount> {
    OracleDistributedLogCollector(HasServiceSettings<T> service) {
      super(service);
    }

    @Override
    protected HalconfigDirectoryStructure getDirectoryStructure() {
      return directoryStructure;
    }

    @Override
    protected void collectInstanceLogs(
        AccountDeploymentDetails<OracleAccount> details,
        SpinnakerRuntimeSettings runtimeSettings,
        File instanceOutputDir,
        String instanceId) {
      throw new HalException(Problem.Severity.FATAL, "Not yet implemented.");
    }
  }
}
