/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldGenerationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldGenerationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     * </p>
     */
    private String template;
    /**
     * <p>
     * Information about the world count.
     * </p>
     */
    private WorldCount worldCount;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @param worldCount
     *        Information about the world count.
     */

    public void setWorldCount(WorldCount worldCount) {
        this.worldCount = worldCount;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @return Information about the world count.
     */

    public WorldCount getWorldCount() {
        return this.worldCount;
    }

    /**
     * <p>
     * Information about the world count.
     * </p>
     * 
     * @param worldCount
     *        Information about the world count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest withWorldCount(WorldCount worldCount) {
        setWorldCount(worldCount);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the world generator job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world generator job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world generator job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world generator job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorldGenerationJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldGenerationJobRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getWorldCount() != null)
            sb.append("WorldCount: ").append(getWorldCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorldGenerationJobRequest == false)
            return false;
        CreateWorldGenerationJobRequest other = (CreateWorldGenerationJobRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getWorldCount() == null ^ this.getWorldCount() == null)
            return false;
        if (other.getWorldCount() != null && other.getWorldCount().equals(this.getWorldCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getWorldCount() == null) ? 0 : getWorldCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorldGenerationJobRequest clone() {
        return (CreateWorldGenerationJobRequest) super.clone();
    }

}
