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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContinuousBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous backups and point in time recovery
     * settings.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous backups and point in time recovery
     * settings.
     * </p>
     * 
     * @param tableName
     *        Name of the table for which the customer wants to check the continuous backups and point in time recovery
     *        settings.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous backups and point in time recovery
     * settings.
     * </p>
     * 
     * @return Name of the table for which the customer wants to check the continuous backups and point in time recovery
     *         settings.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous backups and point in time recovery
     * settings.
     * </p>
     * 
     * @param tableName
     *        Name of the table for which the customer wants to check the continuous backups and point in time recovery
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousBackupsRequest withTableName(String tableName) {
        setTableName(tableName);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContinuousBackupsRequest == false)
            return false;
        DescribeContinuousBackupsRequest other = (DescribeContinuousBackupsRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContinuousBackupsRequest clone() {
        return (DescribeContinuousBackupsRequest) super.clone();
    }

}
