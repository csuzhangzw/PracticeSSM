import com.alibaba.fastjson.JSON;
import com.epic.system.dto.User;
import com.epic.system.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试MyBatis是否配置成功.
 * @author zhangzw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private IUserService userService;

    @Test
    public void test() {
        User user = userService.queryByPrimaryKey(null, 10000L);
        logger.info(JSON.toJSONString(user));
    }
}
