/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.implementation;

import com.microsoft.azure.management.batchai.ResourceId;
import com.microsoft.azure.management.batchai.ContainerSettings;
import com.microsoft.azure.management.batchai.ToolType;
import com.microsoft.azure.management.batchai.CNTKsettings;
import com.microsoft.azure.management.batchai.TensorFlowSettings;
import com.microsoft.azure.management.batchai.CaffeSettings;
import com.microsoft.azure.management.batchai.ChainerSettings;
import com.microsoft.azure.management.batchai.CustomToolkitSettings;
import com.microsoft.azure.management.batchai.JobPreparation;
import java.util.List;
import com.microsoft.azure.management.batchai.InputDirectory;
import com.microsoft.azure.management.batchai.OutputDirectory;
import com.microsoft.azure.management.batchai.EnvironmentSetting;
import com.microsoft.azure.management.batchai.JobPropertiesConstraints;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.ProvisioningState;
import com.microsoft.azure.management.batchai.ExecutionState;
import com.microsoft.azure.management.batchai.JobPropertiesExecutionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Contains information about the job.
 */
@JsonFlatten
public class JobInner extends Resource {
    /**
     * Describe the experiment information of the job.
     */
    @JsonProperty(value = "properties.experimentName")
    private String experimentName;

    /**
     * Priority associated with the job.
     * Priority associated with the job. Priority values can range from -1000
     * to 1000, with -1000 being the lowest priority and 1000 being the highest
     * priority. The default value is 0.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Specifies the Id of the cluster on which this job will run.
     */
    @JsonProperty(value = "properties.cluster")
    private ResourceId cluster;

    /**
     * Number of compute nodes to run the job on.
     * The job will be gang scheduled on that many compute nodes.
     */
    @JsonProperty(value = "properties.nodeCount")
    private Integer nodeCount;

    /**
     * If provided the job will run in the specified container.
     * If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the
     * VM.
     */
    @JsonProperty(value = "properties.containerSettings")
    private ContainerSettings containerSettings;

    /**
     * The toolkit type of this job.
     * Possible values are: cntk, tensorflow, caffe, caffe2, chainer, custom.
     * Possible values include: 'cntk', 'tensorflow', 'caffe', 'caffe2',
     * 'chainer', 'custom'.
     */
    @JsonProperty(value = "properties.toolType")
    private ToolType toolType;

    /**
     * Specifies the settings for CNTK (aka Microsoft Cognitive Toolkit) job.
     */
    @JsonProperty(value = "properties.cntkSettings")
    private CNTKsettings cntkSettings;

    /**
     * Specifies the settings for Tensor Flow job.
     */
    @JsonProperty(value = "properties.tensorFlowSettings")
    private TensorFlowSettings tensorFlowSettings;

    /**
     * Specifies the settings for Caffe job.
     */
    @JsonProperty(value = "properties.caffeSettings")
    private CaffeSettings caffeSettings;

    /**
     * Specifies the settings for Chainer job.
     */
    @JsonProperty(value = "properties.chainerSettings")
    private ChainerSettings chainerSettings;

    /**
     * Specifies the settings for custom tool kit job.
     */
    @JsonProperty(value = "properties.customToolkitSettings")
    private CustomToolkitSettings customToolkitSettings;

    /**
     * Specifies the actions to be performed before tool kit is launched.
     * The specified actions will run on all the nodes that are part of the
     * job.
     */
    @JsonProperty(value = "properties.jobPreparation")
    private JobPreparation jobPreparation;

    /**
     * The path where the Batch AI service will upload stdout and stderror of
     * the job.
     */
    @JsonProperty(value = "properties.stdOutErrPathPrefix")
    private String stdOutErrPathPrefix;

    /**
     * Specifies the list of input directories for the Job.
     */
    @JsonProperty(value = "properties.inputDirectories")
    private List<InputDirectory> inputDirectories;

    /**
     * Specifies the list of output directories where the models will be
     * created. .
     */
    @JsonProperty(value = "properties.outputDirectories")
    private List<OutputDirectory> outputDirectories;

    /**
     * Additional environment variables to be passed to the job.
     * Batch AI services sets the following environment variables for all jobs:
     * AZ_BATCHAI_INPUT_id, AZ_BATCHAI_OUTPUT_id, AZ_BATCHAI_NUM_GPUS_PER_NODE,
     * For distributed TensorFlow jobs, following additional environment
     * variables are set by the Batch AI Service: AZ_BATCHAI_PS_HOSTS,
     * AZ_BATCHAI_WORKER_HOSTS.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentSetting> environmentVariables;

    /**
     * Constraints associated with the Job.
     */
    @JsonProperty(value = "properties.constraints")
    private JobPropertiesConstraints constraints;

    /**
     * The job creation time.
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The provisioned state of the Batch AI job. Possible values include:
     * 'creating', 'succeeded', 'failed', 'deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time at which the job entered its current provisioning state.
     * The time at which the job entered its current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * The current state of the job.
     * The current state of the job. Possible values are: queued - The job is
     * queued and able to run. A job enters this state when it is created, or
     * when it is awaiting a retry after a failed run. running - The job is
     * running on a compute cluster. This includes job-level preparation such
     * as downloading resource files or set up container specified on the job -
     * it does not necessarily mean that the job command line has started
     * executing. terminating - The job is terminated by the user, the
     * terminate operation is in progress. succeeded - The job has completed
     * running succesfully and exited with exit code 0. failed - The job has
     * finished unsuccessfully (failed with a non-zero exit code) and has
     * exhausted its retry limit. A job is also marked as failed if an error
     * occurred launching the job. Possible values include: 'queued',
     * 'running', 'terminating', 'succeeded', 'failed'.
     */
    @JsonProperty(value = "properties.executionState")
    private ExecutionState executionState;

    /**
     * The time at which the job entered its current execution state.
     * The time at which the job entered its current execution state.
     */
    @JsonProperty(value = "properties.executionStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime executionStateTransitionTime;

    /**
     * Contains information about the execution of a job in the Azure Batch
     * service.
     */
    @JsonProperty(value = "properties.executionInfo")
    private JobPropertiesExecutionInfo executionInfo;

    /**
     * Get the experimentName value.
     *
     * @return the experimentName value
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName value.
     *
     * @param experimentName the experimentName value to set
     * @return the JobInner object itself.
     */
    public JobInner withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the JobInner object itself.
     */
    public JobInner withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the cluster value.
     *
     * @return the cluster value
     */
    public ResourceId cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster value.
     *
     * @param cluster the cluster value to set
     * @return the JobInner object itself.
     */
    public JobInner withCluster(ResourceId cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the nodeCount value.
     *
     * @return the nodeCount value
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount value.
     *
     * @param nodeCount the nodeCount value to set
     * @return the JobInner object itself.
     */
    public JobInner withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the containerSettings value.
     *
     * @return the containerSettings value
     */
    public ContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings value.
     *
     * @param containerSettings the containerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the toolType value.
     *
     * @return the toolType value
     */
    public ToolType toolType() {
        return this.toolType;
    }

    /**
     * Set the toolType value.
     *
     * @param toolType the toolType value to set
     * @return the JobInner object itself.
     */
    public JobInner withToolType(ToolType toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * Get the cntkSettings value.
     *
     * @return the cntkSettings value
     */
    public CNTKsettings cntkSettings() {
        return this.cntkSettings;
    }

    /**
     * Set the cntkSettings value.
     *
     * @param cntkSettings the cntkSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCntkSettings(CNTKsettings cntkSettings) {
        this.cntkSettings = cntkSettings;
        return this;
    }

    /**
     * Get the tensorFlowSettings value.
     *
     * @return the tensorFlowSettings value
     */
    public TensorFlowSettings tensorFlowSettings() {
        return this.tensorFlowSettings;
    }

    /**
     * Set the tensorFlowSettings value.
     *
     * @param tensorFlowSettings the tensorFlowSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withTensorFlowSettings(TensorFlowSettings tensorFlowSettings) {
        this.tensorFlowSettings = tensorFlowSettings;
        return this;
    }

    /**
     * Get the caffeSettings value.
     *
     * @return the caffeSettings value
     */
    public CaffeSettings caffeSettings() {
        return this.caffeSettings;
    }

    /**
     * Set the caffeSettings value.
     *
     * @param caffeSettings the caffeSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCaffeSettings(CaffeSettings caffeSettings) {
        this.caffeSettings = caffeSettings;
        return this;
    }

    /**
     * Get the chainerSettings value.
     *
     * @return the chainerSettings value
     */
    public ChainerSettings chainerSettings() {
        return this.chainerSettings;
    }

    /**
     * Set the chainerSettings value.
     *
     * @param chainerSettings the chainerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withChainerSettings(ChainerSettings chainerSettings) {
        this.chainerSettings = chainerSettings;
        return this;
    }

    /**
     * Get the customToolkitSettings value.
     *
     * @return the customToolkitSettings value
     */
    public CustomToolkitSettings customToolkitSettings() {
        return this.customToolkitSettings;
    }

    /**
     * Set the customToolkitSettings value.
     *
     * @param customToolkitSettings the customToolkitSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings) {
        this.customToolkitSettings = customToolkitSettings;
        return this;
    }

    /**
     * Get the jobPreparation value.
     *
     * @return the jobPreparation value
     */
    public JobPreparation jobPreparation() {
        return this.jobPreparation;
    }

    /**
     * Set the jobPreparation value.
     *
     * @param jobPreparation the jobPreparation value to set
     * @return the JobInner object itself.
     */
    public JobInner withJobPreparation(JobPreparation jobPreparation) {
        this.jobPreparation = jobPreparation;
        return this;
    }

    /**
     * Get the stdOutErrPathPrefix value.
     *
     * @return the stdOutErrPathPrefix value
     */
    public String stdOutErrPathPrefix() {
        return this.stdOutErrPathPrefix;
    }

    /**
     * Set the stdOutErrPathPrefix value.
     *
     * @param stdOutErrPathPrefix the stdOutErrPathPrefix value to set
     * @return the JobInner object itself.
     */
    public JobInner withStdOutErrPathPrefix(String stdOutErrPathPrefix) {
        this.stdOutErrPathPrefix = stdOutErrPathPrefix;
        return this;
    }

    /**
     * Get the inputDirectories value.
     *
     * @return the inputDirectories value
     */
    public List<InputDirectory> inputDirectories() {
        return this.inputDirectories;
    }

    /**
     * Set the inputDirectories value.
     *
     * @param inputDirectories the inputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withInputDirectories(List<InputDirectory> inputDirectories) {
        this.inputDirectories = inputDirectories;
        return this;
    }

    /**
     * Get the outputDirectories value.
     *
     * @return the outputDirectories value
     */
    public List<OutputDirectory> outputDirectories() {
        return this.outputDirectories;
    }

    /**
     * Set the outputDirectories value.
     *
     * @param outputDirectories the outputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withOutputDirectories(List<OutputDirectory> outputDirectories) {
        this.outputDirectories = outputDirectories;
        return this;
    }

    /**
     * Get the environmentVariables value.
     *
     * @return the environmentVariables value
     */
    public List<EnvironmentSetting> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables value.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the JobInner object itself.
     */
    public JobInner withEnvironmentVariables(List<EnvironmentSetting> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobPropertiesConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the JobInner object itself.
     */
    public JobInner withConstraints(JobPropertiesConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime value.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the executionState value.
     *
     * @return the executionState value
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Set the executionState value.
     *
     * @param executionState the executionState value to set
     * @return the JobInner object itself.
     */
    public JobInner withExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * Get the executionStateTransitionTime value.
     *
     * @return the executionStateTransitionTime value
     */
    public DateTime executionStateTransitionTime() {
        return this.executionStateTransitionTime;
    }

    /**
     * Get the executionInfo value.
     *
     * @return the executionInfo value
     */
    public JobPropertiesExecutionInfo executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo value.
     *
     * @param executionInfo the executionInfo value to set
     * @return the JobInner object itself.
     */
    public JobInner withExecutionInfo(JobPropertiesExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

}
