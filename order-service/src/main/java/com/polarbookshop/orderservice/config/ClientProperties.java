package com.polarbookshop.orderservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.validation.constraints.NotNull;
import java.net.URI;

@ConfigurationProperties(prefix = "polar")
@ConfigurationPropertiesScan
public record ClientProperties (
        @NotNull
        URI catalogServiceUri
) {}
