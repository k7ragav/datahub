package com.linkedin.datahub.upgrade.config;

import com.linkedin.gms.factory.system_telemetry.OpenTelemetryBaseFactory;
import io.datahubproject.metadata.context.TraceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenTelemetryConfig extends OpenTelemetryBaseFactory {

  @Override
  protected String getApplicationComponent() {
    return "datahub-upgrade";
  }

  @Bean
  @Override
  protected TraceContext traceContext() {
    return super.traceContext();
  }
}
