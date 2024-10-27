/**
 * Copyright 2024 shangyuan.tuolang
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.gn5r.doma.gen.maven;

import java.io.File;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class DomaGenMojoTest extends AbstractMojoTestCase {

  public void testExecute() throws Exception {
    File pom = new File("src/test/resources/pom.xml");
    assertNotNull(pom);
    assertTrue(pom.exists());

    DomaGenMojo domaGenMojo = (DomaGenMojo) lookupMojo("generate", pom);
    assertNotNull(domaGenMojo);
    domaGenMojo.execute();
  }
}
