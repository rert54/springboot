package com.exam;

import org.springframework.boot.context.properties.ConfigurationProperties;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@ConfigurationProperties(prefix = "app")
public class AppProps {

    @NotBlank
    String name;
    List<User> user;
    List<String> phones;
    List<String> emails;
    String message;
    @Min(1) @Max(10)
    int poolSize;

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<User> getUsers() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppProps{" +
                "name='" + name + '\'' +
                ", user=" + user +
                ", phones=" + phones +
                ", emails=" + emails +
                ", message='" + message + '\'' +
                ", poolSize=" + poolSize +
                '}';
    }

    //중첩 클래스로 가져온다
    //"user":[{"name:""R2"},"age":20]
    //여기서 name과 age를 저장할 때 사용
    public static class User{
        String name;
        int age;
        //게터세터
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }//end user


}//end class
