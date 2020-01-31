/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Volume patch resource.
 */
@JsonFlatten
public class VolumePatch extends Resource {
    /**
     * serviceLevel.
     * The service level of the file system. Possible values include:
     * 'Standard', 'Premium', 'Ultra'.
     */
    @JsonProperty(value = "properties.serviceLevel")
    private ServiceLevel serviceLevel;

    /**
     * usageThreshold.
     * Maximum storage quota allowed for a file system in bytes. This is a soft
     * quota used for alerting only. Minimum size is 100 GiB. Upper limit is
     * 100TiB. Specified in bytes.
     */
    @JsonProperty(value = "properties.usageThreshold")
    private Long usageThreshold;

    /**
     * exportPolicy.
     * Set of export policy rules.
     */
    @JsonProperty(value = "properties.exportPolicy")
    private VolumePatchPropertiesExportPolicy exportPolicy;

    /**
     * Get the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @return the serviceLevel value
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @param serviceLevel the serviceLevel value to set
     * @return the VolumePatch object itself.
     */
    public VolumePatch withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value
     */
    public Long usageThreshold() {
        return this.usageThreshold;
    }

    /**
     * Set maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set
     * @return the VolumePatch object itself.
     */
    public VolumePatch withUsageThreshold(Long usageThreshold) {
        this.usageThreshold = usageThreshold;
        return this;
    }

    /**
     * Get set of export policy rules.
     *
     * @return the exportPolicy value
     */
    public VolumePatchPropertiesExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set
     * @return the VolumePatch object itself.
     */
    public VolumePatch withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

}