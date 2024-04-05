package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public class RedisDao {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redTemp;

    private static final String KEY="PRODUCT";


    public boolean saveItem(Product p){
        try {
            redTemp.opsForValue().set(KEY+":"+String.valueOf(p.getId()),p); //user id bisa disave sbg angka atau string
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public List<Product> getAll(){
        List<Product> users;
        users = new ArrayList<Product>();
        Set<String> keys = redTemp.keys(KEY+"*");
        for (String k: keys) {
            users.add((Product) redTemp.opsForValue().get(k));
        }

        return users;
    }

    public Product getItem(int id){
        Product users;
        users = (Product) redTemp.opsForValue().get(KEY+":"+String.valueOf(id));//kalau id di save sbg angka tapi dicari sbg string gk nemu
        return users;
    }

    public boolean deleteItem(int id) {
        try {
            redTemp.delete(KEY+":"+String.valueOf(id));
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
