// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.containerregistry.RunUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Runs. */
public final class RunsInner {
    /** The proxy service used to perform REST calls. */
    private final RunsService service;

    /** The service client containing this operation class. */
    private final ContainerRegistryManagementClientImpl client;

    /**
     * Initializes an instance of RunsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RunsInner(ContainerRegistryManagementClientImpl client) {
        this.service = RestProxy.create(RunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerRegistryManagementClientRuns to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerRegistryMan")
    private interface RunsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RunListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$top") Integer top,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RunInner>> get(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            @BodyParam("application/json") RunUpdateParameters runUpdateParameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}/listLogSasUrl")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RunGetLogResultInner>> getLogSasUrl(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}/cancel")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> cancel(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RunInner>> beginUpdate(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            @BodyParam("application/json") RunUpdateParameters runUpdateParameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.ContainerRegistry/registries/{registryName}/runs/{runId}/cancel")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginCancel(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("registryName") String registryName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("runId") String runId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RunListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets all the runs for a registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param filter The runs filter to apply on the operation. Arithmetic operators are not supported. The allowed
     *     string function is 'contains'. All logical operators except 'Not', 'Has', 'All' are allowed.
     * @param top $top is supported for get list of runs, which limits the maximum number of runs to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the runs for a registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunInner>> listSinglePageAsync(
        String resourceGroupName, String registryName, String filter, Integer top) {
        final String apiVersion = "2018-09-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            filter,
                            top,
                            context))
            .<PagedResponse<RunInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all the runs for a registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param filter The runs filter to apply on the operation. Arithmetic operators are not supported. The allowed
     *     string function is 'contains'. All logical operators except 'Not', 'Has', 'All' are allowed.
     * @param top $top is supported for get list of runs, which limits the maximum number of runs to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the runs for a registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RunInner> listAsync(String resourceGroupName, String registryName, String filter, Integer top) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, registryName, filter, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the runs for a registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the runs for a registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RunInner> listAsync(String resourceGroupName, String registryName) {
        final String filter = null;
        final Integer top = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, registryName, filter, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the runs for a registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param filter The runs filter to apply on the operation. Arithmetic operators are not supported. The allowed
     *     string function is 'contains'. All logical operators except 'Not', 'Has', 'All' are allowed.
     * @param top $top is supported for get list of runs, which limits the maximum number of runs to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the runs for a registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunInner> list(String resourceGroupName, String registryName, String filter, Integer top) {
        return new PagedIterable<>(listAsync(resourceGroupName, registryName, filter, top));
    }

    /**
     * Gets all the runs for a registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the runs for a registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunInner> list(String resourceGroupName, String registryName) {
        final String filter = null;
        final Integer top = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(resourceGroupName, registryName, filter, top));
    }

    /**
     * Gets the detailed information for a given run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RunInner>> getWithResponseAsync(
        String resourceGroupName, String registryName, String runId) {
        final String apiVersion = "2018-09-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the detailed information for a given run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunInner> getAsync(String resourceGroupName, String registryName, String runId) {
        return getWithResponseAsync(resourceGroupName, registryName, runId)
            .flatMap(
                (SimpleResponse<RunInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the detailed information for a given run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunInner get(String resourceGroupName, String registryName, String runId) {
        return getAsync(resourceGroupName, registryName, runId).block();
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        final String apiVersion = "2018-09-01";
        RunUpdateParameters runUpdateParameters = new RunUpdateParameters();
        runUpdateParameters.withIsArchiveEnabled(isArchiveEnabled);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            runUpdateParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunInner> updateAsync(
        String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            updateWithResponseAsync(resourceGroupName, registryName, runId, isArchiveEnabled);
        return this
            .client
            .<RunInner, RunInner>getLroResultAsync(mono, this.client.getHttpPipeline(), RunInner.class, RunInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunInner update(String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        return updateAsync(resourceGroupName, registryName, runId, isArchiveEnabled).block();
    }

    /**
     * Gets a link to download the run logs.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link to download the run logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RunGetLogResultInner>> getLogSasUrlWithResponseAsync(
        String resourceGroupName, String registryName, String runId) {
        final String apiVersion = "2018-09-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getLogSasUrl(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a link to download the run logs.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link to download the run logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunGetLogResultInner> getLogSasUrlAsync(String resourceGroupName, String registryName, String runId) {
        return getLogSasUrlWithResponseAsync(resourceGroupName, registryName, runId)
            .flatMap(
                (SimpleResponse<RunGetLogResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a link to download the run logs.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link to download the run logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunGetLogResultInner getLogSasUrl(String resourceGroupName, String registryName, String runId) {
        return getLogSasUrlAsync(resourceGroupName, registryName, runId).block();
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> cancelWithResponseAsync(
        String resourceGroupName, String registryName, String runId) {
        final String apiVersion = "2018-09-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .cancel(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(String resourceGroupName, String registryName, String runId) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = cancelWithResponseAsync(resourceGroupName, registryName, runId);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String registryName, String runId) {
        cancelAsync(resourceGroupName, registryName, runId).block();
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RunInner>> beginUpdateWithResponseAsync(
        String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        final String apiVersion = "2018-09-01";
        RunUpdateParameters runUpdateParameters = new RunUpdateParameters();
        runUpdateParameters.withIsArchiveEnabled(isArchiveEnabled);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginUpdate(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            runUpdateParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunInner> beginUpdateAsync(
        String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        return beginUpdateWithResponseAsync(resourceGroupName, registryName, runId, isArchiveEnabled)
            .flatMap(
                (SimpleResponse<RunInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Patch the run properties.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @param isArchiveEnabled The value that indicates whether archiving is enabled or not.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunInner beginUpdate(String resourceGroupName, String registryName, String runId, Boolean isArchiveEnabled) {
        return beginUpdateAsync(resourceGroupName, registryName, runId, isArchiveEnabled).block();
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginCancelWithResponseAsync(
        String resourceGroupName, String registryName, String runId) {
        final String apiVersion = "2018-09-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCancel(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            registryName,
                            apiVersion,
                            runId,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginCancelAsync(String resourceGroupName, String registryName, String runId) {
        return beginCancelWithResponseAsync(resourceGroupName, registryName, runId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancel an existing run.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runId The run ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginCancel(String resourceGroupName, String registryName, String runId) {
        beginCancelAsync(resourceGroupName, registryName, runId).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<RunInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
