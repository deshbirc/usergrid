/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.usergrid.rest.test.resource2point0.endpoints.mgmt;

import javax.ws.rs.core.MediaType;

import org.apache.usergrid.rest.test.resource2point0.endpoints.NamedResource;
import org.apache.usergrid.rest.test.resource2point0.endpoints.UrlResource;
import org.apache.usergrid.rest.test.resource2point0.model.ApiResponse;
import org.apache.usergrid.rest.test.resource2point0.model.Organization;
import org.apache.usergrid.rest.test.resource2point0.model.User;
import org.apache.usergrid.rest.test.resource2point0.state.ClientContext;


/**
 * Manages the Management/ORG endpoint.
 */
public class OrgResource  extends NamedResource {

    //TODO: need to find a way to integrate having the orgs/<org_name> into the same endpoint.
    //maybe I could append the orgs to the end of the parent
    public OrgResource( final ClientContext context, final UrlResource parent ) {
        super( "orgs", context, parent );
    }


    public OrganizationResource organization (final String orgname){
        return new OrganizationResource( orgname,context,this );
    }

    public Organization post(Organization organization){
        ApiResponse response = getResource().type( MediaType.APPLICATION_JSON_TYPE ).accept( MediaType.APPLICATION_JSON )
                     .post( ApiResponse.class,organization );

        organization = new Organization(response);
        organization.setOwner(new User( response ));
        return organization;
    }

    public Organization put(Organization organization){
        ApiResponse response = getResource().type( MediaType.APPLICATION_JSON_TYPE ).accept( MediaType.APPLICATION_JSON )
                .put(ApiResponse.class, organization);

        return new Organization(response);

    }

    public Organization get(){
        throw new UnsupportedOperationException("service doesn't exist");
    }

    public void delete(){
        ApiResponse response = getResource().type( MediaType.APPLICATION_JSON_TYPE ).accept( MediaType.APPLICATION_JSON )
                .delete(ApiResponse.class);

    }
}
