import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author Administrator
 * date   2018/11/13
 */
public class TestMain {
    public static final void main(String[] args){
        new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
    }
}
