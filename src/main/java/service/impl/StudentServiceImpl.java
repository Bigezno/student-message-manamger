package service.impl;

import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Student;
import service.StudentService;

import java.util.List;

/**
 * 因为没有在spring的文件中显式的声明userService实现类，直接通过getBean得到 userService 会找不到
 *  需要显式配置 @Service ("userService")，指定bean的名称
 *  相当与<bean id="userService" class="service.impl.UserServiceImpl"></bean>
 */
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	// 注入dao接口实现类实例  
    // @Resource、@Autowired两种注入方式都可以  
    @Autowired  
	private StudentDao studentDao;
	
	@Override
	public Student getStudent(int id) {
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = studentDao.getAllStudents();
		return list;
	}

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}


	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

}
