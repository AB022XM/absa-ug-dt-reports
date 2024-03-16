package com.corp.dsarena.billpayments;

import com.corp.dsarena.billpayments.config.AsyncSyncConfiguration;
import com.corp.dsarena.billpayments.config.EmbeddedElasticsearch;
import com.corp.dsarena.billpayments.config.EmbeddedKafka;
import com.corp.dsarena.billpayments.config.EmbeddedRedis;
import com.corp.dsarena.billpayments.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AbsaUgdtReportsApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
