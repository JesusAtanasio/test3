package com.mycorp;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.VoidDriverManager;

/**
 * Unit test for simple BrowserManagerEnumTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class BrowserManagerEnumTest {

	@Mock
	private ChromeDriver ChromeDriver;

    @Test
    public void shouldCheckOf() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assert.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assert.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( null );
        Assert.assertEquals( BrowserManagerEnum.NONE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof VoidDriverManager );
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof VoidDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }


    @Test
    public void shouldCheckOfChr() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "chrome" );
        Assert.assertEquals( BrowserManagerEnum.CHROME, of );
        Assert.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager );
        Assert.assertTrue( of.getBrowserManager( "2.24" ) instanceof ChromeDriverManager );

        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof ChromeDriver );

    }

    @Test
    public void shouldCheckOfFirefox() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "firefox" );
        Assert.assertEquals( BrowserManagerEnum.FIREFOX, of );
        Assert.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof FirefoxDriver );
    }

    @Test
    public void shouldCheckOfEdge() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "edge" );
        Assert.assertEquals( BrowserManagerEnum.EDGE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof EdgeDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof EdgeDriver );
    }

    @Test
    public void shouldCheckOfIE() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "ie" );
        Assert.assertEquals( BrowserManagerEnum.IE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof InternetExplorerDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof InternetExplorerDriver );
    }

    @Test
    public void shouldCheckOfMarionette() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "marionette" );
        Assert.assertEquals( BrowserManagerEnum.MARIONETTE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof FirefoxDriver );
    }

    @Test
    public void shouldCheckOfOpera() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "opera" );
        Assert.assertEquals( BrowserManagerEnum.OPERA, of );
        Assert.assertTrue( of.getBrowserManager() instanceof OperaDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof OperaDriver );
    }

    @Test
    public void shouldCheckOfPhantomJS() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "phantomjs" );
        Assert.assertEquals( BrowserManagerEnum.PHANTOMJS, of );
        Assert.assertTrue( of.getBrowserManager() instanceof PhantomJsDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver || of.getDriver() instanceof PhantomJSDriver );
    }


    @Test @Ignore
    public void shouldCheckOfChrome() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assert.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assert.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "chrome" );
        Assert.assertEquals( BrowserManagerEnum.CHROME, of );
        Assert.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager );
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof ChromeDriverManager );
        Assert.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }



}
