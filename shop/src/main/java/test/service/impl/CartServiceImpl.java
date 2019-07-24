package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TCartMapper;
import test.entity.TCart;
import test.service.CartService;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    TCartMapper tCartMapper;

}
