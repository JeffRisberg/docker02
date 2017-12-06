package com.incra;

import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import com.incra.common.base.binding.MySQL;
import com.incra.common.base.config.AppConfig;
import com.incra.common.base.config.DatabaseConfig;
import com.incra.common.base.services.config.EnvironmentBasedAppConfig;
import com.incra.common.base.services.config.EnvironmentBasedMySQLConfiguration;
import com.incra.services.DefaultIncidentService;
import com.incra.services.DefaultUserService;
import com.incra.services.IncidentService;
import com.incra.services.UserService;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
public class MainModule extends ServletModule {

    @Override
    protected void configureServlets() {

        //configs
        bind(DatabaseConfig.class).annotatedWith(MySQL.class).to(EnvironmentBasedMySQLConfiguration.class).in(Scopes.SINGLETON);
        bind(AppConfig.class).to(EnvironmentBasedAppConfig.class).in(Scopes.SINGLETON);

        bind(UserService.class).to(DefaultUserService.class).in(Scopes.SINGLETON);
        bind(IncidentService.class).to(DefaultIncidentService.class).in(Scopes.SINGLETON);
    }
}