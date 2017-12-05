package com.incra.ratpack;

import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;

public class MainModule extends ServletModule {

    @Override
    protected void configureServlets() {

        //configs
        //bind(DatabaseConfig.class).annotatedWith(MySQL.class).to(EnvironmentBasedMySQLConfiguration.class).in(Scopes.SINGLETON);
        //bind(AppConfig.class).to(EnvironmentBasedAppConfig.class).in(Scopes.SINGLETON);

        //bind(DatabricksConfig.class).to(EnvironmentBasedDatabricksConfiguration.class).in(Scopes.SINGLETON);

        //bind(DatabricksClient.class);
        //bind(DatabricksAPI.class);

        //bind(InvocationStatusService.class);
    }
}