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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a connected service timeout that occured during an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TaskTimedOutEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTimedOutEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action of the connected service called by a task state.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service name of the connected service in a task state.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The error code of the failure.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     */
    private String cause;

    /**
     * <p>
     * The action of the connected service called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the connected service called by a task state.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The action of the connected service called by a task state.
     * </p>
     * 
     * @return The action of the connected service called by a task state.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The action of the connected service called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the connected service called by a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTimedOutEventDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service name of the connected service in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the connected service in a task state.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The service name of the connected service in a task state.
     * </p>
     * 
     * @return The service name of the connected service in a task state.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The service name of the connected service in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the connected service in a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTimedOutEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param error
     *        The error code of the failure.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @return The error code of the failure.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error code of the failure.
     * </p>
     * 
     * @param error
     *        The error code of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTimedOutEventDetails withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @return A more detailed explanation of the cause of the failure.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTimedOutEventDetails withCause(String cause) {
        setCause(cause);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTimedOutEventDetails == false)
            return false;
        TaskTimedOutEventDetails other = (TaskTimedOutEventDetails) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        return hashCode;
    }

    @Override
    public TaskTimedOutEventDetails clone() {
        try {
            return (TaskTimedOutEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.TaskTimedOutEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
