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
package org.apache.usergrid.rest.test.resource2point0.state;


import org.apache.usergrid.rest.test.resource2point0.model.Organization;
import org.apache.usergrid.rest.test.resource2point0.model.Token;
import org.apache.usergrid.rest.test.resource2point0.model.User;


/**
 * Context to hold client stateful information
 * This includes token,orgName and uuid, appName and uuid, and user information
 */
public class ClientContext {
    private Token token;
//    private Organization organization;
//    private User user;



    public Token getToken() {
        return token;
    }


    public void setToken( final Token token ) {
        this.token = token;
    }

//    public Organization getOrganization() {
//        return organization;
//    }
//
//
//    public void setOrganization( final Organization organization ) {
//        this.organization = organization;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//
//    public void setUser( final User user ) {
//        this.user = user;
//    }
}
