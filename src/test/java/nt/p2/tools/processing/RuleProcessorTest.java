package nt.p2.tools.processing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RuleProcessorTest {

    private RuleProcessor firstRuleProcessor;
    private RuleProcessor secondRuleProcessor;

    @Before
    public void setUp() {
        firstRuleProcessor = new RuleProcessor("${repoUrl}/plugins/${id}_${version}.jar", "(& (classifier=osgi.bundle))");
        secondRuleProcessor = new RuleProcessor("${repoUrl}/plugins/${id}_${version}.jar.pack.gz", "(& (classifier=osgi.bundle) (format=packed))");
    }

    @Test
    public void testArtifactOutput() {
        Map properties = new HashMap();
        properties.put("id", "my.bundle");
        properties.put("version", "1.0.0");
        properties.put("fake", "fake");
        properties.put("repoUrl", ".");

        Assert.assertNull(firstRuleProcessor.getOutput(properties));

        properties.put("classifier", "osgi.bundle");
        Assert.assertEquals("./plugins/my.bundle_1.0.0.jar", firstRuleProcessor.getOutput(properties));

        Assert.assertNull(secondRuleProcessor.getOutput(properties));

        properties.put("format", "packed");
        Assert.assertEquals("./plugins/my.bundle_1.0.0.jar.pack.gz", secondRuleProcessor.getOutput(properties));
    }
}
