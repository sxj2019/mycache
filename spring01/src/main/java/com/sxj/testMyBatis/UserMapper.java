package com.sxj.testMyBatis;

import com.sxj.testMyBatis.domain.User;

public interface UserMapper {

    User selectUser(long id);
}
