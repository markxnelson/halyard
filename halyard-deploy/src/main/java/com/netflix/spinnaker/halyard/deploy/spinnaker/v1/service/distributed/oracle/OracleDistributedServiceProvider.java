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

import com.netflix.spinnaker.halyard.config.model.v1.providers.oracle.OracleAccount;
import com.netflix.spinnaker.halyard.core.RemoteAction;
import com.netflix.spinnaker.halyard.core.error.v1.HalException;
import com.netflix.spinnaker.halyard.core.problem.v1.Problem;
import com.netflix.spinnaker.halyard.deploy.deployment.v1.AccountDeploymentDetails;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.SpinnakerRuntimeSettings;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.distributed.DistributedServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OracleDistributedServiceProvider extends DistributedServiceProvider<OracleAccount> {
  @Autowired
  OracleClouddriverBootstrapService clouddriverBootstrapService;

  @Autowired
  OracleClouddriverService clouddriverService;

  @Autowired
  OracleConsulClientService consulClientService;

  @Autowired
  OracleConsulServerService consulServerService;

  @Autowired
  OracleDeckService deckService;

  @Autowired
  OracleEchoService echoService;

  @Autowired
  OracleFiatService fiatService;

  @Autowired
  OracleFront50Service front50Service;

  @Autowired
  OracleGateService gateService;

  @Autowired
  OracleIgorService igorService;

  @Autowired
  OracleKayentaService kayentaService;

  @Autowired
  OracleOrcaBootstrapService orcaBootstrapService;

  @Autowired
  OracleOrcaService orcaService;

  @Autowired
  OracleMonitoringDaemonService monitoringDaemonService;

  @Autowired
  OracleRoscoService roscoService;

  @Autowired
  OracleRedisBootstrapService redisBootstrapService;

  @Autowired
  OracleRedisService redisService;

  @Autowired
  OracleVaultServerService vaultServerService;

  // For serialization
  public OracleDistributedServiceProvider() {}

  @Override
  public RemoteAction clean(AccountDeploymentDetails<OracleAccount> details, SpinnakerRuntimeSettings runtimeSettings) {
    throw new HalException(Problem.Severity.FATAL, "not yet implemented.");
  }
}
