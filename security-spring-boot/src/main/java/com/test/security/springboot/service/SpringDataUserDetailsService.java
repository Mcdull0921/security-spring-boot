package com.test.security.springboot.service;

import com.test.security.springboot.dao.UserDao;
import com.test.security.springboot.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringDataUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //登录账号
//        System.out.println("username=" + username);
//        // 根据账号去数据库查询...
//        UserDto user = userDao.getUserByUsername(username);
//        if (user == null)
//            return null;
//        //查询用户权限
//        List<String> permissions = userDao.findPermissionsByUserId(user.getId());
//        String[] perarray = new String[permissions.size()];
//        permissions.toArray(perarray);
//        UserDetails userDetails = User.withUsername(user.getUsername()).password(user.getPassword()).authorities(perarray).build();
//        return userDetails;
        UserDetails userDetails = User.withUsername("admin").password("123").authorities("p1").build();
        return userDetails;
    }
}
