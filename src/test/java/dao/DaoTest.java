package dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import pojo.Student;
import service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-applicationcontext.xml" })
public class DaoTest {
	
	private static Logger logger = Logger.getLogger(DaoTest.class);

    @Resource
    private StudentService studentService = null;
    
    /**
     * 测试查询
     */
    @Test
    public void test1() {
    	Student student = studentService.getStudent(2);
    	List<Student> list = studentService.getAllStudents();
        logger.info("值：" + student.getName());
        logger.info(JSON.toJSONString(student));
        logger.info(JSON.toJSONString(list.size()));
        
    }
    
    
}
