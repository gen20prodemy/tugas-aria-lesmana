package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisService {

    //@Autowired
    //private RedisTemplate redisTemplate;

    @Autowired
    RedisDao redisDao;

    //@Cacheable("myCache")
    //public Object getData(String key) {
    //    return redisTemplate.opsForValue().get(key);
    //}
    //public void saveData(String key, Object data) {
    //    redisTemplate.opsForValue().set(key, data);
    //}

    public boolean saveItem(Product p){
        return redisDao.saveItem(p);
    }

    public List<Product> getAll(){
        return redisDao.getAll();
    }
    public Product getItem(int id){
        return redisDao.getItem(id);
    }

    public boolean deleteItem(int id){
        return redisDao.deleteItem(id);
    }
}
