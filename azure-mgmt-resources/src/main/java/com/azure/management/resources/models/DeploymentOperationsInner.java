// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DeploymentOperations.
 */
public final class DeploymentOperationsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private DeploymentOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of DeploymentOperationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public DeploymentOperationsInner(ResourceManagementClientImpl client) {
        this.service = RestProxy.create(DeploymentOperationsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ResourceManagementClientDeploymentOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementClientDeploymentOperations")
    private interface DeploymentOperationsService {
        @Get("/{scope}/providers/Microsoft.Resources/deployments/{deploymentName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationInner>> getAtScope(@HostParam("$host") String host, @PathParam("scope") String scope, @PathParam("deploymentName") String deploymentName, @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion);

        @Get("/{scope}/providers/Microsoft.Resources/deployments/{deploymentName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtScope(@HostParam("$host") String host, @PathParam("scope") String scope, @PathParam("deploymentName") String deploymentName, @QueryParam("$top") Integer top, @QueryParam("api-version") String apiVersion);

        @Get("/providers/Microsoft.Resources/deployments/{deploymentName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationInner>> getAtTenantScope(@HostParam("$host") String host, @PathParam("deploymentName") String deploymentName, @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion);

        @Get("/providers/Microsoft.Resources/deployments/{deploymentName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtTenantScope(@HostParam("$host") String host, @PathParam("deploymentName") String deploymentName, @QueryParam("$top") Integer top, @QueryParam("api-version") String apiVersion);

        @Get("/providers/Microsoft.Management/managementGroups/{groupId}/providers/Microsoft.Resources/deployments/{deploymentName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationInner>> getAtManagementGroupScope(@HostParam("$host") String host, @PathParam("groupId") String groupId, @PathParam("deploymentName") String deploymentName, @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion);

        @Get("/providers/Microsoft.Management/managementGroups/{groupId}/providers/Microsoft.Resources/deployments/{deploymentName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtManagementGroupScope(@HostParam("$host") String host, @PathParam("groupId") String groupId, @PathParam("deploymentName") String deploymentName, @QueryParam("$top") Integer top, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Resources/deployments/{deploymentName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationInner>> getAtSubscriptionScope(@HostParam("$host") String host, @PathParam("deploymentName") String deploymentName, @PathParam("operationId") String operationId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Resources/deployments/{deploymentName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtSubscriptionScope(@HostParam("$host") String host, @PathParam("deploymentName") String deploymentName, @QueryParam("$top") Integer top, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("deploymentName") String deploymentName, @PathParam("operationId") String operationId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("deploymentName") String deploymentName, @QueryParam("$top") Integer top, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtScopeNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtTenantScopeNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtManagementGroupScopeNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listAtSubscriptionScopeNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DeploymentOperationsListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a deployments operation.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeploymentOperationInner>> getAtScopeWithResponseAsync(String scope, String deploymentName, String operationId) {
        return service.getAtScope(this.client.getHost(), scope, deploymentName, operationId, this.client.getApiVersion());
    }

    /**
     * Gets a deployments operation.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentOperationInner> getAtScopeAsync(String scope, String deploymentName, String operationId) {
        return getAtScopeWithResponseAsync(scope, deploymentName, operationId)
            .flatMap((SimpleResponse<DeploymentOperationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a deployments operation.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentOperationInner getAtScope(String scope, String deploymentName, String operationId) {
        return getAtScopeAsync(scope, deploymentName, operationId).block();
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtScopeSinglePageAsync(String scope, String deploymentName, Integer top) {
        return service.listAtScope(this.client.getHost(), scope, deploymentName, top, this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentOperationInner> listAtScopeAsync(String scope, String deploymentName, Integer top) {
        return new PagedFlux<>(
            () -> listAtScopeSinglePageAsync(scope, deploymentName, top),
            nextLink -> listAtScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param scope The additional properties.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeploymentOperationInner> listAtScope(String scope, String deploymentName, Integer top) {
        return new PagedIterable<>(listAtScopeAsync(scope, deploymentName, top));
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeploymentOperationInner>> getAtTenantScopeWithResponseAsync(String deploymentName, String operationId) {
        return service.getAtTenantScope(this.client.getHost(), deploymentName, operationId, this.client.getApiVersion());
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentOperationInner> getAtTenantScopeAsync(String deploymentName, String operationId) {
        return getAtTenantScopeWithResponseAsync(deploymentName, operationId)
            .flatMap((SimpleResponse<DeploymentOperationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentOperationInner getAtTenantScope(String deploymentName, String operationId) {
        return getAtTenantScopeAsync(deploymentName, operationId).block();
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtTenantScopeSinglePageAsync(String deploymentName, Integer top) {
        return service.listAtTenantScope(this.client.getHost(), deploymentName, top, this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentOperationInner> listAtTenantScopeAsync(String deploymentName, Integer top) {
        return new PagedFlux<>(
            () -> listAtTenantScopeSinglePageAsync(deploymentName, top),
            nextLink -> listAtTenantScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeploymentOperationInner> listAtTenantScope(String deploymentName, Integer top) {
        return new PagedIterable<>(listAtTenantScopeAsync(deploymentName, top));
    }

    /**
     * Gets a deployments operation.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeploymentOperationInner>> getAtManagementGroupScopeWithResponseAsync(String groupId, String deploymentName, String operationId) {
        return service.getAtManagementGroupScope(this.client.getHost(), groupId, deploymentName, operationId, this.client.getApiVersion());
    }

    /**
     * Gets a deployments operation.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentOperationInner> getAtManagementGroupScopeAsync(String groupId, String deploymentName, String operationId) {
        return getAtManagementGroupScopeWithResponseAsync(groupId, deploymentName, operationId)
            .flatMap((SimpleResponse<DeploymentOperationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a deployments operation.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentOperationInner getAtManagementGroupScope(String groupId, String deploymentName, String operationId) {
        return getAtManagementGroupScopeAsync(groupId, deploymentName, operationId).block();
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtManagementGroupScopeSinglePageAsync(String groupId, String deploymentName, Integer top) {
        return service.listAtManagementGroupScope(this.client.getHost(), groupId, deploymentName, top, this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentOperationInner> listAtManagementGroupScopeAsync(String groupId, String deploymentName, Integer top) {
        return new PagedFlux<>(
            () -> listAtManagementGroupScopeSinglePageAsync(groupId, deploymentName, top),
            nextLink -> listAtManagementGroupScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param groupId MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeploymentOperationInner> listAtManagementGroupScope(String groupId, String deploymentName, Integer top) {
        return new PagedIterable<>(listAtManagementGroupScopeAsync(groupId, deploymentName, top));
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeploymentOperationInner>> getAtSubscriptionScopeWithResponseAsync(String deploymentName, String operationId) {
        return service.getAtSubscriptionScope(this.client.getHost(), deploymentName, operationId, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentOperationInner> getAtSubscriptionScopeAsync(String deploymentName, String operationId) {
        return getAtSubscriptionScopeWithResponseAsync(deploymentName, operationId)
            .flatMap((SimpleResponse<DeploymentOperationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a deployments operation.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentOperationInner getAtSubscriptionScope(String deploymentName, String operationId) {
        return getAtSubscriptionScopeAsync(deploymentName, operationId).block();
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtSubscriptionScopeSinglePageAsync(String deploymentName, Integer top) {
        return service.listAtSubscriptionScope(this.client.getHost(), deploymentName, top, this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentOperationInner> listAtSubscriptionScopeAsync(String deploymentName, Integer top) {
        return new PagedFlux<>(
            () -> listAtSubscriptionScopeSinglePageAsync(deploymentName, top),
            nextLink -> listAtSubscriptionScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeploymentOperationInner> listAtSubscriptionScope(String deploymentName, Integer top) {
        return new PagedIterable<>(listAtSubscriptionScopeAsync(deploymentName, top));
    }

    /**
     * Gets a deployments operation.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeploymentOperationInner>> getWithResponseAsync(String resourceGroupName, String deploymentName, String operationId) {
        return service.get(this.client.getHost(), resourceGroupName, deploymentName, operationId, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    /**
     * Gets a deployments operation.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeploymentOperationInner> getAsync(String resourceGroupName, String deploymentName, String operationId) {
        return getWithResponseAsync(resourceGroupName, deploymentName, operationId)
            .flatMap((SimpleResponse<DeploymentOperationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a deployments operation.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param operationId The additional properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentOperationInner get(String resourceGroupName, String deploymentName, String operationId) {
        return getAsync(resourceGroupName, deploymentName, operationId).block();
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listByResourceGroupSinglePageAsync(String resourceGroupName, String deploymentName, Integer top) {
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, deploymentName, top, this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeploymentOperationInner> listByResourceGroupAsync(String resourceGroupName, String deploymentName, Integer top) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName, deploymentName, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all deployments operations for a deployment.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param deploymentName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param top MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeploymentOperationInner> listByResourceGroup(String resourceGroupName, String deploymentName, Integer top) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, deploymentName, top));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtScopeNextSinglePageAsync(String nextLink) {
        return service.listAtScopeNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtTenantScopeNextSinglePageAsync(String nextLink) {
        return service.listAtTenantScopeNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtManagementGroupScopeNextSinglePageAsync(String nextLink) {
        return service.listAtManagementGroupScopeNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listAtSubscriptionScopeNextSinglePageAsync(String nextLink) {
        return service.listAtSubscriptionScopeNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeploymentOperationInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}