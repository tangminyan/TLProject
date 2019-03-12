package baobei.cute.rabbimq.service.impl;

import baobei.cute.rabbimq.producer.Send;
import baobei.cute.rabbimq.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tangminyan on 2019/3/12.
 */
@Service
public class RabbitServiceImpl implements RabbitService {
    @Autowired
    private Send producer;

    @Override
    public void testRabbit() {
        producer.sendMsg("测试");
    }
}
