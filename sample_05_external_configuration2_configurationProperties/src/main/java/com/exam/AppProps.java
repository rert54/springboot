package com.exam;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "app")
public class AppProps {

    String name;
    List<User> user;

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
