package oleg;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class RedissonTest {

    @Rule
    public WireMockRule oceanMockRule = new WireMockRule(options().dynamicHttpsPort());

    @Rule
    public WireMockRule oceanMockRule1 = new WireMockRule(options().dynamicHttpsPort());

    @Test
    public void test() {

    }

}
