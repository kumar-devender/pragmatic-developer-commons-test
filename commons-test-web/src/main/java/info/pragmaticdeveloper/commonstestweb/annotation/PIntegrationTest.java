package info.pragmaticdeveloper.commonstestweb.annotation;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FlywayTest
@AutoConfigureEmbeddedDatabase
@ActiveProfiles(profiles = "integration-test")
public @interface PIntegrationTest {

}
