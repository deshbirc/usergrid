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
package org.apache.usergrid.rest.test.resource2point0.model;


/**
 * Token model that contains the operations that can be done on a token.
 */
public class Token extends Entity{

    private User user;

    public Token(){

    }

    /**
     * Constructor for admin/application user ( difference is in the path )
     * @param grantType
     * @param username
     * @param password
     */
    public Token(String grantType, String username, String password){
        this.put("grant_type",grantType);
        this.put("username", username);
        this.put("password", password);
    }

    public String getAccessToken(){
        return (String) this.get("access_token");
    }

    public Long getExpriationDate(){
        return (Long) this.get("expires_in");
    }

    public Long getPasswordChanged(){
        return (Long) this.get("passwordChanged");
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}

