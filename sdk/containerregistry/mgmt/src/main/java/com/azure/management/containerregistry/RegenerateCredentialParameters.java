// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RegenerateCredentialParameters model. */
@Fluent
public final class RegenerateCredentialParameters {
    /*
     * Specifies name of the password which should be regenerated -- password
     * or password2.
     */
    @JsonProperty(value = "name", required = true)
    private PasswordName name;

    /**
     * Get the name property: Specifies name of the password which should be regenerated -- password or password2.
     *
     * @return the name value.
     */
    public PasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: Specifies name of the password which should be regenerated -- password or password2.
     *
     * @param name the name value to set.
     * @return the RegenerateCredentialParameters object itself.
     */
    public RegenerateCredentialParameters withName(PasswordName name) {
        this.name = name;
        return this;
    }
}
