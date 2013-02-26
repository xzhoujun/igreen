package com.chinasofti.demo.users.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.chinasofti.demo.users.model.Foo;
import com.chinasofti.demo.users.model.UserBean;

@WebService
public class UserWS {
 public UserBean doSomething1(String username, String address, boolean flag) {
         return new UserBean(username, address, flag);
 }
 //接收一个复杂对象
 public String doSomething2(Foo foo) {
         return foo.toString();
 }
 public static void main(String[] args) {
         //发布一个WebService
		Endpoint.publish("http://172.18.5.99:9999/project/UserWS",
				new UserWS());
 }
}
