// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureAppPushReceiver model.
 */
@Fluent
public final class AzureAppPushReceiver {
    /*
     * The name of the Azure mobile app push receiver. Names must be unique
     * across all receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The email address registered for the Azure mobile app.
     */
    @JsonProperty(value = "emailAddress", required = true)
    private String emailAddress;

    /**
     * Get the name property: The name of the Azure mobile app push receiver.
     * Names must be unique across all receivers within an action group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Azure mobile app push receiver.
     * Names must be unique across all receivers within an action group.
     * 
     * @param name the name value to set.
     * @return the AzureAppPushReceiver object itself.
     */
    public AzureAppPushReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the emailAddress property: The email address registered for the
     * Azure mobile app.
     * 
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: The email address registered for the
     * Azure mobile app.
     * 
     * @param emailAddress the emailAddress value to set.
     * @return the AzureAppPushReceiver object itself.
     */
    public AzureAppPushReceiver withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
}
