/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server response for IsMemberOf API call.
 */
public class CheckGroupMembershipResultInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * True if the specified user, group, contact, or service principal has
     * either direct or transitive membership in the specified group;
     * otherwise, false.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner withValue(Boolean value) {
        this.value = value;
        return this;
    }

}