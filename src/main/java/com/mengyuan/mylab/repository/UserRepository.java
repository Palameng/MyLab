package com.mengyuan.mylab.repository;

import com.mengyuan.mylab.pojo.RedisTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<RedisTest, Long> {
    List<RedisTest> findByName(String name);
}
