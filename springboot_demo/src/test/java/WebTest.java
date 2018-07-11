import com.leyou.Application;
import com.leyou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zhoumo
 * @datetime 2018/7/11 20:55
 * @desc springboot集成junit测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
//springboot测试注解,指定@SpringBootConfiguration 即springboot的配置类,此处填写的是SpringBoot应用入口类
@SpringBootTest(classes = Application.class)
public class WebTest {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        List list = userService.findUserByExample("幂");
        list.forEach(i-> System.out.println("i = " + i));
    }
}
