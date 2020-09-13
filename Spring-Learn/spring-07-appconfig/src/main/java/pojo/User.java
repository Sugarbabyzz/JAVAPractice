package pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 这个注解，就是说明这个类被Spring接管，注册到了容器中
@Component
public class User {

    @Value("Sugar")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
