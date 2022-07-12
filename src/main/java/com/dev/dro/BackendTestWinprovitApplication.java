package com.dev.dro;

import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Example API",
        version = "1.0.0"
    ),
    servers = {
        @Server(url = "http://localhost:8080")
    }
)
public class BackendTestWinprovitApplication extends Application {}
