/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The git commit trigger that caused a build.
 */
public class GitCommitTrigger {
    /**
     * The unique ID of the trigger.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The unique ID that identifies a commit.
     */
    @JsonProperty(value = "commitId")
    private String commitId;

    /**
     * The repository URL.
     */
    @JsonProperty(value = "repositoryUrl")
    private String repositoryUrl;

    /**
     * The branch name in the repository.
     */
    @JsonProperty(value = "branchName")
    private String branchName;

    /**
     * The source control provider type.
     */
    @JsonProperty(value = "providerType")
    private String providerType;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the GitCommitTrigger object itself.
     */
    public GitCommitTrigger withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the commitId value.
     *
     * @return the commitId value
     */
    public String commitId() {
        return this.commitId;
    }

    /**
     * Set the commitId value.
     *
     * @param commitId the commitId value to set
     * @return the GitCommitTrigger object itself.
     */
    public GitCommitTrigger withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get the repositoryUrl value.
     *
     * @return the repositoryUrl value
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl value.
     *
     * @param repositoryUrl the repositoryUrl value to set
     * @return the GitCommitTrigger object itself.
     */
    public GitCommitTrigger withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branchName value.
     *
     * @return the branchName value
     */
    public String branchName() {
        return this.branchName;
    }

    /**
     * Set the branchName value.
     *
     * @param branchName the branchName value to set
     * @return the GitCommitTrigger object itself.
     */
    public GitCommitTrigger withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Get the providerType value.
     *
     * @return the providerType value
     */
    public String providerType() {
        return this.providerType;
    }

    /**
     * Set the providerType value.
     *
     * @param providerType the providerType value to set
     * @return the GitCommitTrigger object itself.
     */
    public GitCommitTrigger withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

}