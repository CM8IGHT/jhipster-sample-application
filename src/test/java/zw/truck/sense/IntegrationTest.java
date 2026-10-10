package zw.truck.sense;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import zw.truck.sense.config.AsyncSyncConfiguration;
import zw.truck.sense.config.DatabaseTestcontainer;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JhipsterSampleApplicationApp.class,
        AsyncSyncConfiguration.class,
        zw.truck.sense.config.JacksonHibernateConfiguration.class,
        DatabaseTestcontainer.class,
    }
)
public @interface IntegrationTest {}
