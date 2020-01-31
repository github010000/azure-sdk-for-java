/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.servicebus.v2017_04_01.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in EventHubs.
 */
public class EventHubsInner {
    /** The Retrofit service to perform REST calls. */
    private EventHubsService service;
    /** The service client containing this operation class. */
    private ServiceBusManagementClientImpl client;

    /**
     * Initializes an instance of EventHubsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EventHubsInner(Retrofit retrofit, ServiceBusManagementClientImpl client) {
        this.service = retrofit.create(EventHubsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EventHubs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EventHubsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicebus.v2017_04_01.EventHubs listByNamespace" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ServiceBus/namespaces/{namespaceName}/eventhubs")
        Observable<Response<ResponseBody>> listByNamespace(@Path("resourceGroupName") String resourceGroupName, @Path("namespaceName") String namespaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicebus.v2017_04_01.EventHubs listByNamespaceNext" })
        @GET
        Observable<Response<ResponseBody>> listByNamespaceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EventhubInner&gt; object if successful.
     */
    public PagedList<EventhubInner> listByNamespace(final String resourceGroupName, final String namespaceName) {
        ServiceResponse<Page<EventhubInner>> response = listByNamespaceSinglePageAsync(resourceGroupName, namespaceName).toBlocking().single();
        return new PagedList<EventhubInner>(response.body()) {
            @Override
            public Page<EventhubInner> nextPage(String nextPageLink) {
                return listByNamespaceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventhubInner>> listByNamespaceAsync(final String resourceGroupName, final String namespaceName, final ListOperationCallback<EventhubInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByNamespaceSinglePageAsync(resourceGroupName, namespaceName),
            new Func1<String, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(String nextPageLink) {
                    return listByNamespaceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventhubInner&gt; object
     */
    public Observable<Page<EventhubInner>> listByNamespaceAsync(final String resourceGroupName, final String namespaceName) {
        return listByNamespaceWithServiceResponseAsync(resourceGroupName, namespaceName)
            .map(new Func1<ServiceResponse<Page<EventhubInner>>, Page<EventhubInner>>() {
                @Override
                public Page<EventhubInner> call(ServiceResponse<Page<EventhubInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventhubInner&gt; object
     */
    public Observable<ServiceResponse<Page<EventhubInner>>> listByNamespaceWithServiceResponseAsync(final String resourceGroupName, final String namespaceName) {
        return listByNamespaceSinglePageAsync(resourceGroupName, namespaceName)
            .concatMap(new Func1<ServiceResponse<Page<EventhubInner>>, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(ServiceResponse<Page<EventhubInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByNamespaceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
    ServiceResponse<PageImpl<EventhubInner>> * @param resourceGroupName Name of the Resource group within the Azure subscription.
    ServiceResponse<PageImpl<EventhubInner>> * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EventhubInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EventhubInner>>> listByNamespaceSinglePageAsync(final String resourceGroupName, final String namespaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (namespaceName == null) {
            throw new IllegalArgumentException("Parameter namespaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByNamespace(resourceGroupName, namespaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EventhubInner>> result = listByNamespaceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EventhubInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EventhubInner>> listByNamespaceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EventhubInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EventhubInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EventhubInner&gt; object if successful.
     */
    public PagedList<EventhubInner> listByNamespaceNext(final String nextPageLink) {
        ServiceResponse<Page<EventhubInner>> response = listByNamespaceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<EventhubInner>(response.body()) {
            @Override
            public Page<EventhubInner> nextPage(String nextPageLink) {
                return listByNamespaceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventhubInner>> listByNamespaceNextAsync(final String nextPageLink, final ServiceFuture<List<EventhubInner>> serviceFuture, final ListOperationCallback<EventhubInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByNamespaceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(String nextPageLink) {
                    return listByNamespaceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventhubInner&gt; object
     */
    public Observable<Page<EventhubInner>> listByNamespaceNextAsync(final String nextPageLink) {
        return listByNamespaceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<EventhubInner>>, Page<EventhubInner>>() {
                @Override
                public Page<EventhubInner> call(ServiceResponse<Page<EventhubInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EventhubInner&gt; object
     */
    public Observable<ServiceResponse<Page<EventhubInner>>> listByNamespaceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByNamespaceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<EventhubInner>>, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(ServiceResponse<Page<EventhubInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByNamespaceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
    ServiceResponse<PageImpl<EventhubInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EventhubInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EventhubInner>>> listByNamespaceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByNamespaceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EventhubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EventhubInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EventhubInner>> result = listByNamespaceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EventhubInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EventhubInner>> listByNamespaceNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EventhubInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EventhubInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}