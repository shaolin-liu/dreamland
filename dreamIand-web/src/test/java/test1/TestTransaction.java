package test1;

import com.neo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 事务测试
 *
 * @author: Neo.lin
 * @date: 2018-09-10 下午4:11
 */
@ContextConfiguration(locations = {"classpath:spring-myatis"})
public class TestTransaction extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;
}
