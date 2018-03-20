import com.wanghao.oa.user.dto.Department;
import com.wanghao.oa.user.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestCode {
    private static SqlSessionFactory sqlSessionFactory;
    @BeforeClass
    public static void init(){
        //加载mybatis的核心配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //解析mybatis.cfg.xml文档，并且初始化MyBatis（连接池、缓存）
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testCase1(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Department> list = sqlSession.selectList("com.wanghao.oa.user.dto.DepartmentMapper.findUserById", 2);
            for (Department user:list){
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testCase2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("com.wanghao.oa.user.dto.UserMapper.findAllUser");
        System.out.println(list);
    }
}
