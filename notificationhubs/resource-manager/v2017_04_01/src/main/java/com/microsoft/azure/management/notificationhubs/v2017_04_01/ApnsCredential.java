/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Description of a NotificationHub ApnsCredential.
 */
@JsonFlatten
public class ApnsCredential {
    /**
     * The APNS certificate.
     */
    @JsonProperty(value = "properties.apnsCertificate")
    private String apnsCertificate;

    /**
     * The certificate key.
     */
    @JsonProperty(value = "properties.certificateKey")
    private String certificateKey;

    /**
     * The endpoint of this credential.
     */
    @JsonProperty(value = "properties.endpoint")
    private String endpoint;

    /**
     * The Apns certificate Thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * A 10-character key identifier (kid) key, obtained from your developer
     * account.
     */
    @JsonProperty(value = "properties.keyId")
    private String keyId;

    /**
     * The name of the application.
     */
    @JsonProperty(value = "properties.appName")
    private String appName;

    /**
     * The issuer (iss) registered claim key, whose value is your 10-character
     * Team ID, obtained from your developer account.
     */
    @JsonProperty(value = "properties.appId")
    private String appId;

    /**
     * Provider Authentication Token, obtained through your developer account.
     */
    @JsonProperty(value = "properties.token")
    private String token;

    /**
     * Get the APNS certificate.
     *
     * @return the apnsCertificate value
     */
    public String apnsCertificate() {
        return this.apnsCertificate;
    }

    /**
     * Set the APNS certificate.
     *
     * @param apnsCertificate the apnsCertificate value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withApnsCertificate(String apnsCertificate) {
        this.apnsCertificate = apnsCertificate;
        return this;
    }

    /**
     * Get the certificate key.
     *
     * @return the certificateKey value
     */
    public String certificateKey() {
        return this.certificateKey;
    }

    /**
     * Set the certificate key.
     *
     * @param certificateKey the certificateKey value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * Get the endpoint of this credential.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint of this credential.
     *
     * @param endpoint the endpoint value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the Apns certificate Thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the Apns certificate Thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get a 10-character key identifier (kid) key, obtained from your developer account.
     *
     * @return the keyId value
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set a 10-character key identifier (kid) key, obtained from your developer account.
     *
     * @param keyId the keyId value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the name of the application.
     *
     * @return the appName value
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Set the name of the application.
     *
     * @param appName the appName value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Get the issuer (iss) registered claim key, whose value is your 10-character Team ID, obtained from your developer account.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the issuer (iss) registered claim key, whose value is your 10-character Team ID, obtained from your developer account.
     *
     * @param appId the appId value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get provider Authentication Token, obtained through your developer account.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set provider Authentication Token, obtained through your developer account.
     *
     * @param token the token value to set
     * @return the ApnsCredential object itself.
     */
    public ApnsCredential withToken(String token) {
        this.token = token;
        return this;
    }

}