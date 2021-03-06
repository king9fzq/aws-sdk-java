/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolversByFunction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolversByFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of resolvers.
     * </p>
     */
    private java.util.List<Resolver> resolvers;
    /**
     * <p>
     * An identifier that can be used to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of resolvers.
     * </p>
     * 
     * @return The list of resolvers.
     */

    public java.util.List<Resolver> getResolvers() {
        return resolvers;
    }

    /**
     * <p>
     * The list of resolvers.
     * </p>
     * 
     * @param resolvers
     *        The list of resolvers.
     */

    public void setResolvers(java.util.Collection<Resolver> resolvers) {
        if (resolvers == null) {
            this.resolvers = null;
            return;
        }

        this.resolvers = new java.util.ArrayList<Resolver>(resolvers);
    }

    /**
     * <p>
     * The list of resolvers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolvers(java.util.Collection)} or {@link #withResolvers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resolvers
     *        The list of resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolversByFunctionResult withResolvers(Resolver... resolvers) {
        if (this.resolvers == null) {
            setResolvers(new java.util.ArrayList<Resolver>(resolvers.length));
        }
        for (Resolver ele : resolvers) {
            this.resolvers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resolvers.
     * </p>
     * 
     * @param resolvers
     *        The list of resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolversByFunctionResult withResolvers(java.util.Collection<Resolver> resolvers) {
        setResolvers(resolvers);
        return this;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that can be used to return the next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier that can be used to return the next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that can be used to return the next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolversByFunctionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResolvers() != null)
            sb.append("Resolvers: ").append(getResolvers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolversByFunctionResult == false)
            return false;
        ListResolversByFunctionResult other = (ListResolversByFunctionResult) obj;
        if (other.getResolvers() == null ^ this.getResolvers() == null)
            return false;
        if (other.getResolvers() != null && other.getResolvers().equals(this.getResolvers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolvers() == null) ? 0 : getResolvers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResolversByFunctionResult clone() {
        try {
            return (ListResolversByFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
