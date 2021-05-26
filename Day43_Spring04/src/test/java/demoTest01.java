import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class demoTest01 {
    @Autowired
    private DataSource c3p0;

    @Autowired
    private  DataSource druid;
    @Autowired
    private  DataSource spring;

    @Test
    public void Test01(){
        System.out.println("c3p0 = " + c3p0);
        System.out.println("===============");
        System.out.println("druid = " + druid);
        System.out.println("=======================");
        System.out.println("spring = " + spring);
    }
}
