import com.vanvan.mapper.EmpMapper;
import com.vanvan.po.Emp;
import com.vanvan.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSqlSession();
        System.out.println(session);

        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        System.out.println(empMapper);

        Emp emp = empMapper.selectEmp(7369);
        System.out.println(emp.getEname());
        System.out.println(emp.getEmpno()+"\t" + emp.getEname()+"\t"+emp.getHiredate());

        List<Emp> empList = empMapper.selectAllEmp();
        for(Emp e: empList){
            System.out.println(e.getEmpno()+"\t"+e.getEname()+"\t"+e.getHiredate());
        }

        session.close();
    }

    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSqlSession();
        System.out.println(session);

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        System.out.println(mapper);

        List<Emp> empList = mapper.selectEmpByName("S");

        for (Emp e: empList){
            System.out.println(e.getEmpno()+"\t"+e.getEname()+"\t"+e.getHiredate());
        }

        session.close();
    }

    @Test
    public void test3(){
        SqlSession session = MybatisUtils.getSqlSession();
        System.out.println(session);

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        System.out.println(mapper);


    }
}
