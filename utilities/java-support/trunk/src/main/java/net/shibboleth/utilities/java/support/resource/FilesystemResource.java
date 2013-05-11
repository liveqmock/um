/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shibboleth.utilities.java.support.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.annotation.Nonnull;

import net.shibboleth.utilities.java.support.logic.Constraint;
import net.shibboleth.utilities.java.support.primitive.StringSupport;

/** An {@link Resource} that reads data from a filesystem file. */
public class FilesystemResource extends AbstractResource {

    /** Filesystem file read by this resource. */
    private final File resourceFile;

    /**
     * Constructor. The file character set is set to the system default character set.
     * 
     * @param resourcePath file read by this resource, never null or empty
     */
    public FilesystemResource(@Nonnull final String resourcePath) {
        resourceFile =
                new File(Constraint.isNotNull(StringSupport.trimOrNull(resourcePath),
                        "Resource file path may not be null or empty"));
        setLocation(resourceFile.getAbsolutePath());
    }

    /** {@inheritDoc} */
    protected boolean doExists() throws ResourceException {
        return resourceFile.exists();
    }

    /** {@inheritDoc} */
    protected InputStream doGetInputStream() throws ResourceException {
        try {
            return new FileInputStream(resourceFile);
        } catch (FileNotFoundException e) {
            throw new ResourceException("Resource file " + resourceFile.getPath() + " can not be read", e);
        }
    }

    /** {@inheritDoc} */
    protected long doGetLastModifiedTime() throws ResourceException {
        return resourceFile.lastModified();
    }
}