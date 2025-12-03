package org.brunobranchi;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadinessCheck implements HealthCheck {

    @RestClient
    private StarWarsService starWarsService;

    @Override
    public HealthCheckResponse call() {
        if (starWarsService.getStarships().contains(StarWarsService.MSS_ERROR)) {
            return HealthCheckResponse.down("Errow");
        } else {
            return HealthCheckResponse.up("Healthy");
        }
    }
}
