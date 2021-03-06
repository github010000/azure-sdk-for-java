/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.OperationDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.OperationDisplayDefinition;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.OperationServiceSpecificationDefinition;

class OperationDefinitionImpl extends WrapperImpl<OperationDefinitionInner> implements OperationDefinition {
    private final ContainerRegistryManager manager;
    OperationDefinitionImpl(OperationDefinitionInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplayDefinition display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.inner().serviceSpecification();
    }

}
