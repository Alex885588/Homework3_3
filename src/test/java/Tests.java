import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NextPage;
import pages.NextPageItem;

public class Tests extends TestBase{
    @Test
    public void testForUrl(){
        HomePage hp=new HomePage();
        NextPage np=new NextPage();
        hp.clicker();
        Assert.assertEquals(hp.getCurrentURL(),"https://www.evoca.am/hy/loans/");
        Assert.assertTrue(np.isLoanTextExists());
    }
    @Test
    public void testFromPageToPage()  {
        HomePage hp=new HomePage();
        NextPage np=new NextPage();
        NextPageItem npi=new NextPageItem();
        hp.clicker();
        Assert.assertEquals(hp.getCurrentURL(),"https://www.evoca.am/hy/loans/");
        np.clicker();
        Assert.assertEquals(np.getCurrentURL(),"https://www.evoca.am/hy/loans/housing-mortgages-for-non-resident-individuals/");
        Assert.assertTrue(npi.isImageExists());
    }
    @Test
    public void testForLogo(){
        HomePage hp=new HomePage();
        NextPage np=new NextPage();
        hp.clicker();
        np.clickLogo();
        Assert.assertTrue(hp.isLogoExists());

    }
    @Test
    public void testForImage(){
        HomePage hp=new HomePage();
        NextPage np=new NextPage();
        hp.clicker();
        Assert.assertTrue(np.isHomeImageExists());
    }
}
