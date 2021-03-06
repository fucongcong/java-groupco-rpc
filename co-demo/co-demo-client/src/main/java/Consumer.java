import co.demo.server.DemoService;
import co.server.CoServer;
import co.server.Services;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:app.xml");
        context.start();

        DemoService demoService = Services.getBean("demoService");
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
